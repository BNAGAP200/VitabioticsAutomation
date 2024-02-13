package TestRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/SearchFeatureFiles/SearchBar.feature",

        glue = "StepDefinitionsLogin"
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
