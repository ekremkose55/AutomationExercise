package stepdefinitions.ui_stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.LoginPage;
import utilities.Driver;

public class TC03_ArifStepDef {

    Faker faker =new Faker();
    LoginPage loginPage = new LoginPage();

    @Then("user enters incorrect email and password as {string} and {string}")
    public void userEntersIncorrectEmailAndPasswordAsAnd(String Email, String Password) {
        Email= faker.internet().emailAddress();
        Password= faker.internet().password();
        Driver.waitAndSendText(loginPage.emailAddress,Email);
        Driver.waitAndSendText(loginPage.password,Password);
    }

    @Then("verify error Your email or password is incorrect! is visible")
    public void verify_error_your_email_or_password_is_incorrect_is_visible() {
        Assert.assertTrue(loginPage.verifyIncorrectEnter.isDisplayed());

    }



}
