package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

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
}
