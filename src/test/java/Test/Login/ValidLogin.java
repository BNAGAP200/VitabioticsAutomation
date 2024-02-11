package Test.Login;

import PageObjects.Login.Validcred;
import Universal.BrowserClass;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;



public class ValidLogin  extends BrowserClass {
    @Test
            public void enteringdetails(){
        WebDriver driver = setupBrowser();
        Validcred vc = new Validcred(driver);
        vc.setClickregIcon();
        vc.setCustomeremail();
        vc.setCustomerpassword();
        vc.setClicksignin();
        Assert.assertEquals(driver.getTitle(),"Challenge");


    }
}
