package PageObjects.Search;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class SearchPageResult {
    private final WebDriver driver;
    @FindBy(xpath = "//a[@aria-label='search']")
    public WebElement searchIcon;

    @FindBy(xpath = "//input[@class='search__input snize-input-style']")
    public WebElement typebar;

    @FindBy(xpath = "//ul[@id='snize-ac-items-container-4']//li")
    public List<WebElement> Pageresults;

    public SearchPageResult(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;

    }

    public void setSearchIcon() {
        searchIcon.click();
    }

    public void setTypebar() {
        typebar.sendKeys("Vitamin D");
    }

    public void setPageresults() {
        WebElement element = driver.findElement(By.xpath("//div[@class='snize-dropdown-arrow']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

        System.out.println(Pageresults.size());
        for (int i = 0; i < Pageresults.size(); i++) {
            Actions act = new Actions(driver);
            act.keyDown(Keys.CONTROL).click(Pageresults.get(i)).keyUp(Keys.CONTROL).build().perform();


            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.numberOfWindowsToBe(i + 3));

            ArrayList<String> Pages = new ArrayList<>(driver.getWindowHandles());

            // Ensure the index is within bounds
            if (i < Pages.size()) {
                String newWindowHandle = Pages.get(i);
                driver.switchTo().window(newWindowHandle);
                String pageHeading = driver.getTitle();
                System.out.println(pageHeading);

                // Perform actions in the new window

                // If needed, switch back to the original window or close the current window

            }
        }
    }
}
