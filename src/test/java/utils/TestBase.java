package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {

    public WebDriver driver;
    ConfigFileReader configFileReader;

    public TestBase () {

    }


    public WebDriver webDriverManager () throws Exception {


        if (driver == null) {

            switch (FileReaderManager.getInstance().getConfigReader().getBrowser()){
                case "chrome" :
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox" :
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "edge" :
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
                case "chromeheadless" :
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions option = new ChromeOptions();
                    option.setHeadless(true);
                    driver = new ChromeDriver(option);

                default:
                    throw new Exception("Browser is not correct");
            }
            driver.get(FileReaderManager.getInstance().getConfigReader().getUrl());
            driver.manage().window().maximize();
        }
        return driver;
    }
}
