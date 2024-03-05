package TestRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = {"src/test/resources/AddProductFeature/ShopmenE2E.feature"},
     //  tags = "@sanity",
        glue = {"StepDefinitionAddProduct"}
)
public class TestRunner extends AbstractTestNGCucumberTests {

}