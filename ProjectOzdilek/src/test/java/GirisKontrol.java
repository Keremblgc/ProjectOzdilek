import com.thoughtworks.gauge.Step;
import org.apache.commons.logging.Log;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.logging.LogManager;
import java.util.logging.Logger;


public class GirisKontrol extends BasePage{
    @Step("<id> Giriş Sayfası Kontrol")
    public void open(String id) {

        Assert.assertTrue(appiumDriver.findElement(By.id(id)).isDisplayed());
        logger.info("Giriş Ekranı Açıldı");
    }


}
