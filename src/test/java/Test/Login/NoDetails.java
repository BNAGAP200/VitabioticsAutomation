package Test.Login;

import PageObjects.Login.Nocred;
import Universal.BrowserClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class NoDetails extends BrowserClass {
    @Test
    public void enteringnodetails() {


        WebDriver driver = setupBrowser();
        Nocred nocred = new Nocred(driver);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        nocred.setClickregIcon();
        nocred.setCustomeremail();
        nocred.setCustomerpassword();
        nocred.setClicksignin();

    }
}