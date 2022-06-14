package stepdefinitions.ui_stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.RegistrationPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Register_StepDef {
    RegistrationPage registrationPage = new RegistrationPage();

    @Given("Navigate to url {string}")
    public void navigate_to_url(String string) {
    Driver.getDriver().get(ConfigurationReader.getProperty("url")); }

    @When("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
    Assert.assertTrue(registrationPage.homePage.isDisplayed()); }

    @When("Click on {string} button")
    public void click_on_button(String string) {
    registrationPage.signUp.click();}

    @When("Verify {string} is visible")
    public void verify_is_visible(String string) {
    Assert.assertTrue(registrationPage.newUserSigUpText.isDisplayed()); }

    @When("Enter name and already registered email address")
    public void enter_name_and_already_registered_email_address() {
     registrationPage.nameBox.sendKeys(ConfigurationReader.getProperty("user_id1"));
     registrationPage.emailBox.sendKeys(ConfigurationReader.getProperty("user_id1_mail")); }

    @When("Click {string} button")
    public void click_button(String string) {
     registrationPage.signUpButton.click(); }

    @Then("Verify error {string} is visible")
    public void verify_error_is_visible(String string) {
    Assert.assertTrue(registrationPage.emailVerifyText.isDisplayed()); }

    @When("Click on {string} button sign")
    public void click_on_button_sign(String string) {
    registrationPage.contactUsButton.click();
    }

    @When("Verify {string} is visible text")
    public void verify_is_visible_text(String string) {
    Assert.assertTrue(registrationPage.getInTouchText.isDisplayed());
    }

    @When("Enter name, email, subject and message")
    public void enter_name_email_subject_and_message() {
    registrationPage.nameTestBox.sendKeys(ConfigurationReader.getProperty("test_name"));
    registrationPage.emailTestBox.sendKeys(ConfigurationReader.getProperty("test_email"));
    registrationPage.subjectTestBox.sendKeys(ConfigurationReader.getProperty("test_subject"));
    registrationPage.messageTestBox.sendKeys(ConfigurationReader.getProperty("test_text"));

    }

    @When("Upload file")
    public void upload_file() {

    }

    @When("Click {string} button sign")
    public void click_button_sign(String string) {

    }
    @When("Click OK button")
    public void click_ok_button() {


    }

    @When("Verify success message {string} is visible")
    public void verify_success_message_is_visible(String string) {
    }

    @Then("Click {string} button and verify that landed to home page successfully")
    public void click_button_and_verify_that_landed_to_home_page_successfully(String string) {


    }


}
