package Test.AddProducts;

import PageObjects.AddProducts.ThroughShopMenMethod;
import Universal.BrowserClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ThroughShopmenMethodTest extends BrowserClass {
    @Test
    public void searchmethod(){
        WebDriver driver = setupBrowser();
        ThroughShopMenMethod sm = new ThroughShopMenMethod(driver);

       sm.setShopmenbutton();
        sm.setClickthefirstproduct();
        sm.setMinicartproductviewer();
    }
}
