package step_definitions;

import page_objects.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import page_objects.PageObjectManager;
import utils.TestContextSetup;

import java.util.List;

public class LoginPageStepDefinition {

    public WebDriver driver;
    TestContextSetup testContextSetup;
    PageObjectManager pageObjectManager;

    public LoginPageStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
    }


    @Given("^User is on login page$")
    public void user_is_on_login_page() throws Throwable {
        LoginPage newLoginPage = testContextSetup.pageObjectManager.getLoginPageObjects();
        newLoginPage.isUserNameFieldDisplayed();

    }

    @When("^User login to the application with valid username and valid password$")
    public void user_login_to_the_application_with_valid_username_and_valid_password(DataTable data) throws Throwable {
        List<List<String>> dataList =  data.asLists();
        LoginPage newLoginPage = testContextSetup.pageObjectManager.getLoginPageObjects();
        newLoginPage.loginToAdmin(dataList.get(0).get(0), dataList.get(0).get(1));


    }






}
