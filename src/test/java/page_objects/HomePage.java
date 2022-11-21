package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.FileReaderManager;
import utils.GenericUtils;
import utils.TestContextSetup;

public class HomePage extends GenericUtils{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//img[@class='airlineLogo']")
    WebElement airlineLogo;



    public WebElement getAirlineLogo() {
        return airlineLogo;
    }

    @FindBy (xpath = "//a[@class='menu-toggle']")
    WebElement toggleMenu;

    public WebElement getLoggedInUserDetails() {
        return loggedInUserDetails;
    }

    public WebElement getLogoutbutton() {
        return logoutbutton;
    }

    @FindBy (xpath = "//div[@class='name fll']")
    WebElement loggedInUserDetails;


    @FindBy(xpath = "//a[@class='logout']")
    @CacheLookup
    WebElement logoutbutton;



    public void isAirlineLogoDisplayed () {

        Assert.assertTrue(airlineLogo.isDisplayed(), "Airline Logo displayed");
    }

    public void isToggleMenuDisplayed () {

        Assert.assertTrue(toggleMenu.isDisplayed(), "Airline Logo displayed");
    }





    @FindBy(xpath = "//*[@id=\"ui-id-2\"]\n")
    @CacheLookup
    WebElement dashboard;

    @FindBy(xpath = "//a[@class='menu-toggle']")
    @CacheLookup
    WebElement tooglemenu;

    public void clickToggleMenu () throws InterruptedException {
        explicitWaitElementVisible(tooglemenu);
        explicitWaitElementClickable(tooglemenu);
        threadSleep();
        click(tooglemenu);
    }

    @FindBy (xpath = "//a[@class='masterdata']")
    @CacheLookup
    WebElement maintenancetab;

    @FindBy (xpath = "//a[@class='security']")
    @CacheLookup
    WebElement security;

    @FindBy (xpath = "//a[@class='role']")
    @CacheLookup
    WebElement role;

    @FindBy (xpath = "/html/body/header/nav/ul/li[2]/ul/li[1]/ul/li[2]/a\n")
    @CacheLookup
    WebElement functionalUsage;

    @FindBy (xpath = "/html[1]/body[1]/header[1]/nav[1]/ul[1]/li[2]/ul[1]/li[2]/a[1]")
    WebElement geography;

    @FindBy (xpath = "//a[@class='airport']")
    WebElement airport;

    @FindBy (xpath = "//a[@class='airportDST']")
    WebElement airportDST;

    @FindBy (xpath = "//a[@class='city']")
    WebElement city;


    @FindBy (xpath = "//a[@class='country']")
    WebElement country;

    @FindBy (xpath = "//a[@class='salesTerritory']")
    WebElement territory;

    @FindBy (xpath = "//a[@class='station']")
    WebElement station;

    @FindBy (xpath = "//a[@class='nationality']")
    WebElement nationality;



}
