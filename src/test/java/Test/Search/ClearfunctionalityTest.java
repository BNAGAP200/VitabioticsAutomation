package Test.Search;

import PageObjects.Search.ClearFunctionality;
import Universal.BrowserClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ClearfunctionalityTest extends BrowserClass {
    @Test
    public void listofproducts(){
        WebDriver driver=setupBrowser();
        ClearFunctionality CF = new ClearFunctionality(driver);
        CF.setSearchIcon();
        CF.setTypebar();
        CF.setCancelbutton();
    }

}
