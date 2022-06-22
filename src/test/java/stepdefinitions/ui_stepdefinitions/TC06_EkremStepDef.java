package stepdefinitions.ui_stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutoExePage;
import pages.RegistrationPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC06_EkremStepDef {
    AutoExePage autoPage = new AutoExePage();
    Actions actions=new Actions(Driver.getDriver());

    @When("User Click on {string} button")
    public void user_click_on_button(String string) { autoPage.contactUsButton.click(); }


    @When("User Verify {string} is visible")
    public void user_verify_is_visible(String string) {
        System.out.println(autoPage.getInTouchText);
        System.out.println(autoPage.getInTouchText.getText());
        Assert.assertTrue(autoPage.getInTouchText.isDisplayed());
        //System.out.println(autoPage.contactUsText.getText());
        // Assert.assertTrue(autoPage.contactUsText.isDisplayed());
    }
    @When("Enter name, email, subject and message")
    public void enter_name_email_subject_and_message() {
        autoPage.nameTestBox.sendKeys(ConfigurationReader.getProperty("test_name"));
        autoPage.emailTestBox.sendKeys(ConfigurationReader.getProperty("test_email"));
        autoPage.subjectTestBox.sendKeys(ConfigurationReader.getProperty("test_subject"));
        autoPage.messageTestBox.sendKeys(ConfigurationReader.getProperty("test_text"));
        Driver.wait(5);

        actions.keyDown(Keys.CONTROL).sendKeys(Keys.PAGE_DOWN).perform();
    }
    @When("Upload file")
    public void upload_file() {
        String filePath = "C:\\Users\\ekrem\\Desktop\\ae project\\AE file.txt";
        autoPage.uploadButton.sendKeys(filePath);
        Driver.wait(1);
    }

    @When("User Click {string} button")
    public void user_click_button(String string) {

        autoPage.submitButton.click();

    }

    @When("Click OK button")
    public void click_ok_button() {
        Driver.wait(5);
        Driver.getDriver().switchTo().alert().accept();
        Driver.wait(2);
    }

    @When("Verify success message {string} is visible")
    public void verify_success_message_is_visible(String string) {

    }
    @Then("Click {string} button and verify that landed to home page successfully")
    public void click_button_and_verify_that_landed_to_home_page_successfully(String string) {

    }

}
