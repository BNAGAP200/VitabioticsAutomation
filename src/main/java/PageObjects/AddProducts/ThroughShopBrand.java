package PageObjects.AddProducts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThroughShopBrand {
    public final WebDriver driver;

    @FindBy(xpath ="//div[@class='slick-track']//div[@class='slick-slide slick-active'])[4]")
    public WebElement pregnacareBrand;


    public ThroughShopBrand(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }
    public void setPregnacareBrand(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500);");
        pregnacareBrand.click();
    }
}
