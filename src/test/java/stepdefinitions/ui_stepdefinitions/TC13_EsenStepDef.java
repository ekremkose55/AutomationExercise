package stepdefinitions.ui_stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.ProductDetailPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC13_EsenStepDef {


    HomePage homePage = new  HomePage();
    ProductDetailPage productDetailPage = new ProductDetailPage();


    @And("Click View Product for any product on home page")
    public void clickViewProductForAnyProductOnHomePage() {
        homePage.viewProduct.click();
    }

    @And("Verify {string} is opened")
    public void verifyProductDetailIsOpened(String text) {
        String URL = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(URL.contains(text));

    }

    @When("Increase quantity to {int}")
    public void increaseQuantityTo(int arg0) {
       productDetailPage.quantity.clear();
       productDetailPage.quantity.sendKeys("4");
    }
    @Then("Click {string} button in the Product Details Page")
    public void clickAddToCartButtonInTheProductDetailsPage(String arg0) {
        productDetailPage.addToCart.click();
    }

    @And("Click {string} button in Product Details Page")
    public void clickViewCartButtonInTheHomepage(String arg0) {
        productDetailPage.viewCart.click();
    }

    @Then("Verify that product is displayed in cart page with exact quantity")
    public void verifyThatProductIsDisplayedInCartPageWithExactQuantity() {
        Assert.assertTrue(productDetailPage.exactQuantity.getText().contains("4"));

    }

    @Then("close the WebPage")
    public void closeTheWebPage() {
        Driver.closeDriver();
    }


}
