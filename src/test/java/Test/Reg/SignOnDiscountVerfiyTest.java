package Test.Reg;

import PageObjects.Regpage.Discountverify;
import Universal.BrowserClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SignOnDiscountVerfiyTest extends BrowserClass {

    @Test
    public void DiscoutnVerify() {
        WebDriver driver = setupBrowser();  // Call the static method
        Discountverify Dc = new Discountverify(driver);
        Dc.setDiscountverify();
        Dc.setsignButton();
        Dc.setMsg();
      //  Dc.setCancelicon();
    }
}
