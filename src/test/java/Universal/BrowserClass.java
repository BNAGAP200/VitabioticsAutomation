package Universal;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BrowserClass {

    @Test
    public static WebDriver setupBrowser() {
        // Set the path to the Edge WebDriver executable
        System.setProperty("webdriver.edge.driver", "C:\\Program Files\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.vitabiotics.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[normalize-space()='Accept']")).click();
        WebElement discountbutton = driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M6 6L14 14')]"));
        if ((discountbutton.isDisplayed()) && discountbutton.isEnabled()) {
            discountbutton.click();
        }
        return driver;
    }

}

