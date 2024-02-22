package StepDefinitionReg;

import PageObjects.Regpage.Fillingvalid;
import PageObjects.Search.ViewAllItems;
import Universal.BrowserClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ValidData extends BrowserClass {
    WebDriver driver = setupBrowser();
   Fillingvalid FV = new Fillingvalid(driver);
    @Given("User navigates to registration page")
    public void theUserNavigatesToTheRegPage() {

        FV.clickMyaccout();
        System.out.println(driver.getTitle());
    }

    @When("User enters valid registration details")
    public void theUserentersValidRegistrationDetails() {

        this.FV.clickcreateaccount();
        this.FV.enterFirstName();
        this.FV.enterLastName();
        this.FV.enterEmail();
        this.FV.enterPassword();
        this.FV.clickRegisterButton();
    }
    @Then("User should be successfully registered")
    public void userShouldBeSuccessfullyRegistered() {
        System.out.println(driver.getTitle());
    }




    @Given("User navigates to Registration page")
    public void userNavigatesToRegistrationPage() {
        FV.clickMyaccout();
        FV.clickcreateaccount();
        Actions act = new Actions(driver);



    }
    @When("User enters synthetic registration details from Excel {string} at {string}")
    public void userEntersSyntheticRegistrationDetailsFromExcelAt(String  AutomationWorkbook, String Sheetx) {
        try {
            FileInputStream fis = new FileInputStream(AutomationWorkbook);
            Workbook workbook = new XSSFWorkbook(fis);
            Sheet sheet = workbook.getSheet(Sheetx);
            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);

                FV.firstname.sendKeys(row.getCell(0).getStringCellValue());
               FV.lastname.sendKeys(row.getCell(1).getStringCellValue());
                FV.email.sendKeys(row.getCell(2).getStringCellValue());
               FV.CreatePassword.sendKeys(row.getCell(3).getStringCellValue());
                FV.clickRegisterButton();
            }
            workbook.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Then("User should get successfully registered")
    public void userShouldGetSuccessfullyRegistered() {
        System.out.println(driver.getTitle());
    }



}

