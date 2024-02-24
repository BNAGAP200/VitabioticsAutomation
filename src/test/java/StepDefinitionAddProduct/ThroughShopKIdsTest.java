package StepDefinitionAddProduct;

import PageObjects.AddProducts.Throughshopkids;
import Universal.BrowserClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.sql.SQLOutput;


public class ThroughShopKIdsTest extends BrowserClass {
    WebDriver driver =setupBrowser();
   Throughshopkids SK = new Throughshopkids(driver);
    @Given("The user navigates on the Home page")
    public void theUserNavigatesOnTheHomePage() {
        System.out.println(driver.getTitle());
    }

    @And("The user navigated and click on the shopkids button")
    public void theUserNavigatedAndClickOnTheShopkidsButton() {
        SK.setshopkids();
    }

    @And("The user clicks on the first product")
    public void theUserClicksOnTheFirstProduct() {
        SK.setCondition();
      //  SK.setAddProduct();

    }
    @When("The user clicks on the Add to cart Button")
    public void theUserClicksOnTheAddToCartButton() {
        SK.setAddProduct();
        System.out.println(driver.getTitle());
    }



    @Then("A side pop up will appear")
    public void aSidePopUpWillAppear() {
        SK.setProductName();
        Assert.assertEquals("Wellbaby Multi-vitamin Liquid",driver.findElement(By.partialLinkText("Wellbaby Multi-vitamin Liquid")));
    }



}
