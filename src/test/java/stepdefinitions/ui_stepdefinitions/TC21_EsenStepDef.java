package stepdefinitions.ui_stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.xmlbeans.impl.xb.xsdschema.Facet;
import org.junit.Assert;
import pages.HomePage;
import pages.ProductsPage;
import utilities.ReusableMethods;

public class TC21_EsenStepDef {

    HomePage homePage = new HomePage();
    ProductsPage productsPage = new ProductsPage();
    ReusableMethods reusableMethods = new ReusableMethods();
    Faker faker = new Faker();

    @When("Click on {string} button in the homepage")
    public void clickOnProductsButtonInTheHomepage(String arg01) {
        homePage.products.click();
    }

    @And("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verifyUserIsNavigatedToALLPRODUCTSPageSuccessfully() {
        Assert.assertTrue(homePage.allProducts.isDisplayed());
    }

    @And("User Click on {string} button in the products page")
    public void userClickOnViewProductButtonInTheProductsPage(String arg01) {
        productsPage.viewProduct.click();

    }

    @Then("Verify {string} is visible in the products page")
    public void verifyWriteYourReviewIsVisibleInTheProductsPage(String arg01) {
        Assert.assertTrue(productsPage.writeYourReview.isDisplayed());
    }

    @When("Enter {string}, {string} and {string}")
    public void enterNameEmailAndReview(String txt1, String txt2, String txt3) {
        productsPage.yourName.sendKeys(faker.name().name());
        productsPage.emailAddress.sendKeys(faker.internet().emailAddress());
        productsPage.addReview.sendKeys("Add Review Here!");
    }

    @And("Click {string} button in the product page")
    public void clickSubmitButtonInTheProductPage(String arg01) {
        productsPage.submit.click();
    }


    @Then("Verify success message {string} in the product page")
    public void verifySuccessMessageThankYouForYourReviewInTheProductPage(String arg01) {
        Assert.assertTrue(productsPage.successMessage.isDisplayed());
    }
}
