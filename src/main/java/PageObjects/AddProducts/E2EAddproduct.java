package PageObjects.AddProducts;

import PageObjects.Login.Validcred;
import PageObjects.Search.SearchBar;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class E2EAddproduct extends  Validcred{
    public final WebDriver driver;


@FindBy(xpath = "(//ul[@id='snize-ac-items-container-2'])//li[2]")
public WebElement product;
@FindBy(xpath="//h1[@class='product__title product-info-title']")
public  WebElement Productname;
@FindBy(xpath = "//button[@class='button button--dark cartbutton']")
public WebElement AddtocartButton;
@FindBy(xpath = "//button[@class='mini-cart__close close-mini-cart']")
public WebElement MinicartButton ;
@FindBy(xpath ="//span[@class='radio__control']")
public WebElement radiobutton;
@FindBy(xpath ="(//span[@class='radio__control'])[2]")
    public WebElement radiobutton2;
@FindBy(xpath ="//div[@class='left']")
public WebElement price;
@FindBy(xpath = "//a[@aria-label='cart']//*[name()='svg']")
public WebElement BasketButton;
@FindBy(xpath ="//a[@class='payment__link--item']")
public WebElement CheckoutButton;



@FindBy(xpath = "//div[@class='mini-cart__recommendations-items']//div[@class='wire-xs-12 wire-sm-12 wire-md-12 wire-lg-12 suggest']")
public List<WebElement> crossselling;


    public E2EAddproduct(WebDriver driver) {
        super(driver);


        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public  void login(){
        Validcred vc = new Validcred(driver);
        vc.setClickregIcon();
        vc.setCustomeremail();
        vc.setCustomerpassword();
        vc.setClicksignin();
    }
    public void Search(){
        ThroughSearchMethod SB = new ThroughSearchMethod(driver);
        SB.setSearchIcon();
        SB.setTypebar();
    }
    public void Product() {
        product.click();
        System.out.println(Productname.getText());
    }


public void productAssert(){
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,500);");
    radiobutton2.click();
    System.out.println(price.getText());
    AddtocartButton.click();


    }
    public  void cartvalidation(){
        for (WebElement Suggessted :crossselling){
            String text = Suggessted.getText();
            System.out.println("Cross selling Product sugesstion List:");
            System.out.println(text);
        }
        MinicartButton.click();
    }
    public void Basket(){
        BasketButton.click();
        System.out.println(driver.getTitle());
        CheckoutButton.click();
    }
}
