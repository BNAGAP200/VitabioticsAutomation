package StepDefinitionsLogin;

import PageObjects.Login.Nocred;
import Universal.BrowserClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class NodetailsLoginsteps extends BrowserClass {
    WebDriver driver = setupBrowser();
    Nocred NC = new Nocred(driver);
    @Given("User On the Home Page")
    public void userOnTheHomePage() {
        System.out.println(driver.getTitle());
    }

    @And("User Click on the RegButton")
    public void userClickOnTheRegButton() {
        NC.setClickregIcon();

    }


    @When("User Enter No username and No Password")
    public void userEnterNoUsernameAndNoPassword() {
        NC.setCustomeremail();
        NC.setCustomerpassword();
    }

    @Then("User click on the Signin Button")
    public void userClickOnTheSigninButton() {
        NC.setClicksignin();
    }
}
