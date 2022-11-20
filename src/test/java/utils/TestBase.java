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
    public TestContextSetup testContextSetup;


    public WebDriver webDriverManager () throws Exception {



        File src = new File(System.getProperty("user.dir") + "/src/test/resources/global.properties");
        FileInputStream objfile = new FileInputStream(src);
        Properties obj = new Properties();
        obj.load(objfile);
        String browser = obj.getProperty("browser");
        String url = obj.getProperty("url");

        if (driver == null) {

            switch (browser){
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
            driver.get(url);
            driver.manage().window().maximize();
        }
        return driver;
    }
}
