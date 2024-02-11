package PageObjects.Regpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Discountverify {

    @FindBy(xpath = "(//div[@component='[object Object]'])[6]")
    public WebElement discounttext;
    @FindBy(xpath = "//button[normalize-space()='SIGN ME UP']")
    public WebElement signbutton;
    @FindBy(xpath = "//span[normalize-space()='This field is required']")
    public WebElement msg;
    @FindBy(xpath="//*[name()='path' and contains(@d,'M6 6L14 14')]")
    public WebElement cancelicon;

    public Discountverify(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }


    public void setDiscountverify() {
        System.out.println(discounttext.getText());
    }

    public void setsignButton() {
        System.out.println(signbutton.isDisplayed());
        signbutton.click();
    }

    public void setMsg() {
        System.out.println(msg.getText());
    }

    public void setCancelicon() {
        cancelicon.click();
    }
}
