package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.RegistrationPage;
import utilities.Driver;

public class StepDefinitions {
    RegistrationPage registrationPage = new RegistrationPage();

    @Given("Navigate to url {string}")
    public void navigate_to_url(String string)
    {Driver.getDriver().get("http://automationexercise.com");}

    @Given("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {

    }
    @Given("Click on {string} button")
    public void click_on_button(String string) {

    }
    @Given("Verify {string} is visible")
    public void verify_is_visible(String string) {

    }
    @Given("Enter name and email address")
    public void enter_name_and_email_address() {

    }
    @Given("Click {string} button")
    public void click_button(String string) {

    }
    @Then("Verify that {string} is visible")
    public void verify_that_is_visible(String string) {

    }
}
