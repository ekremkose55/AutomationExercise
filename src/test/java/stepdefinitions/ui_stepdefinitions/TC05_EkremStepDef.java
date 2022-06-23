package stepdefinitions.ui_stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutoExePage;
import utilities.ConfigurationReader;
import utilities.Driver;


public class TC05_EkremStepDef {
    AutoExePage autoPage = new AutoExePage();
    Actions actions=new Actions(Driver.getDriver());


    //--------------------------TC05 Codes--------------------------------------------------------
    @Given("Navigate to url {string}")
    public void navigate_to_url(String string) {
        Driver.getDriver().get(ConfigurationReader.getProperty("url")); }

    @When("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        Assert.assertTrue(autoPage.homePage.isDisplayed()); }

    @When("Click on {string} button")
    public void click_on_button(String string) { autoPage.signUp.click();}

    @When("Verify {string} is visible")
    public void verify_is_visible(String string) {
        Assert.assertTrue(autoPage.newUserSigUpText.isDisplayed()); }

    @When("Enter name and already registered email address")
    public void enter_name_and_already_registered_email_address() {
        autoPage.nameBox.sendKeys(ConfigurationReader.getProperty("user_id1"));
        autoPage.emailBox.sendKeys(ConfigurationReader.getProperty("user_id1_mail")); }

    @When("Click {string} button")
    public void click_button(String string) { autoPage.signUpButton.click(); }

    @Then("Verify error {string} is visible")
    public void verify_error_is_visible(String string) {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertTrue(autoPage.emailVerifyText.isDisplayed()); 
    }

    //----------------------TC06 Codes--------------------------------------------------------------
    //----------------------TC18 Codes------------------------------------------------------------------------
    //-------------------TC23 Codes -------------------------------------------------------


}
