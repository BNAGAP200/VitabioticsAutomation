package PageObjects.AddProducts;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Throughshopkids {
    public final WebDriver driver;
    @FindBy(xpath = "(//div[@class='btn-wrapper']//a[normalize-space()='Shop Kids'])[2]")
    public WebElement ShopKids;
    @FindBy(xpath="(//div[@class='best-seller-slider']//a)[1]")
    public WebElement product1;
   @FindBy(xpath="//span[@class='ng-binding'][normalize-space()='Add to Cart']")
    public WebElement Addtocart;
    @FindBy(xpath ="(//a[@class='item__title'][normalize-space()='Wellbaby Multi-vitamin Liquid'])[1]")
    public WebElement ProductName;
    @FindBy(xpath = "//div[@class='quantity__plus quantity__button']")
    public WebElement AddSymbol;

    public Throughshopkids (WebDriver driver ){
        PageFactory.initElements(driver,this);
        this.driver = driver;

    }
    public void setshopkids(){
        ShopKids.click();
    }
    public void setCondition (){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400);");
       js.executeScript("arguments[0].click();",product1);




    }
    public void setAddProduct(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 300);");
        js.executeScript("arguments[0].click();",Addtocart);

    }
    public void setProductName(){
        System.out.println(ProductName.getText());



    }
}
