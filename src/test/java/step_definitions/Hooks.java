package step_definitions;


import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class Hooks {

    @Before
    public void beforeScenario() throws Exception {
    }

    @After
    public void afterScenario() throws InterruptedException {

    }

    @AfterStep
    public void addScreenshot(Scenario scenario) throws IOException {

    }
}
