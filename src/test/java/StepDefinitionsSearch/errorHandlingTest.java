package StepDefinitionsSearch;

import PageObjects.Search.Errorhandling;
import Universal.BrowserClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;


public class errorHandlingTest extends BrowserClass {
    WebDriver driver = setupBrowser();
    Errorhandling EH = new Errorhandling(driver);
    @Given("the User navigates to the Home Page")
    public void theUserNavigatesToTheHomePage() {
        System.out.println(driver.getTitle());
    }

    @When("the User clicks on the Search icon")
    public void theUserClicksOnTheSearchIcon() {
        EH.setSearchIcon();
    }

    @And("the Web page allows the user to input invalid characters")
    public void theWebPageAllowsTheUserToInputInvalidCharacters() {
        EH.setTypebar();
    }

    @Then("the system displays the appropriate error message")
    public void theSystemDisplaysTheAppropriateErrorMessage() {
        EH.setErrormsg();
    }
}
