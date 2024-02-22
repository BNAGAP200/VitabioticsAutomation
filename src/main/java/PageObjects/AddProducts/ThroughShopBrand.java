package PageObjects.AddProducts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ThroughShopBrand {
    public final WebDriver driver;

    @FindBy(xpath ="//img[@alt='Pregnacare']")
    public WebElement pregnacareBrand;
    @FindBy(xpath = "//a[normalize-space()='Shop Before Range']")
    public WebElement shopbyrange;
@FindBy(xpath ="//a[@href='https://www.vitabiotics.com/products/pregnacare-him-her-conception-tablets']//div[@class='pcProductItem__inner']//div[@class='pcProductItem__copy']//div[@class='pcProductItem__copy-button button'][normalize-space()='View Product']")
public WebElement viewproduct;
@FindBy (xpath="//div[@class='quantity__plus quantity__button']")
public WebElement AddSymbol;
    public ThroughShopBrand(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }
    public void setPregnacareBrand(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 1000);");
        pregnacareBrand.click();
    }
    public void setShopbyrange(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500);");
       WebDriverWait wait = new WebDriverWait(driver,10);
       wait.until(ExpectedConditions.elementToBeClickable(shopbyrange));

    }
    public void setViewproduct(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 1000);");
        viewproduct.click();
        System.out.println(driver.getTitle());
    }
    public void setAddSymbol(){
        if (AddSymbol.isDisplayed() && AddSymbol.isEnabled()){
            int productcount=0;
            while (productcount<15){
                AddSymbol.click();
                productcount++;
                System.out.println("Product added. Count: " + productcount);
            }
            }
        }
    }

