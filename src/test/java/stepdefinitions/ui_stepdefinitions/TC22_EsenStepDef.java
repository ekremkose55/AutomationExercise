package stepdefinitions.ui_stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.HomePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC22_EsenStepDef {

    HomePage homePage = new HomePage();
    ReusableMethods reusableMethods = new ReusableMethods();


    @When("Scroll to bottom of page")
    public void scroll_to_bottom_of_page() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        //js.executeScript("window.scrollBy(0,350)", "");
        js.executeScript("arguments[0].scrollIntoView();", homePage.footerElement);
//     Actions actions=new Actions(Driver.getDriver());
//        actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();

    }
    @And("Verify {string} are visible")
    public void verify_are_visible(String string) {
        Assert.assertTrue(homePage.recommendedItems.isDisplayed());
    }
    @And("Click on {string} on Recommended product")
    public void click_on_on_recommended_product(String string) {
        ReusableMethods.fluentWait(homePage.addToCart, 3).click();

    }
    @Then("Verify that product is displayed in cart page")
    public void verify_that_product_is_displayed_in_cart_page() {
        Assert.assertTrue(homePage.stylishDress.isDisplayed());
    }

}
