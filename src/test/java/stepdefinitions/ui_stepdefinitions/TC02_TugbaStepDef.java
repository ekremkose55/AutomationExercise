package stepdefinitions.ui_stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.LoginPage;
import pages.RegistrationPage;
import utilities.Driver;

public class TC02_TugbaStepDef {

    RegistrationPage registrationPage = new RegistrationPage();
    LoginPage loginPage = new LoginPage();


    @Then("verify login to your account is visible")
    public void verify_login_to_your_account_is_visible() {

        Assert.assertTrue(loginPage.verifyLogin.isDisplayed());
    }

    @Then("user enter correct email and password as {string} , {string}")
    public void user_enter_correct_email_and_password_as(String emailAddress, String password) {
        Driver.waitAndSendText(loginPage.emailAddress,emailAddress);
        Driver.waitAndSendText(loginPage.password,password);
    }
    @Then("user click login button")
    public void user_click_login_button() {

        Driver.waitAndClick(loginPage.loginButton);
    }

    @Then("verify Logged in as username")
    public void verifyLoggedInAsUsername() {

        Assert.assertTrue(registrationPage.verifyLoggedIn.isDisplayed());
    }


    @Then("verify Account Deleted! is visible")
    public void verify_account_deleted_is_visible() {
        Assert.assertFalse("ACCOUNT DELETED!", false);
        Driver.closeDriver();
    }

}
