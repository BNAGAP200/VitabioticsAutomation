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

    @FindBy(xpath = "//ul[@class='menu__list']//li")
    public List<WebElement> tooltipopn;
    @FindBy(xpath = "//div[@class='section more-section land']//li")
    public List<WebElement> allproducts;
    @FindBy(xpath = "//LI[@data-link='/collections/vitamins-for-women']")
    public WebElement womensection;
    @FindBy(xpath = "//div[@id='s1']//li")
    public List<WebElement> WomenProductsection;
    @FindBy(xpath = "//LI[@data-link='/collections/vitamins-for-men']")
    public WebElement mensection;
    @FindBy(xpath = "//div[@id='s2']//li")
    public List<WebElement> menproductsection;
    @FindBy(xpath = "//LI[@data-link='/collections/kids-vitamins']")
    public WebElement kidssection;
    @FindBy(xpath = "//div[@id='s3']//li")
    public List<WebElement> kidsproductsection;
    @FindBy(xpath = "//LI[@data-link='/collections/vitamins-for-adults-50']")
    public WebElement Adult50section;
    @FindBy(xpath = "//div[@id='s4']//li")
    public List<WebElement> Adult50productsection;


    public ToolTip(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void setTooltipopn() {
        Actions actions = new Actions(driver);

        for (WebElement element : tooltipopn) {

            actions.moveToElement(element).perform();

        }
    }

    public void setAllproducts() {
        for (WebElement elementProduct : allproducts) {
            String productlist = elementProduct.getText();
            System.out.println(productlist);
        }
    }

    public void setWomenProduct() {
        Actions act = new Actions(driver);
        act.moveToElement(womensection).perform();
        for (WebElement Elementproducts1 : WomenProductsection) {

            String list1 = Elementproducts1.getText();
            System.out.println("Women Products are : " + list1);

        }
    }

    public void setMensection() {
        Actions act = new Actions(driver);
        act.moveToElement(mensection).perform();
        for (WebElement Elementproducts2 : menproductsection) {

            String list2 = Elementproducts2.getText();
            System.out.println("men Products are : " + list2);

        }
    }

    public void setKidssection() {
        Actions act = new Actions(driver);
        act.moveToElement(kidssection).perform();
        for (WebElement Elementproducts3 : kidsproductsection) {

            String list3 = Elementproducts3.getText();
            System.out.println("kids Products are : " + list3);
        }
    }
    public void setAdult50section() {
        Actions act = new Actions(driver);
        act.moveToElement(Adult50section).perform();
        for (WebElement Elementproducts4 : Adult50productsection) {

            String list4 = Elementproducts4.getText();
            System.out.println("Adult50+ Products are : " + list4);
        }
    }
}
