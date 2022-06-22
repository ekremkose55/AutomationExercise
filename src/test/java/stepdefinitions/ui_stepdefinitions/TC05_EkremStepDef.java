package stepdefinitions.ui_stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.RegistrationPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class TC05_EkremStepDef {
    RegistrationPage registrationPage = new RegistrationPage();

    @Given("Navigate to url {string}")
    public void navigate_to_url(String string) {
    Driver.getDriver().get(ConfigurationReader.getProperty("url")); 
    Driver.wait(2);}

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

}
