import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

public class UrunKontrol extends BasePage{

    @Step("<id> Ürün Sayfası Kontrol")
    public void open(String id) {

        Assert.assertTrue(appiumDriver.findElement(By.id(id)).isDisplayed());
        logger.info("Ürün Sayfası Açıldı");
    }
}
