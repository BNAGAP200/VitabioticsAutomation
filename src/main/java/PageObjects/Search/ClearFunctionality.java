package PageObjects.Search;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClearFunctionality {
    public final WebDriver driver;
    @FindBy(xpath = "//a[@aria-label='search']")
    public WebElement searchIcon;

    @FindBy(xpath = "//input[@class='search__input snize-input-style']")
    public WebElement typebar;

    @FindBy(xpath = "//div[@class='search__results']")
    public WebElement cancelbutton;
    public ClearFunctionality(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver= driver;
    }

    public void setSearchIcon() {
        searchIcon.click();
    }

    public void setTypebar() {
        typebar.sendKeys("Vitamins");
    }
    public void setCancelbutton(){
       /* WebDriverWait wait = new WebDriverWait(driver, 15);
        WebElement cancelbutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='search__results']")));
*/
typebar.clear();
    }

}
