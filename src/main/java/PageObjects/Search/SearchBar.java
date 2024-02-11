package PageObjects.Search;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchBar {
    public final WebDriver driver;
    @FindBy(xpath = "//a[@aria-label='search']")
    public WebElement searchIcon;
    @FindBy(xpath="//input[@class='search__input snize-input-style']")
    public WebElement typebar;
    @FindBy(xpath ="//button[@href='#']")
    public WebElement clickzoomicon;
     public SearchBar(WebDriver driver){
         PageFactory.initElements(driver,this);
         this.driver=driver;
     }
     public void setSearchIcon(){
         searchIcon.click();
     }
    /*public void setTypebar(){
        System.out.println(typebar.getText());
    }*/
    public void checkzoomicon(){
         clickzoomicon.click();
        System.out.println(driver.getTitle());
    }
}
