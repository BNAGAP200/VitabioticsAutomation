package Test.Search;

import PageObjects.Search.ClearFunctionality;
import PageObjects.Search.Errorhandling;
import Universal.BrowserClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ErrorhandlingTest extends BrowserClass {
    @Test
    public void capturingerror(){
        WebDriver driver=setupBrowser();
        Errorhandling EH = new Errorhandling(driver);
        EH.setSearchIcon();
        EH.setTypebar();
        EH.setErrormsg();
    }
}
