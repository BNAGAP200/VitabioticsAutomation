package TestRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/AddproductsFeatureFiles/ThroughShopMen.feature"},
    //   tags = "@ShopMen",
        glue = {"StepDefinitionsAddProduct"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
