package stepdefinitions.ui_stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutoExePage;
import utilities.Driver;

public class TC18_EkremStepDef {
    AutoExePage autoPage = new AutoExePage();
    Actions actions=new Actions(Driver.getDriver());

    @When("Verify that categories are visible on left side bar")
    public void verify_that_categories_are_visible_on_left_side_bar() {
        System.out.println(autoPage.categoryText.getText());
        Assert.assertTrue(autoPage.categoryText.isDisplayed());
    }

    @When("Click on {string} category")
    public void click_on_category(String string) {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        autoPage.womenButton.click(); }

    @When("Click on any category link under {string} category, for example: Dress")
    public void click_on_any_category_link_under_category_for_example_dress(String string) {
        autoPage.dressButton.click();}

    @When("Verify that category page is displayed and confirm text {string}")
    public void verify_that_category_page_is_displayed_and_confirm_text(String string) {
        System.out.println(autoPage.womenDressBarText.getText());
        Assert.assertTrue(autoPage.womenDressBarText.isDisplayed());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }

    @When("On left side bar, click on any sub-category link of {string} category")
    public void on_left_side_bar_click_on_any_sub_category_link_of_category(String string) {
        autoPage.menButton.click();
        autoPage.tshirtsButton.click();}

    @Then("Verify that user is navigated to that category page")
    public void verify_that_user_is_navigated_to_that_category_page() {
        Assert.assertTrue(autoPage.menCategoryText.isDisplayed());
    }



}
