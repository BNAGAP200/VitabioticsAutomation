package Test.Reg;

import PageObjects.Regpage.Fillingvalid;
import Universal.BrowserClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FillingvalidTest extends BrowserClass {
    @Test
    public void Formfilling(){
        WebDriver driver = setupBrowser();
        Fillingvalid RP = new Fillingvalid(driver);

        RP.clickcancelicon();
        RP.clickMyaccout();
        RP.clickcreateaccount();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        RP.enterFirstName();
        RP.enterLastName();
        RP.enterEmail();
       RP.enterPassword();
       RP.clickRegisterButton();
    }

}
