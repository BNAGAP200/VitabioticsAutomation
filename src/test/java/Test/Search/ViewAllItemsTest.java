package Test.Search;

import PageObjects.Search.ViewAllItems;
import Universal.BrowserClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ViewAllItemsTest extends BrowserClass{
    @Test
    public void viewpageitems(){
        WebDriver driver = setupBrowser();
        ViewAllItems all = new ViewAllItems(driver);
        all.setSearchIcon();
        all.setTypebar();
        all.setViewallitems();
    }
}
