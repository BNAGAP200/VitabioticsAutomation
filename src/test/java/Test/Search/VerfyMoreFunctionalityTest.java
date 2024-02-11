package Test.Search;

import PageObjects.Search.VerifyMoreFunctionality;
import Universal.BrowserClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class VerfyMoreFunctionalityTest extends BrowserClass {
    @Test
            public void verfiyingmorebutton(){
        WebDriver driver = setupBrowser();
        VerifyMoreFunctionality more = new VerifyMoreFunctionality(driver);
        more.setSearchIcon();
        more.setTypebar();
        more.setMoreIcon();

    }


}
