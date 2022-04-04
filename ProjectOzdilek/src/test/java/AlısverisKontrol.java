import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

public class AlısverisKontrol extends BasePage{
    @Step("<id>Uygulamaya giriş yapıldı mı")
    public void open(String id) {

        Assert.assertTrue(appiumDriver.findElement(By.id(id)).isDisplayed());
        logger.info("Giriş başarılı");
    }
}

