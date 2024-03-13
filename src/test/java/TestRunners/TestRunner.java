package TestRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = {"src/test/resources/TooTipFeature/ToolTip.feature"},
     //  tags = "@sanity",
        glue = {"StepDefintionsToolTip"}
)
public class TestRunner extends AbstractTestNGCucumberTests {

}