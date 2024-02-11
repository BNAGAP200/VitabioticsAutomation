package PageObjects.Regpage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class Fillingvalid {
        private final WebDriver driver;

       @FindBy(xpath = "//a[@aria-label='my account']")
       public WebElement regicon;
        @FindBy(xpath = "//a[normalize-space()='Create an account']")
        public WebElement clickcreateAccount;
        @FindBy(id = "FirstName")
        public WebElement firstname;
        @FindBy(id ="LastName")
        public WebElement lastname;
        @FindBy(id="Email")
        public WebElement email;
        @FindBy(id="CreatePassword")
        public WebElement CreatePassword;
        @FindBy(xpath ="//button[normalize-space()='Create an account']")
        public WebElement clickcreateaccount2;
    @FindBy(xpath="//*[name()='path' and contains(@d,'M6 6L14 14')]")
    public WebElement cancelicon;


    public Fillingvalid(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    public void  clickcancelicon(){
        cancelicon.click();
    }
    public void clickMyaccout(){
        regicon.click();

    }
    public void clickcreateaccount(){
        clickcreateAccount.click();

    }

        public void enterFirstName() {
          firstname .sendKeys("Unknown");
        }

        public void enterLastName() {
            lastname.sendKeys("user");
        }

        public void enterEmail() {
            email.sendKeys("Unknownuser@mail.com");
        }

        public void enterPassword() {
            CreatePassword.sendKeys("Unknownuser123!");
        }



        public void clickRegisterButton() {
            clickcreateaccount2.click();
        }
    }


