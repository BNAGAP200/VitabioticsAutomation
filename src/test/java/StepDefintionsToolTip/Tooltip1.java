package StepDefintionsToolTip;

import PageObjects.ToolTip.ToolTip;
import Universal.BrowserClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class Tooltip1 extends BrowserClass {
    WebDriver driver = setupBrowser();
    ToolTip TP = new ToolTip(driver);

    @Given("User on the Home page")
    public void theUserNavigatesToTheHomePage() {
        System.out.println(driver.getTitle());
    }

    @When("User hover the mouse into element")
    public void userHoverTheMouseIntoElement() {
        TP.setTooltipopn();

    }

    @And("List of product should show")
    public void listOfProductShouldShow() {
        TP.setAllproducts();
    }

    @And("User hover the mouse to Women Section will show the list of products")
    public void userHoverTheMouseToWomenSectionWillShowTheListOfProducts() {
        TP.setWomenProduct();
    }

    @And("User hover the mouse to men Section will show the list of products")
    public void userHoverTheMouseToMenSectionWillShowTheListOfProducts() {
        TP.setMensection();
    }

    @And("User hover the mouse to kids Section will show the list of products")
    public void userHoverTheMouseToKidsSectionWillShowTheListOfProducts() {
        TP.setKidssection();
    }

    @Then("User hover the mouse to older people Section will show the list of products")
    public void userHoverTheMouseToOlderPeopleSectionWillShowTheListOfProducts() {
        TP.setAdult50section();
    }
}
