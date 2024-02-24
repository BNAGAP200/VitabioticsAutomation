package StepDefinitionAddProduct;

import PageObjects.AddProducts.ThroughShopBrand;
import Universal.BrowserClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class ThroughShopBrandTest extends BrowserClass {
    WebDriver driver = setupBrowser();
   ThroughShopBrand SB = new ThroughShopBrand(driver);

    @Given("The User landed on the home page")
    public void theUserLandedOnTheHomePage() {
        System.out.println(driver.getTitle());

    }

    @And("The user clicks on the one of the brand")
    public void theUserClicksOnTheOneOfTheBrand() {
        SB.setPregnacareBrand();
    }

    @And("The user clicks on the Shop By range Button")
    public void theUserClicksOnTheShopByRangeButton() {
        SB.setShopbyrange();
    }

    @When("The user click on the View product button")
    public void theUserClickOnTheViewProductButton() {
        SB.setViewproduct();
    }

    @Then("The user click on the Add symbol")
    public void theUserClickOnTheAddSymbol() {
        SB.setAddSymbol();
        SB.setAddtocartbutton();

    }


    @And("The user clicks on the shop kids button")
    public void theUserClicksOnTheShopKidsButton() {
    }
}
