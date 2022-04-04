import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.List;
import java.util.Random;



public class BasePage extends BaseTest {

    @Step("<int> saniye kadar bekle")
    public void waitForsecond(int s) throws InterruptedException {
        Thread.sleep(1000 * s);
    }

    @Step("<id> elemetin sayfada gorunur olduğunu kontrol et ve tıkla")
    public void findByelementEndclick(String id) {
        MobileElement element = appiumDriver.findElement(By.id(id));
        if (element.isDisplayed()) {
            element.click();
        } else {
            System.out.println("Kontrol edilen element Görünür olmadı");
        }
    }

    @Step("<xpath> xpath'li elemente tıkla")
    public void clickElementByxpath(String xpath) {
        MobileElement element = appiumDriver.findElement(By.xpath(xpath));
        element.click();
    }

    @Step("sayfa boyunca scroll et")
    public void ScrollRandomPos() {
        Dimension dimension = appiumDriver.manage().window().getSize();
        int start_x = (int) (dimension.width * 0.5);
        int start_y = (int) (dimension.height * 0.8);

        int end_x = (int) (dimension.width * 0.2);
        int end_y = (int) (dimension.height * 0.2);

        TouchAction touch = new TouchAction(appiumDriver);
        touch.press(PointOption.point(start_x, start_y))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(end_x, end_y)).release().perform();
    }

    @Step("<Key> xpath'te bulunan sayfada görünen tüm ürünleri bul ve rastgele bir ürüne tıkla")
    public void randomEkle(String Key) {
        List<MobileElement> productList = appiumDriver.findElementsByXPath(Key);
        int size = productList.size();
        Random rnd = new Random();
        int randNum = rnd.nextInt(size);
        productList.get(randNum).click();


    }
    @Step("<id> İd'li elemente <text> değerini yaz")
    public void SendkeyElementByid(String id, String text) {
        appiumDriver.findElement(By.id(id)).sendKeys(text);
        //sendKeys(By.id(Key),keyword);
        System.out.println(id + "Elementine tıklandı");
    }

    public WebElement findElement(By by) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }
}
