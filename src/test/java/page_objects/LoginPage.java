package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {

    public WebDriver driver;

    public LoginPage (WebDriver driver) {
        this.driver = driver;
    }

    @FindBy (xpath = "//input[@id='j_username']")
    WebElement username;

    @FindBy (xpath = "//input[@id='j_password']")
    WebElement password;

    @FindBy (xpath = "//input[@id='btnLogin']")
    WebElement loginButton;

    public void loginToAdmin (String userName, String passWord) {
        username.sendKeys(userName);
        password.sendKeys(passWord);
        loginButton.click();
    }

    public void isUserNameFieldDisplayed () {

        Assert.assertTrue(username.isDisplayed(), "user name field displayed");
    }


}
