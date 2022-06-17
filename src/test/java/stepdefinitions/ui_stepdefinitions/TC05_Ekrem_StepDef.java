package stepdefinitions.ui_stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.Ekrem_Test_Page;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.print.DocFlavor;
import javax.swing.*;

public class TC05_Ekrem_StepDef {
    Ekrem_Test_Page ekremTestPage = new Ekrem_Test_Page();

    @Given("Navigate to url {string}")
    public void navigate_to_url(String string) {
        Driver.getDriver().get(ConfigurationReader.getProperty("url")); }

    @When("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
    Assert.assertTrue(ekremTestPage.homePage.isDisplayed()); }

    @When("Click on {string} button")
    public void click_on_button(String string) { ekremTestPage.signUp.click();}

    @When("Verify {string} is visible")
    public void verify_is_visible(String string) {
    Assert.assertTrue(ekremTestPage.newUserSigUpText.isDisplayed()); }

    @When("Enter name and already registered email address")
    public void enter_name_and_already_registered_email_address() {
     ekremTestPage.nameBox.sendKeys(ConfigurationReader.getProperty("user_id1"));
     ekremTestPage.emailBox.sendKeys(ConfigurationReader.getProperty("user_id1_mail")); }

    @When("Click {string} button")
    public void click_button(String string) { ekremTestPage.signUpButton.click(); }

    @Then("Verify error {string} is visible")
    public void verify_error_is_visible(String string) {
    Assert.assertTrue(ekremTestPage.emailVerifyText.isDisplayed()); }

    @When("Click on {string} button sign")
    public void click_on_button_sign(String string) {
    ekremTestPage.contactUsButton.click();
    }

    @When("Verify {string} is visible text")
    public void verify_is_visible_text(String string) {
    Assert.assertTrue(ekremTestPage.getInTouchText.isDisplayed());
    }

    @When("Enter name, email, subject and message")
    public void enter_name_email_subject_and_message() {
    ekremTestPage.nameTestBox.sendKeys(ConfigurationReader.getProperty("test_name"));
    ekremTestPage.emailTestBox.sendKeys(ConfigurationReader.getProperty("test_email"));
    ekremTestPage.subjectTestBox.sendKeys(ConfigurationReader.getProperty("test_subject"));
    ekremTestPage.messageTestBox.sendKeys(ConfigurationReader.getProperty("test_text"));
    }

//    @When("Upload file")
//    public void upload_file() {
//       String filePath = "C:\\Users\\ekrem\\Desktop\\automation exercise project";
//       ekremTestPage.uploadFile.sendKeys(filePath);
//    }

    @When("Click {string} button sign")
    public void click_button_sign(String string) {

        Driver.wait(5);
        Driver.waitAndClick(ekremTestPage.submitbutton,2);
               }

    @When("Users Click OK button")
    public void users_click_ok_button() {
        Driver.getDriver().switchTo().alert().accept();
    }

    @When("Verify success message {string} is visible")
    public void verify_success_message_is_visible(String string) {
    }

    @Then("Click {string} button and verify that landed to home page successfully")
    public void click_button_and_verify_that_landed_to_home_page_successfully(String string) {
       // Driver.getDriver().close();
    }


    Actions actions=new Actions(Driver.getDriver());
    @When("Verify that categories are visible on left side bar")
    public void verify_that_categories_are_visible_on_left_side_bar() {
    actions.sendKeys(Keys.PAGE_DOWN).perform();
    ekremTestPage.categoryBar.isDisplayed();
    }


    @When("Click on {string} category")
    public void click_on_category(String string) {
     ReusableMethods.waitFor(3);
     actions.click(ekremTestPage.womenButton).perform();
    }
    @When("Click on any category link under {string} category, for example: Dress")
    public void click_on_any_category_link_under_category_for_example_dress(String string) {

    }
    @When("Verify that category page is displayed and confirm text {string}")
    public void verify_that_category_page_is_displayed_and_confirm_text(String string) {

    }
    @When("On left side bar, click on any sub-category link of {string} category")
    public void on_left_side_bar_click_on_any_sub_category_link_of_category(String string) {

    }
    @Then("Verify that user is navigated to that category page")
    public void verify_that_user_is_navigated_to_that_category_page() {

    }


}
