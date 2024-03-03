package StepDefinitionsLogin;

import PageObjects.Login.Validcred;
import Universal.BrowserClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginSteps extends BrowserClass {

    WebDriver driver= setupBrowser();
    Validcred vc = new Validcred(driver);


    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        vc.setClickregIcon();
    }


    @When("I enter valid username and password")
    public void iEnterValidUsernameAndPassword() {
        vc.setCustomeremail();
        vc.setCustomerpassword();

    }


    @And("I click the sign-in button")
    public void iClickTheSignInButton () {
        vc.setClicksignin();
    }

    @Then("I should be logged in")
    public void iShouldBeLoggedIn () {
        Assert.assertEquals(driver.getTitle(),"Challenge");
    }



}