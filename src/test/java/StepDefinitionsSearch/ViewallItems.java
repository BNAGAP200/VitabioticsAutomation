package StepDefinitionsSearch;

import PageObjects.Search.ViewAllItems;
import Universal.BrowserClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class ViewallItems extends BrowserClass {
    WebDriver driver = setupBrowser();
    ViewAllItems VA = new ViewAllItems(driver);
    @Given("the user navigates to the Home page")
    public void theUserNavigatesToTheHomePage() {
        System.out.println(driver.getTitle());
    }

    @When("the User clicks on the search icon")
    public void theUserClicksOnTheSearchIcon() {

      this.VA.setSearchIcon();
    }

    @And("the Web page allows the user to type desired product")
    public void theWebPageAllowsTheUserToTypeDesiredProduct() {
       this.VA.setTypebar("Vitamins");
    }



    @Then("the system should display the related results")
    public void theSystemShouldDisplayTheRelatedResults() {
        VA.setViewallitems();
    }
}




