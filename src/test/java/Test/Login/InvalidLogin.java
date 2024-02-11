
package Test.Login;

import PageObjects.Login.Invalidcred;
import Universal.BrowserClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class InvalidLogin extends BrowserClass {
    @Test(dataProvider = "InvalidLogin")
    public void enteringinvalid(String email , String Password){
        WebDriver driver = setupBrowser();
        Invalidcred invalidcred = new Invalidcred(driver);
        invalidcred.setClickregIcon();
        invalidcred.setCustomeremail(email);
        invalidcred.setCustomerpassword(Password);
        invalidcred.setClicksignin();
    }
    @DataProvider(name="InvalidLogin")
    public  Object[][] getinvalidLoginData(){
        return new Object [][]{
                {"Unknownuser12@mail.com","Unknown123"},
                {"Unknownuser@mail.com","Unknown"}
        };
    }
}
