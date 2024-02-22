package TestRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.interactions.Actions;

@CucumberOptions(
        features = {"src/test/resources/AddProductFeature/AddProductByBrand.feature"},
    //   tags = "@ShopMen",
        glue = {"StepDefinitionAddProduct"}
)
public class TestRunner extends AbstractTestNGCucumberTests {

}
