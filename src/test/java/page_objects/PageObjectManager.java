package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageObjectManager {

    public LoginPage newLoginPage;
    public HomePage newHomePage;
    public WebDriver driver;


    public PageObjectManager (WebDriver driver) {
        this.driver = driver;

    }

    public LoginPage getLoginPageObjects () {
        newLoginPage = PageFactory.initElements(driver, LoginPage.class);
        return newLoginPage;

    }

    public HomePage getHomePageObjects () {
        newHomePage = PageFactory.initElements(driver, HomePage.class);
        return newHomePage;

    }

}
