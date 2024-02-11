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
    @FindBy(xpath="//input[@class='search__input snize-input-style']")
    public WebElement typebar;
    @FindBy(xpath="//div[@class='snize-ac-results-content']//li")
    public List<WebElement> textlist;
    @FindBy(xpath = "//a[@href='/products/wellkid-immune-chewable']")
    public WebElement Productclick;
    @FindBy(xpath ="//button[@class='button button--dark cartbutton']")
    public WebElement AddproductButton;
    @FindBy(xpath = "//a[@aria-label='cart']")
    public WebElement AddToCart;

    public ThroughSearchMethod (WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }
public void setSearchIcon(){
        searchIcon.click();
}
public void setTypebar(){
        typebar.sendKeys("Vitamins c");
}
public void setTextlist(){
        textlist.size();
}
public void setProductclick(){
        Productclick.click();
}
public void setAddproductButton(){
        AddproductButton.click();
    System.out.println(driver.getTitle());
}
public void setAddToCart(){
        AddToCart.click();
}
}
