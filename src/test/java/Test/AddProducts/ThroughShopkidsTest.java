package Test.AddProducts;

import PageObjects.AddProducts.Throughshopkids;
import Universal.BrowserClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


    public class ThroughShopkidsTest extends BrowserClass {
        //@Test(dataProvider = "shopkids")
        @Test
        public void addproducts() {
            WebDriver driver = setupBrowser();
            Throughshopkids sk = new Throughshopkids(driver);
            sk.setshopkids();
            sk.setCondition();
        }

        }

