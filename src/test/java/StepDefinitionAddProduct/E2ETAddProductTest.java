package StepDefinitionAddProduct;

import PageObjects.AddProducts.E2EAddproduct;
import Universal.BrowserClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class E2ETAddProductTest  extends BrowserClass {
    WebDriver driver = setupBrowser();
E2EAddproduct e2e = new E2EAddproduct(driver);

    @Given("User on the given Home Page")
    public void userOnTheGivenHomePage() {
        System.out.println(driver.getTitle());
    }

    @And("User on the Login Page")
    public void userOnTheLoginPage() {
        e2e.login();
    }


    @And("User On the Search Bar")
    public void userOnTheSearchBar() {
        e2e.Search();

    }

    @When("User on the product page")
    public void userOnTheProductPage() {
        e2e.Product();

        e2e.productAssert();
        e2e.cartvalidation();
    }

    @And("User on the Basket page")
    public void userOnTheBasketPage() {
        e2e.Basket();
    }
}
