package PageObjects.Login;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;

public class Validcred {
    public final WebDriver driver;

    @FindBy(xpath = "//a[@aria-label='my account']")
    public WebElement ClickregIcon;

    @FindBy(id = "CustomerEmail")
    public WebElement Customeremail ;

    @FindBy(id="CustomerPassword")
    public WebElement customerpassword;
    @FindBy(xpath = "//button[normalize-space()='Sign In']")
    public WebElement clicksignin;
    public Validcred (WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }
    public void setClickregIcon(){
        ClickregIcon.click();
    }
public  void setCustomeremail(){
        Customeremail.sendKeys("Unknownuser@mail.com");


}
public void setCustomerpassword(){
        customerpassword.sendKeys("Unknownuser123!");
}
public void setClicksignin(){
        clicksignin.click();
    System.out.println(driver.getTitle());
}
}
