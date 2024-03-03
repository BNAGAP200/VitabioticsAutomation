package PageObjects.Search;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Errorhandling {
    public final WebDriver driver ;
    @FindBy(xpath = "//a[@aria-label='search']")
    public WebElement searchIcon;

    @FindBy(xpath = "//input[@class='search__input snize-input-style']")
    public WebElement typebar;

    @FindBy(xpath ="//div[@class='snize-nothing-found-text']")
    public WebElement Errormsg;

    public Errorhandling(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver= driver;
    }

    public void setSearchIcon() {
        searchIcon.click();
    }

    public void setTypebar() {
        typebar.sendKeys("!£$$$%%%");
    }

    public void setErrormsg(){
        System.out.println(Errormsg.getText());
    }
}
