package PageObjects.AddProducts;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ThroughSearchMethod {
    public final WebDriver driver;
    @FindBy(xpath = "//a[@aria-label='search']")
    public WebElement searchIcon;
    @FindBy(xpath = "//input[@class='search__input snize-input-style']")
    public WebElement typebar;
    @FindBy(xpath = "//div[@class='snize-ac-results-content']//li")
    public List<WebElement> textlist;
    @FindBy(xpath = "//span[normalize-space()='Immunace Extra Protection']")
    public WebElement Productclick;
    @FindBy(xpath = "//button[@class='button button--dark cartbutton']")
    public WebElement AddproductButton;
    @FindBy(xpath = "//a[@aria-label='cart']")
    public WebElement AddToCart;
    @FindBy(xpath = "//button[normalize-space()='+']")
    public WebElement AddSymbol;

    @FindBy(xpath = "//span[normalize-space()='View all 27 items']")
    public WebElement Viewall;
    @FindBy(xpath = "//div[@id='snize-search-results-grid-mode']//li")
    public List<WebElement> Listall;

    public ThroughSearchMethod(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void setSearchIcon() {
        searchIcon.click();
    }

    public void setTypebar() {
        typebar.sendKeys("Immunace Extra Protection");
    }

    public void setTextlist() {
        textlist.size();
    }

    public void setProductclick() {
        Productclick.click();
    }

    public void setAddproductButton() {
        AddproductButton.click();
        System.out.println(driver.getTitle());
    }

    public void setAddToCart() {
        AddToCart.click();
    }

    public void setAddSymbol() {

        if (AddSymbol.isDisplayed() && AddSymbol.isEnabled()) {
            int productcount = 0;
            //for (productcount=0;productcount<=15;productcount++)
            while (productcount < 15) {
                AddSymbol.click();
                productcount++;
                System.out.println("Product added. Count: " + productcount);
            }
        }
    }
    public void setWindow(){
        driver.navigate().to("https://www.vitabiotics.com/");
        System.out.println(driver.getWindowHandle());
        searchIcon.click();
        typebar.sendKeys("Wellman");

    }
    public void SetViewall(){
            Viewall.click();
    }
    public void SetListall(){
        for(WebElement allproducts:Listall){
            System.out.println(allproducts.getText());
        }

    }
}