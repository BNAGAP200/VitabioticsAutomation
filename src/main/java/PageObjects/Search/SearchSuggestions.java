package PageObjects.Search;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SearchSuggestions {
    public final WebDriver driver;

    @FindBy(xpath = "//a[@aria-label='search']")
    public WebElement searchIcon;

    @FindBy(xpath = "//input[@class='search__input snize-input-style']")
    public WebElement typebar;

    @FindBy(xpath = "//div[@class='snize-ac-results-content']//ul//li")
    public List<WebElement> suggestionlists;

    // You can use the same XPath for another operation
    @FindBy(xpath = "//div[@class='snize-ac-results-content']//ul//li")
    public List<WebElement> anotherSuggestionList;

    public SearchSuggestions(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void setSearchIcon() {
        searchIcon.click();
    }

    public void setTypebar() {
        typebar.sendKeys("Vitamins");
    }

    public void setSuggestionlists() {
        for (WebElement list : suggestionlists) {
            String items = list.getText();
            System.out.println(items);
        }
    }

    // Use the same XPath for another operation
    public void anotherOperationWithSuggestionList() {

        typebar.clear();
        typebar.sendKeys("Pregnancy");
        WebDriverWait wait = new WebDriverWait(driver, 15);


        // Wait for all elements in anotherSuggestionList to be visible
        List<WebElement> visibleElements = wait.until(ExpectedConditions.visibilityOfAllElements(anotherSuggestionList));



        System.out.println(visibleElements.size());
        for (WebElement element : visibleElements) {
            String text = element.getText();
            System.out.println(text);
        }
    }
}
