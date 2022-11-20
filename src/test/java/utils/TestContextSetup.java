package utils;

import org.openqa.selenium.WebDriver;
import page_objects.PageObjectManager;

import java.io.IOException;

public class TestContextSetup {

    public WebDriver driver;
    public PageObjectManager pageObjectManager;
    public TestBase testBase;
    public GenericUtils genericUtils;

    public TestContextSetup () throws Exception {
        testBase = new TestBase();
        pageObjectManager = new PageObjectManager(testBase.webDriverManager());
        genericUtils = new GenericUtils(testBase.webDriverManager());
    }

}
