package StepDefintionsAddProduct;

import PageObjects.AddProducts.ThroughShopMenMethod;
import Universal.BrowserClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ShopmenTest extends BrowserClass {
    WebDriver driver = setupBrowser();
    ThroughShopMenMethod SM = new ThroughShopMenMethod(driver);


}

