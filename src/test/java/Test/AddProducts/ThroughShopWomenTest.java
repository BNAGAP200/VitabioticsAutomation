package Test.AddProducts;

import PageObjects.AddProducts.ThroughShopWomenMethod;
import Universal.BrowserClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ThroughShopWomenTest extends BrowserClass {
    @Test
    public void testAddProductToCart() {
        WebDriver driver = setupBrowser();
        ThroughShopWomenMethod shopWomenMethod = new ThroughShopWomenMethod(driver);
        shopWomenMethod.setShopWomen();
        shopWomenMethod.setscrollpage();
        shopWomenMethod.setClickproduct1();
        shopWomenMethod.setscrollpage();
        shopWomenMethod.setClickproduct2();

        // Other test steps...
    }

}
