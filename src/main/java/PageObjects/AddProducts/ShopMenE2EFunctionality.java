<<<<<<< HEAD
package PageObjects.AddProducts;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;

import java.util.List;

public class ShopMenE2EFunctionality {
    public final WebDriver driver;
    @FindBy(xpath = "//div[@class='banner']//a[@class='btn shop-now'][normalize-space()='Shop Men']")
    public WebElement shopmenbutton;

    @FindBy(xpath = "//div[@class='plpWrapper__items']//div[@class='plpItems__item ng-scope']")
    public List<WebElement> Productlist;
    @FindBy(xpath = "(//span[@class='plpNavItem__checkbox'])[12]")
    public WebElement Glutenfreebtn;
    @FindBy(xpath = "(//span[@class='plpNavItem__checkbox'])[10]")
    public WebElement veganbtn;
    @FindBy(xpath = "(//span[@class='plpNavItem__checkbox'])[11]")
    public WebElement Vegeterianbtn;
    @FindBy(xpath ="(//div[@class='plpNav__item-wrap plpNav__item-text plpNav__item-border'])[1]//div")
    public List<WebElement> BrandsBtn;

    public ShopMenE2EFunctionality(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void setShopmenbutton() {
        shopmenbutton.click();
    }

    public void productspage() {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 1000);");

        for (int i = 0; i < Productlist.size(); i++) {
            WebElement product = Productlist.get(i);
            String productDetails = (i + 1) + ". " + product.getText();
            System.out.println(productDetails);
            if (i < Productlist.size() - 1) {
                System.out.println();
            }
        }
    }

    public void setGlutenfreebtn() {
        Assert.assertTrue(Glutenfreebtn.isEnabled());
        Glutenfreebtn.click();
        for (int i = 0; i < Productlist.size(); i++) {
            WebElement glutenfreeprod = Productlist.get(i);
            String GFList = (i + 1) + "." + glutenfreeprod.getText();
            System.out.println(GFList);
            if (i < Productlist.size() - 1) {
                System.out.println();
            }
        }
        Glutenfreebtn.click();
    }

    public void setVeganbtn() {
        Assert.assertTrue(veganbtn.isEnabled());
        veganbtn.click();
        for (int i = 0; i < Productlist.size(); i++) {
            WebElement veganproduct = Productlist.get(i);
            String VP = (i + 1) + "." + veganproduct.getText();
            System.out.println(VP);
            if (i < Productlist.size() - 1) {
                System.out.println();
            }
        }
        veganbtn.click();
    }

    public void setVegeterianbtn() {
        Assert.assertTrue(Vegeterianbtn.isEnabled());
        Vegeterianbtn.click();
        for (int i = 0; i < Productlist.size(); i++) {
            WebElement vegetarianbutton = Productlist.get(i);
            String VegProduct = (i + 1) + "." + vegetarianbutton.getText();
            System.out.println(VegProduct);
            if (i < Productlist.size() - 1) {
                System.out.println();
            }
        }
        Vegeterianbtn.click();
    }
    public  void setBrandsBtn(){

        for (WebElement BrandsList : BrandsBtn){
            BrandsList.click();
            for (int i = 0; i < Productlist.size(); i++) {
                WebElement product = Productlist.get(i);
                String BrandProDetils = (i + 1) + ". " + product.getText();
                System.out.println(BrandProDetils);
                if (i < Productlist.size() - 1) {
                    System.out.println();
                }
            }

        }
    }
}
=======
package PageObjects.AddProducts;public class ShopMenE2EFunctionality {
}
>>>>>>> main/master
