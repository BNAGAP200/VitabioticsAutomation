package StepDefintionsToolTip;

import PageObjects.ToolTip.ToolTip;
import Universal.BrowserClass;
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

    @Then("List of product should show")
    public void listOfProductShouldShow() {
        TP.setAllproducts();
    }
}
