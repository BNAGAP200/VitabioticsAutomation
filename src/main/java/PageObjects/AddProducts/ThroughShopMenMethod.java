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

import java.util.List;

public class ThroughShopMenMethod {
    public final WebDriver driver ;
    @FindBy(xpath ="//div[@class='banner']//a[@class='btn shop-now'][normalize-space()='Shop Men']")
    public WebElement shopmenbutton;

    @FindBy(xpath ="//img[@alt=' Wellman Max']")
    public WebElement clickthefirstproduct;
    @FindBy(xpath ="//button[@class='button button--dark cartbutton']")
    public WebElement clickaddtocart;
    @FindBy(xpath ="//a[@class='item__title'][normalize-space()='Wellman Max']")
    public WebElement minicartproductviewer;

    public ThroughShopMenMethod(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;

    }
    public void setShopmenbutton(){
        //WebElement element = driver.findElement(By.xpath("(//a[normalize-space()='Shop Men'])[1]"));
        /*WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(shopmenbutton));*/

        if (shopmenbutton.isEnabled()) {
            shopmenbutton.click(); // or perform other interactions
        }else {
            System.out.println("The element is not here");
        }



    }
    public void setClickthefirstproduct(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 3000);");

        clickthefirstproduct.click();
        System.out.println(driver.getTitle());

    }



    public void setMinicartproductviewer(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 1000);");
        clickaddtocart.click();
        System.out.println(minicartproductviewer.getText());

    }
}
