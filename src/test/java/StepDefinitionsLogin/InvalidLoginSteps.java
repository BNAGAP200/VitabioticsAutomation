package StepDefinitionsLogin;

import PageObjects.Login.Invalidcred;
import Universal.BrowserClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class InvalidLoginSteps extends BrowserClass {
    WebDriver driver = setupBrowser();
    Invalidcred inv = new Invalidcred(driver);
    @Given("I am on the Login page")
    public void iAmOnTheLoginPage() {
        Invalidcred inv = new Invalidcred(driver);


    }

    @And("I enter reg button")
    public void iEnterRegButton() {
        inv.setClickregIcon();
    }

    @When("I enter Invalid username and Invalid Password")
    public void iEnterInvalidUsernameAndInvalidPassword() {
        inv.setCustomeremail("Unknowm@123");
        inv.setCustomerpassword("Unknown12");
    }

    @Then("I click sign-in button")
    public void iClickSignInButton() {
        inv.setClicksignin();
    }
}
