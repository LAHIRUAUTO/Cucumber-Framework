package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {

    public WebDriver driver;

    public HomePage (WebDriver driver) {
        this.driver = driver;
    }

    @FindBy (xpath = "//img[@class='airlineLogo']")
    WebElement airlineLogo;

    public WebElement getAirlineLogo() {
        return airlineLogo;
    }

    @FindBy (xpath = "//a[@class='menu-toggle']")
    WebElement toggleMenu;

    @FindBy(xpath = "//a[@class='logout']")
    @CacheLookup
    WebElement logoutbutton;



    public void isAirlineLogoDisplayed () {
        Assert.assertTrue(airlineLogo.isDisplayed(), "Airline Logo displayed");
    }

    public void isToggleMenuDisplayed () {

        Assert.assertTrue(toggleMenu.isDisplayed(), "Airline Logo displayed");
    }

    public void clickLogoutButton () {

        logoutbutton.click();
    }
}
