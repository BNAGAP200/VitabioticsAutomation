package StepDefinitionAddProduct;

import PageObjects.AddProducts.ThroughSearchMethod;

import Universal.BrowserClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class ThroughSearchMethodTest extends BrowserClass {
    WebDriver driver = setupBrowser();
    ThroughSearchMethod SM = new ThroughSearchMethod(driver);

        @Given("The user navigates to the Vitabiotics Home page")
        public void HomePage() {
            System.out.println(driver.getTitle());
        }

        @And("The user click on the search icon")
        public void theUserClicksOnTheOneOfTheBrand() {
            SM.setSearchIcon();
        }

        @And("Web page allow the user to type search bar")
        public void theUserClicksOnTheShopByRangeButton() {
            SM.setTypebar();
        }

        @And("The Web page allows the users to click on desired product")
        public void theUserClickOnTheViewProductButton() {
            SM.setProductclick();
        }

        @When("The user clicks on the Add to Cart button")
        public void theUserClickOnTheAddSymbol() {
           SM.setAddproductButton();
SM.setAddToCart();
        }


        @Then("A side window will appear on the right side")
        public void theUserClicksOnTheShopKidsButton() {
SM.setAddSymbol();
            SM.setWindow();
            SM.SetViewall();
            SM.SetListall();
        }
    }


