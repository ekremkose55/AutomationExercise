package stepdefinitions.ui_stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductsPage;
import utilities.Driver;

public class TC17_TugbaStepDef {

    ProductsPage productsPage = new ProductsPage();

     @Given("user click Products button")
    public void userClickProductsButton() {
         Driver.waitAndClick(productsPage.productsButton);

    }

    @And("user add product to cart")
    public void user_add_product_to_cart() {
        productsPage.productClick(1);
        Driver.waitAndClick(productsPage.viewCart);


    }
    @Then("verify cart page displayed")
    public void verify_cart_page_displayed() {
        Assert.assertTrue(productsPage.verifyCartPage.isDisplayed());
    }
    @When("user click {string} button to the particular product")
    public void user_click_button_to_the_particular_product(String string) {
        Driver.waitAndClick(productsPage.xButton);
    }
    @Then("verify product is removed from cart")
    public void verify_product_is_removed_from_cart() {
        Assert.assertTrue(productsPage.verifyEmptyCart.isEnabled());
    }


}
