package StepDefinitionAddProduct;

import PageObjects.AddProducts.ShopMenE2EFunctionality;
import Universal.BrowserClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class ShopmenE2ETest extends BrowserClass {

    WebDriver driver = setupBrowser();

    ShopMenE2EFunctionality SMe2e = new ShopMenE2EFunctionality(driver);

    @Given("User Landed on the Home page")
    public void Homepage() {
        System.out.println(driver.getTitle());
    }

    @And("User click on the Shop men Button")
    public void userClickOnTheShopMenButton() {
        SMe2e.setShopmenbutton();

    }

    @And("User on the Product Page")
    public void userOnTheProductPage() {
        SMe2e.productspage();
    }

    @And("User Clicks on the Gluten free Radio button")
    public void userClicksOnTheGlutenFreeRadioButton() {
        SMe2e.setGlutenfreebtn();
    }


    @And("User Clicks on the VeganProduct button")
    public void userClicksOnTheVeganProductButton() {
        SMe2e.setVeganbtn();
    }

    @And("User Clicks on the Vegeterian button")
    public void userClicksOnTheVegeterianButton() {
        SMe2e.setVegeterianbtn();
    }

    @Then("User Clicks on the Brand button")
    public void userClicksOnTheBrandButton() {
        SMe2e.setBrandsBtn();
        SMe2e.setBuynow1();

       SMe2e.setItem();
    }}

