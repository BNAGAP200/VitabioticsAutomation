package Test.Search;

//import PageObjects.Search.SearchPageTestResult;

import PageObjects.Search.SearchPageResult;
import Universal.BrowserClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class SearchPageResultsTest extends BrowserClass {
    @Test
    public void verifyingresults() {


        WebDriver driver = setupBrowser();
        SearchPageResult page = new SearchPageResult(driver);
        page.setSearchIcon();
        page.setTypebar();
        page.setPageresults();

    }

}


