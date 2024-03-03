package PageObjects.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Invalidcred {
    public final WebDriver driver;



    @FindBy(xpath = "//a[@aria-label='my account']")
    public WebElement ClickregIcon;

    @FindBy(id = "CustomerEmail")
    public WebElement Customeremail ;

    @FindBy(id="CustomerPassword")
    public WebElement customerpassword;
    @FindBy(xpath = "//button[normalize-space()='Sign In']")
    public WebElement clicksignin;
    public Invalidcred (WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }
    public void setClickregIcon(){
        ClickregIcon.click();
    }
    public  void setCustomeremail(String email){
       Customeremail.sendKeys(email);

    }
    public void setCustomerpassword(String Password){
        customerpassword.sendKeys(Password);
    }
    public void setClicksignin(){
        clicksignin.click();
        System.out.println(driver.getTitle());
    }
}


