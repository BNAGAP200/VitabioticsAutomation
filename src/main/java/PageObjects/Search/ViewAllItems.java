package PageObjects.Search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class ViewAllItems {
    private final WebDriver driver;
    @FindBy(xpath = "//a[@aria-label='search']")
    public WebElement searchIcon;

    @FindBy(xpath = "//input[@class='search__input snize-input-style']")
    public WebElement typebar;
    @FindBy(xpath = "//span[normalize-space()='View all 23 items']")
    public WebElement viewallitems;
    @FindBy(xpath = "//a[@class='snize-main-panel-controls-products active']")
    public WebElement itemnos;
    @FindBy(xpath = "//ul[@class='snize-search-results-content clearfix']//li")
    public List<WebElement> Displayitemsnos;
    @FindBy(xpath = "//a[normalize-space()='2']")
    public WebElement nextpageclick;
    @FindBy(xpath = "//div[@class='snize-search-results-main-content']//li")
    public List<WebElement> secondpagenos;

    public ViewAllItems(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;

    }

    public void setSearchIcon() {
        searchIcon.click();
    }

    public void setTypebar() {
        typebar.sendKeys("Kids");
    }

    public void setViewallitems() {
        System.out.println(viewallitems.getText());
        viewallitems.click();

        System.out.println(driver.getTitle());
        System.out.println(itemnos.getText());
        System.out.println(Displayitemsnos.size());
        nextpageclick.click();
        System.out.println(secondpagenos.size());

        // Assert.assertEquals("View ");
    }
}
