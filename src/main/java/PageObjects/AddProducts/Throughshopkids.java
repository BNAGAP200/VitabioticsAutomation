package PageObjects.AddProducts;

import net.bytebuddy.asm.Advice;
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
    @FindBy(xpath="//body/main[@id='MainContent']/div[@class='best-seller-section']/div[@class='best-seller-wrapper']/div[@class='best-seller-slider']/div[1]/div[1]")
    public WebElement product1;

    @FindBy(xpath ="//a[@href='/collections/kids-vitamins/products/wellkid-peppa-pig-vitamin-d-soft-jellies']")
    public WebElement product2;

    public Throughshopkids (WebDriver driver ){
        PageFactory.initElements(driver,this);
        this.driver = driver;

    }
    public void setshopkids(){
        ShopKids.click();
    }
    public void setCondition (){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 3000);");
        product1.click();
        driver.navigate().back();
        product2.click();

    }
}
