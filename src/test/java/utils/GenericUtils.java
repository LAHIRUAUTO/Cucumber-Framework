package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class GenericUtils {

    public WebDriver driver;
    public GenericUtils (WebDriver driver) {
        this.driver = driver;
    }

    public void switchToIframe () {
        driver.switchTo().frame(0);
    }

    public void switchToDefaultContent () {
        driver.switchTo().defaultContent();
    }

    public void explicitWaitElementVisible (WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(element ));
    }

    public String getPropertyValue (String propertyKey) throws IOException {
        File src = new File(System.getProperty("user.dir") + "/src/test/resources/global.properties");
        FileInputStream objfile = new FileInputStream(src);
        Properties obj = new Properties();
        obj.load(objfile);
        String propertyValue = obj.getProperty(propertyKey);
        return propertyValue;
    }
}
