package Test.Search;

import Universal.BrowserClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SearchSuggestions extends BrowserClass {
    @Test
    public void listofproducts(){
        WebDriver driver=setupBrowser();
        PageObjects.Search.SearchSuggestions sc = new PageObjects.Search.SearchSuggestions(driver);
        sc.setSearchIcon();
        sc.setTypebar();
        sc.setSuggestionlists();
        //sc.anotherOperationWithSuggestionList();
    }

}
