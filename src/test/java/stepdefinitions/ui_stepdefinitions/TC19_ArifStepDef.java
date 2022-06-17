package stepdefinitions.ui_stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.ProductsPage;
import utilities.Driver;

public class TC19_ArifStepDef {

    ProductsPage productsPage = new ProductsPage();

    @Then("user clicks on {string} button")
    public void user_clicks_on_button(String string) {
        Driver.waitAndClick(productsPage.productsButton);

    }
    @Then("verify that Brands are visible on left side bar")
    public void verify_that_brands_are_visible_on_left_side_bar() {
        Assert.assertTrue(productsPage.brands.isDisplayed());

    }
    @Then("user clicks on any brand name")
    public void user_clicks_on_any_brand_name() {
        Driver.waitAndClick(productsPage.poloBrand);

    }
    @Then("verify that user is navigated to brand page and brand products are displayed")
    public void verify_that_user_is_navigated_to_brand_page_and_brand_products_are_displayed() {
        Assert.assertTrue(productsPage.brandProductsTitle.isDisplayed());
    }
    @Then("on left side bar, user clicks on any other brand link")
    public void on_left_side_bar_user_clicks_on_any_other_brand_link() {
        Driver.waitAndClick(productsPage.madameBrand);

    }
    @Then("verify that user is navigated to that brand page and can see products")
    public void verify_that_user_is_navigated_to_that_brand_page_and_can_see_products() {
        Assert.assertTrue(productsPage.brandProductsTitle.isDisplayed());

    }
}
