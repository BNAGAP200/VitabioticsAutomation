package TestRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/SearchFeatureFiles/Errorhandling"},
       // tags = "@Search",
        glue = {"StepDefinitionsSearch"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
