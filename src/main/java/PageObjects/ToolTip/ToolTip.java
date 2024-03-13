package PageObjects.ToolTip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ToolTip {
    public final WebDriver driver;

    @FindBy(xpath="//ul[@class='menu__list']//li")
    public List<WebElement> tooltipopn;
    @FindBy(xpath = "//div[@class='section more-section land']//li")
    public List<WebElement> allproducts;
    public ToolTip (WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }
    public void setTooltipopn(){
        Actions actions = new Actions(driver);

        for (WebElement element : tooltipopn) {

            actions.moveToElement(element).perform();

            }
        }
        public  void setAllproducts(){
        for (WebElement elementProduct :allproducts){
            String productlist= elementProduct.getText();
            System.out.println(productlist);
        }
        }
    }

