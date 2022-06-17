package stepdefinitions.ui_stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.HomePage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.sql.SQLOutput;

public class TC11_NurayStepDef {

    HomePage pageHome= new HomePage();
    Faker faker = new Faker();

    @Given("Launch browser Navigate to url {string}")
    public void launchBrowserNavigateTo(String url) {
        Driver.getDriver().get(url);

    }

    @Then("User Verify that home page is visible {string} successfully")
    public void userVerifyThatHomePageIsVisibleAutomationExerciseSuccessfully(String text) {
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(text));
    }

    @And("User Click {string} button")
    public void userClickCartButton(String text) {
       // pageHome.cartButton.click();
        ReusableMethods.waitFor(2);
        pageHome.homePageClick(text);

    }

    @Then("Scroll down to footer")
    public void scrollDownToFooter() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        //js.executeScript("window.scrollBy(0,350)", "");
        js.executeScript("arguments[0].scrollIntoView();", pageHome.footerElement);
//     Actions actions=new Actions(Driver.getDriver());
//        actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();


    }

    @Then("Verify text {string}")
    public void verifyTextSUBSCRIPTION(String text) {
        String actualText=pageHome.subscriptionText.getText();
        Assert.assertEquals(actualText,text);


    }

    @And("Enter email address in input and click arrow button")
    public void enterEmailAddressInInputAndClickArrowButton() {

        pageHome.subscriptionEmailInput.sendKeys(faker.internet().emailAddress());
        ReusableMethods.waitFor(1);
        pageHome.subscriptionArrowButton.click();
        ReusableMethods.waitFor(1);
        System.out.println(pageHome.subscriptionSuccessText.getText());



    }

    @Then("Verify success message {string} is visible")
    public void verifySuccessMessageYouHaveBeenSuccessfullySubscribedIsVisible(String text) {
         Assert.assertTrue(pageHome.subscriptionSuccessText.getText().contains(text));
         Assert.assertTrue(pageHome.subscriptionSuccessText.isDisplayed());


    }


}
