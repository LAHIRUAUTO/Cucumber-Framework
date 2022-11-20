package step_definitions;

import page_objects.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import page_objects.PageObjectManager;
import utils.TestContextSetup;

public class HomePageStepDefinition {

    public WebDriver driver;

    HomePage homePage;
    TestContextSetup testContextSetup;

    PageObjectManager pageObjectManager;



    public HomePageStepDefinition(TestContextSetup testContextSetup) {

        this.testContextSetup = testContextSetup;
    }




    @Then("^Home page is populated \"([^\"]*)\"$")
    public void home_page_is_populated(String strArg1) throws Throwable {
        HomePage newHomePage = testContextSetup.pageObjectManager.getHomePageObjects();
        testContextSetup.genericUtils.switchToIframe();
        testContextSetup.genericUtils.explicitWaitElementVisible(newHomePage.getAirlineLogo());
        newHomePage.isAirlineLogoDisplayed();


    }

    @And("^Toggle menu is displayed \"([^\"]*)\"$")
    public void toggle_menu_is_displayed(String strArgs1) throws Throwable {
        HomePage newHomePage = testContextSetup.pageObjectManager.getHomePageObjects();
        testContextSetup.genericUtils.switchToDefaultContent();
        newHomePage.isToggleMenuDisplayed();

    }




}
