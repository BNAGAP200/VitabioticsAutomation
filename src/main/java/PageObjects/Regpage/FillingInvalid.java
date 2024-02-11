package PageObjects.Regpage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FillingInvalid {
    private final WebDriver driver;

    @FindBy(xpath = "//a[@aria-label='my account']")
    public WebElement invalidregicon;
    @FindBy(xpath = "//a[normalize-space()='Create an account']")
    public WebElement invalidclickcreateAccount;
    @FindBy(id = "FirstName")
    public WebElement invalidfirstname;
    @FindBy(id ="LastName")
    public WebElement invalidlastname;
    @FindBy(id="Email")
    public WebElement invalidemail;
    @FindBy(id="CreatePassword")
    public WebElement invalidCreatePassword;
    @FindBy(xpath ="//button[normalize-space()='Create an account']")
    public WebElement invalidclickcreateaccount2;
    @FindBy(xpath="//*[name()='path' and contains(@d,'M6 6L14 14')]")
    public WebElement invalidcancelicon;
    @FindBy(xpath = "//div[@id='email-validation-error']")
    public WebElement errorMsg;

    public FillingInvalid(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    // Methods to interact with the elements

    public void invalidclickMyaccout(){
    invalidregicon.click();

    }
    public void Invalidclickcreateaccount(){
        invalidclickcreateAccount.click();

    }
   public  void InvalidenterFirstName() {
        invalidfirstname.sendKeys("Unknown");
    }

    public void InvalidenterLastName() {
        invalidlastname.sendKeys("user");
    }

    public void InvalidenterEmail() {
        invalidemail.sendKeys("Unknownuser13!@mail.com");
    }

    public void InvalidenterPassword() {
        invalidemail.sendKeys("Unknownuser11232!");
    }



    public void InvalidclickRegisterButton() {
      invalidclickcreateaccount2.click();
    }
    public  void gettext(){
        System.out.println(errorMsg.getText());
    }
}

