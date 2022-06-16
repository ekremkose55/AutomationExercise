package stepdefinitions.ui_stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import jdk.nashorn.internal.runtime.regexp.joni.Config;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductsPage;
import pages.RegistrationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.sql.SQLOutput;

public class TC15_NurayStepDef {
    LoginPage loginPage= new LoginPage();
    Faker faker =new Faker();
    RegistrationPage regPage= new RegistrationPage();
    HomePage homePage =new HomePage();
    ProductsPage productsPage =new ProductsPage();

    @Then("Fill all details in Signup and create account")
    public void fillAllDetailsInSignupAndCreateAccount() {
//        Name=faker.name().firstName();
//        email=faker.internet().emailAddress();
        loginPage.nameInput.sendKeys(ConfigReader.getProperty("accountName"));
        loginPage.emailInput2.sendKeys(ConfigReader.getProperty("accountEmail"));
        loginPage.signUpButton.click();
        regPage.title.click();
        regPage.password.sendKeys(faker.internet().password());
        regPage.days.sendKeys("11");
        regPage.months.sendKeys("January");
        regPage.years.sendKeys("1990");
        regPage.firstname.sendKeys("Mikes");
        regPage.lastname.sendKeys("Williams");
        regPage.address1.sendKeys(faker.address().streetName());
        regPage.country.sendKeys(faker.address().country());
        regPage.state.sendKeys(faker.address().state());
        regPage.city.sendKeys(faker.address().city());
        regPage.zipcode.sendKeys(faker.address().zipCode());
        regPage.mobileNumber.sendKeys(faker.phoneNumber().cellPhone());

        regPage.createAccount.click();


    }

    @Then("Verify {string} and click {string} button")
    public void verifyACCOUNTCREATEDAndClickContinueButton(String text1,String text2) {
        Assert.assertEquals(productsPage.accountCreated.getText(),text1);
        HomePage.homePageClick(text2);


    }

    @Then("Verify {string} at top")
    public void verifyLoggedInAsUsernameAtTop(String Name) {
        System.out.println(homePage.upAccountName.getText());
      Assert.assertEquals(homePage.upAccountName.getText(),ConfigReader.getProperty(Name));

    }

    @And("Add products to cart")
    public void addProductsToCart() {
        productsPage.productClick(1);


    }

    @Then("Click {string} button Verify that cart page is displayed")
    public void clickCartButtonVerifyThatCartPageIsDisplayed(String text) {
        HomePage.homePageClick(text);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("cart"));

    }

    @Then("Click Proceed To Checkout Verify Address Details and Review Your Order")
    public void clickProceedToCheckoutVerifyAddressDetailsAndReviewYourOrder() {
        productsPage.checkoutButton.click();
        Assert.assertTrue(productsPage.addressDetail.getText().contains("Address Details"));
        Assert.assertTrue(productsPage.reviewOrder.getText().contains("Review Your Order"));


    }


    @Then("Enter payment details: Name on Card, Card Number, CVC, Expiration date")
    public void enterPaymentDetailsNameOnCardCardNumberCVCExpirationDate() {
        productsPage.nameCard.sendKeys("Mike Williams");
        productsPage.cardNum.sendKeys("123456789123456");
        productsPage.cvcNum.sendKeys("123");
        productsPage.expDate.sendKeys("12");
        productsPage.expYear.sendKeys("2025");
        productsPage.payButton.click();







    }

    @And("Enter description in comment text area and click Place Order")
    public void enterDescriptionInCommentTextAreaAndClickPlaceOrder() {

            productsPage.testArea.sendKeys("Thank You");
            productsPage.placeOrder.click();
    }


    @Then("Enter payment details: {string},{string},{string}, {string}, {string}")
    public void enterPaymentDetails(String NameCard, String CardNumber, String cvc, String ExpirationDate, String ExpirationYear) {
        productsPage.nameCard.sendKeys(NameCard);
        productsPage.cardNum.sendKeys(CardNumber);
        productsPage.cvcNum.sendKeys(cvc);
        productsPage.expDate.sendKeys(ExpirationDate);
        productsPage.expYear.sendKeys(ExpirationYear);
        productsPage.payButton.click();
        ReusableMethods.waitFor(1);

    }



    @Then("User Click Pay and Confirm Order button")
    public void userClickPayAndConfirmOrderButton() {
        ReusableMethods.waitFor(1);
        productsPage.payButton.click();
        ReusableMethods.waitFor(1);
    }
}
