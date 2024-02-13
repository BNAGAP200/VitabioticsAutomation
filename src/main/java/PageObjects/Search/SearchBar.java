package PageObjects.Search;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchBar {
    public final WebDriver driver;
    @FindBy(xpath = "//a[@aria-label='search']")
    public WebElement searchIcon;
    @FindBy(xpath = "//input[@class='search__input snize-input-style']")
    public WebElement typebar;

    public SearchBar(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void setSearchIcon() {
        searchIcon.click();
        typebar.sendKeys("Vitamins");
    }
}
    /*public void setTypebar(){
        System.out.println(typebar.getText());
    }*/

