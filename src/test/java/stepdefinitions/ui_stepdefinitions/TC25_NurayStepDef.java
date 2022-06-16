package stepdefinitions.ui_stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;

public class TC25_NurayStepDef {

   HomePage homePage= new HomePage();

    @When("Click on arrow at bottom right side to move upward")
    public void clickOnArrowAtBottomRightSideToMoveUpward() {
        homePage.scrollUpArrow.click();


    }

    @Then("Verify that page is scrolled up and {string} text is visible on screen")
    public void verifyThatPageIsScrolledUpAndFullFledgedPracticeWebsiteForAutomationEngineersTextIsVisibleOnScreen(String text) {
        Assert.assertEquals(homePage.upTitle.getText(),text);

    }
}
