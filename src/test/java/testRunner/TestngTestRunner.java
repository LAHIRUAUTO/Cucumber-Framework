package testRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "src/test/java/features",
        glue = "step_definitions",
        plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        monochrome = true
)

public class TestngTestRunner extends AbstractTestNGCucumberTests {


    /*@Override
    @DataProvider(parallel = true)
    public Object [][] scenarios () {
        return super.scenarios();
    }*/
}
