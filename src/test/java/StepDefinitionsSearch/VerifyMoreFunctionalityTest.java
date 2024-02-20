package StepDefinitionsSearch;

import PageObjects.Search.VerifyMoreFunctionality;
import Universal.BrowserClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class VerifyMoreFunctionalityTest extends BrowserClass {
    WebDriver driver = setupBrowser();
    VerifyMoreFunctionality VF = new VerifyMoreFunctionality(driver);
    @Given("the user navigattes to the home page")
    public void theUserNavigattesToTheHomePage() {
        System.out.println(driver.getTitle());
    }
    @And("the user clicks on the search icon")
    public void theUserClicksOnTheSearchIcon() {
        this.VF.setSearchIcon();
    }
    @When("The Web page allows the users type desired product")
    public void theWebPageAllowsTheUsersTypeDesiredProduct() {
        this.VF.setTypebar();
    }


    @Then("The user clicks on the more icon")
    public void theUserClicksOnTheMoreIcon() {
        this.VF.setMoreIcon();
    }



}
