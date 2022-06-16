package stepdefinitions.ui_stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.HomePage;
import pages.RegistrationPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC26_TugbaStepDef {

    HomePage pageHome = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();

    JavascriptExecutor js = (JavascriptExecutor)  Driver.getDriver();


    @Given("user scroll down the page")
    public void user_scroll_down_the_page()  {
       // JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        js.executeScript("arguments[0].scrollIntoView();", pageHome.footerElement);

//        js.executeScript("window.scrollBy(0,9000)");


    }
    @Then("verify {string} visibility")
    public void verify_visibility(String string) {

        Assert.assertTrue(pageHome.subscriptionText.isDisplayed());
    }
    @When("user scroll up the page")
    public void user_scroll_up_the_page() {
      //  JavascriptExecutor js = (JavascriptExecutor)  Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", registrationPage.verifyHomePage );
       // js.executeScript("window.scrollBy(0,-9000)");

    }
    @Then("verify {string} text")
    public void verify_text(String string) {
        Assert.assertTrue(pageHome.verifyFullFledged.isDisplayed());

    }

}
