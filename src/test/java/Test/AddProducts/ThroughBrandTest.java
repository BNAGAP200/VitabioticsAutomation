package Test.AddProducts;

import PageObjects.AddProducts.ThroughShopBrand;
import PageObjects.AddProducts.Throughshopkids;
import Universal.BrowserClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ThroughBrandTest extends BrowserClass {
    @Test
    public void shopbybrand(){
        WebDriver driver = setupBrowser();
        ThroughShopBrand SB = new ThroughShopBrand(driver);
        SB.setPregnacareBrand();
    }
}
