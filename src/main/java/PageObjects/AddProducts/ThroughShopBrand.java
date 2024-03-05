package PageObjects.AddProducts;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ThroughShopBrand {
    public final WebDriver driver;

    @FindBy(xpath = "//body/main[@id='MainContent']/div[@id='shopify-section-home-our-brands']/div[@class='wrapper']/div[@class='container']/div[@class='main-slider']/div[@id='brand-slider']/div[@class='slick-list draggable']/div[@class='slick-track']/div[5]/div[1]/div[1]")
    public WebElement pregnacareBrand;
    @FindBy(xpath = "//a[normalize-space()='Shop Before Range']")
    public WebElement shopbyrange;
    @FindBy(xpath = "//a[@href='https://www.vitabiotics.com/products/pregnacare-him-her-conception-tablets']//div[@class='pcProductItem__inner']//div[@class='pcProductItem__copy']//div[@class='pcProductItem__copy-button button'][normalize-space()='View Product']")
    public WebElement viewproduct;
    @FindBy(xpath = "//div[@class='quantity__plus quantity__button']")
    public WebElement AddSymbol;
    @FindBy(xpath = "//button[@class='button button--dark cartbutton']")
    public WebElement Addtocartbutton;

    @FindBy(xpath = "//body[1]/div[5]/div[2]/div[1]/div[3]/div[1]/div[1]")
    public WebElement BasketVerify;

    public ThroughShopBrand(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void setPregnacareBrand() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 200);");
        pregnacareBrand.click();
    }

    public void setShopbyrange() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 200);");
        shopbyrange.click();

    }

    public void setViewproduct() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 1000);");
        viewproduct.click();
        System.out.println(driver.getTitle());
    }

    public void setAddSymbol() {
        if (AddSymbol.isDisplayed() && AddSymbol.isEnabled()) {
            int productcount = 0;
            while (productcount < 15) {
                AddSymbol.click();
                productcount++;
                System.out.println("Product added. Count: " + productcount);
            }
        }
        AddSymbol.click();

        // Verify if the product count is still 15
        WebElement cartItemCount = driver.findElement(By.xpath("//div[@class='quantity__value']//input[@id='Quantity']"));
        String itemCountText = cartItemCount.getAttribute("value");

        // Convert the retrieved value to an integer
        int itemCount = Integer.parseInt(itemCountText);
        if (itemCount == 15) {
            System.out.println("Test Passed: Only 15 products were successfully added to the cart.");
        } else {
            System.out.println("Test Failed: More than 15 products were added to the cart.");
        }

    }
        public void setAddtocartbutton() {
            Addtocartbutton.click();
            System.out.println(BasketVerify.getText());


        }
    }

