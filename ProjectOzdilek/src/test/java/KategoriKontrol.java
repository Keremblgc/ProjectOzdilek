import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

public class KategoriKontrol extends BasePage{
    @Step("<xpath>Kategori Sayfası Kontrol")
    public void open(String xpath) {

        Assert.assertTrue(appiumDriver.findElement(By.xpath(xpath)).isDisplayed());
        logger.info("Kategori Sayfası Açıldı");
    }
}
