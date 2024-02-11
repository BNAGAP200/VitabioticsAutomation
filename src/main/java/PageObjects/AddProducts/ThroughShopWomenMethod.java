package PageObjects.AddProducts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Clock;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class ThroughShopWomenMethod {
    public final WebDriver driver;
    @FindBy(xpath = "//a[normalize-space()='Shop Women']")
    public WebElement ShopWomen;
    @FindBy(xpath = "(//div[@class='best-seller-section']//div)[3]")
    public WebElement clickproduct1;
    @FindBy(xpath = "//div[@class='best-seller-section']//div[3]//div[1]//div[1]//div[1]")
    public WebElement clickproduct2;
    @FindBy(xpath = "//div[@class='best-seller-section']//div[2]")
    public WebElement product2;
    @FindBy(xpath = "//button[@class='button button--dark cartbutton']")
    public WebElement clickaddtocart;

    // @FindBy(xpath = "//body/div[@class='mini-cart initialized mini-cart--opened']/div[@class='mini-cart__content']/div[@class='mini-cart__inner']/div[@class='mini-cart__products']/div[1]")
    // public WebElement productatcart;

    ////  @FindBy(xpath = "//div[@data-id='29083837530181']//div[@class='suggest__addtocart']")
    //  public WebElement addsuggestedproduct;

    public ThroughShopWomenMethod(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;

    }

    public void setShopWomen() {
        ShopWomen.click();
        System.out.println(driver.getTitle());
    }

    public void setscrollpage() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 1000);");

    }

    public void setClickproduct1() {


        clickproduct1.click();
       // driver.navigate().refresh();
    }

    public void setClickproduct2() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(clickproduct2));


    }


}





