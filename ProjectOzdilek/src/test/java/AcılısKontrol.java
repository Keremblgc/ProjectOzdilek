import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

public class AcılısKontrol extends BasePage {
    @Step("<id>Açılış Sayfası Kontrol")
    public void open(String id) {

        Assert.assertTrue(appiumDriver.findElement(By.id(id)).isDisplayed());
        logger.info("Uygulama Açıldı");
    }
}

