package StepDefinitionsSearch;

import PageObjects.Search.SearchBar;
import Universal.BrowserClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class SearchBarTest extends BrowserClass {
    WebDriver driver = setupBrowser();
    SearchBar SB = new SearchBar(driver);
    @Given("User on the home page")
    public void userOnTheHomePage() {
        System.out.println(driver.getTitle());
    }

    @When("User click on the search icon")
    public void userClickOnTheSearchIcon() {
        SB.setSearchIcon();
    }

    @And("Web page allows the user to type")
    public void webPageAllowsTheUserToType() {
        System.out.println(driver.getTitle());
    }

    @Then("User type as Vitamins")
    public void userTypeAsVitamins() {
        System.out.println(driver.getTitle());
    }
}
