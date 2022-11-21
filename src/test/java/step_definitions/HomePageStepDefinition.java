package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import page_objects.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import page_objects.PageObjectManager;
import utils.TestContextSetup;

public class HomePageStepDefinition {


    TestContextSetup testContextSetup;
    HomePage newHomePage;

    public HomePageStepDefinition(TestContextSetup testContextSetup) {

        this.testContextSetup = testContextSetup;
        this.newHomePage = testContextSetup.pageObjectManager.getHomePageObjects();
    }




    @Then("^Home page is populated \"([^\"]*)\"$")
    public void home_page_is_populated(String strArg1) throws Throwable {

        testContextSetup.genericUtils.sleeping(5000);
        testContextSetup.genericUtils.switchToIframe();
        testContextSetup.genericUtils.explicitWaitElementVisible(newHomePage.getAirlineLogo());
        newHomePage.isAirlineLogoDisplayed();


    }

    @And("^Toggle menu is displayed \"([^\"]*)\"$")
    public void toggle_menu_is_displayed(String strArgs1) throws Throwable {
        testContextSetup.genericUtils.switchToDefaultContent();
        newHomePage.isToggleMenuDisplayed();

    }

    @Given("^User has this scenario$")
    public void user_has_this_scenario() throws Throwable {
        System.out.println("User has this scenario");
    }

    @When("^User run this scenario$")
    public void user_run_this_scenario() throws Throwable {
        System.out.println("User run this scenario");
    }

    @Then("^It should be run on the same browser session$")
    public void it_should_be_run_on_the_same_browser_session() throws Throwable {
        System.out.println("It should be run on the same browser session");
    }





}
