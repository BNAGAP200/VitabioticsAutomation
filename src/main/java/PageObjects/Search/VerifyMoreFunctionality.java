package PageObjects.Search;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyMoreFunctionality {

    private final WebDriver driver;
    @FindBy(xpath = "//a[@aria-label='search']")
    public WebElement searchIcon;

    @FindBy(xpath = "//input[@class='search__input snize-input-style']")
    public WebElement typebar;
    @FindBy(xpath = "//span[normalize-space()='View all 23 items']")
    public WebElement viewallitems;

    @FindBy(xpath = "//li[@class='snize-page snize-view-all-pages snize-ac-even']")
    public WebElement MoreIcon;

    public VerifyMoreFunctionality(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver= driver;
    }
    public void setSearchIcon(){
        searchIcon.click();
    }
    public void setTypebar(){
        typebar.sendKeys("Pregnancy");
    }

    public void setMoreIcon(){
        MoreIcon.click();
        System.out.println(driver.getTitle());
    }
}
