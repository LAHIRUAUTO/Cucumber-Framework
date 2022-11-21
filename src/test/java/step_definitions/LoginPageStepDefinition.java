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
    LoginPage newLoginPage;

    public LoginPageStepDefinition(TestContextSetup testContextSetup) {

        this.testContextSetup = testContextSetup;
        this.newLoginPage = testContextSetup.pageObjectManager.getLoginPageObjects();

    }


    @Given("^User is on login page$")
    public void user_is_on_login_page() throws Throwable {

        newLoginPage.isUserNameFieldDisplayed();

    }

    @When("^User login to the application with valid (.+) and valid (.+)$")
    public void user_login_to_the_application_with_username_and_password(String username, String password) throws Throwable {
        //List<List<String>> dataList =  data.asLists();
        //newLoginPage.loginToAdmin(dataList.get(0).get(0), dataList.get(0).get(1));
        newLoginPage.loginToAdmin(username, password);


    }






}
