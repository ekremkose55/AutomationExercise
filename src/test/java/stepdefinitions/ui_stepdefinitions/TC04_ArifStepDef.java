package stepdefinitions.ui_stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import utilities.Driver;

public class TC04_ArifStepDef {

    LoginPage loginPage = new LoginPage();


    @When("user click Logout button")
    public void user_click_logout_button() {
        Driver.waitAndClick(loginPage.logoutButton);
    }

    @Then("verify that user is navigated to login page")
    public void verify_that_user_is_navigated_to_login_page() {
        Assert.assertTrue(loginPage.verifyLogin.isDisplayed());

    }
}
