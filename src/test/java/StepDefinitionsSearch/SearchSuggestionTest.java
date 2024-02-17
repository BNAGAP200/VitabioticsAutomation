package StepDefinitionsSearch;

import PageObjects.Search.SearchSuggestions;
import Universal.BrowserClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class SearchSuggestionTest extends BrowserClass {
    WebDriver driver = setupBrowser();
    SearchSuggestions SS = new SearchSuggestions(driver);

    @Given("The user navigates to the Home page")
    public void theusernavigatestotheHomepage() {
        System.out.println(driver.getTitle());

    }

    @When("The user clicks on the Search icon")
    public void theUserClicksOnTheSearchIcon() {
        SS.setSearchIcon();
    }

    @And("The web page allows the users to type {string}")
    public void theWebPageAllowsTheUsersToType(String product) {
        SS.setTypebar(product);
    }

    @Then("the system displays the suggested products based on the search query")
    public void theSystemDisplaysTheSuggestedProductsBasedOnTheSearchQuery() {
        SS.setSuggestionlists();
    }

}

