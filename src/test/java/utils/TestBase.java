package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

    public WebDriver driver;

    public WebDriver webDriverManager () {

        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get("https://flyegypt.avtra.com/admin/login?error=true&carrier_code=FT");
            driver.manage().window().maximize();
        }
        return driver;
    }
}
