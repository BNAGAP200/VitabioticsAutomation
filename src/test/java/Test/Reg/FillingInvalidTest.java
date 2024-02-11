package Test.Reg;

import PageObjects.Regpage.FillingInvalid;
import Universal.BrowserClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FillingInvalidTest extends BrowserClass  {
    @Test
    public void formfilling2(){
        WebDriver driver = setupBrowser();
        FillingInvalid FF2 = new FillingInvalid(driver);
     //  FF2.clickcancelicon();
        FF2.invalidclickMyaccout();
        FF2.Invalidclickcreateaccount();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        FF2.InvalidenterFirstName();
        FF2.InvalidenterLastName();
        FF2.InvalidenterEmail();
        FF2.InvalidenterPassword();
        FF2.InvalidclickRegisterButton();
        FF2.gettext();
    }

}


