package Test.AddProducts;

import PageObjects.AddProducts.ThroughSearchMethod;
import Universal.BrowserClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ThroughSearchMethodTest extends BrowserClass {
    @Test
    public void addproducts(){
        WebDriver driver = setupBrowser();
        ThroughSearchMethod sm = new ThroughSearchMethod(driver);
        sm.setSearchIcon();
        sm.setTypebar();
        sm.setTextlist();
        sm.setProductclick();
        sm.setAddproductButton();
        sm.setAddToCart();
    }
}
