package Test.Search;

import PageObjects.Search.SearchBar;
import Universal.BrowserClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SearchBarTest extends BrowserClass {
    @Test
    public void testingsearchbar(){
        WebDriver driver = setupBrowser();
        SearchBar SB = new SearchBar(driver);

        SB.setSearchIcon();
        //SB.setTypebar();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        SB.checkzoomicon();
    }
}
