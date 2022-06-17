package stepdefinitions.ui_stepdefinitions;

import com.github.javafaker.Faker;
import com.github.javafaker.Name;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.CheckoutPage;
import pages.HomePage;
import pages.ProductsPage;
import pages.RegistrationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC14_EsenStepDef {


    HomePage homePage = new HomePage();
    ReusableMethods reusableMethods = new ReusableMethods();
    ProductsPage productsPage = new ProductsPage();
    CheckoutPage checkoutPage = new CheckoutPage();
    RegistrationPage registrationPage = new RegistrationPage();
    Faker faker = new Faker();


    @When("Add {int} product to cart")
    public void addProductToCart(int num) {
        ReusableMethods.waitFor(1);
        productsPage.productClick(num);
    }

    @And("Verify that {string} is displayed")
    public void verifyThatCheckoutIsDisplayed(String text) {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(text));

    }

    @And("Click Proceed To Checkout")
    public void clickProceedToCheckout() {
        checkoutPage.proceedToCheckout.click();

    }

    @And("Click {string} button in the Checkout page")
    public void clickRegisterLoginButtonInTheCheckoutPage(String text) {
        checkoutPage.registerLogin.click();
    }

    @And("Fill all details in Signup and create account in the Checkout page")
    public void fillAllDetailsInSignupAndCreateAccount() {

        registrationPage.name.sendKeys(faker.name().name());
        registrationPage.email.sendKeys(faker.internet().emailAddress());
        registrationPage.verifySignup.click();
        checkoutPage.title.click();
        checkoutPage.password.sendKeys(faker.internet().password());
        checkoutPage.day.click();
        checkoutPage.month.click();
        checkoutPage.year.click();
        checkoutPage.checkboxNewsLetter.click();
        checkoutPage.checkBoxOffers.click();
        registrationPage.firstname.sendKeys(faker.name().firstName());
        registrationPage.lastname.sendKeys(faker.name().lastName());
        registrationPage.company.sendKeys(faker.company().industry());
        registrationPage.address1.sendKeys(faker.address().fullAddress());
        Select drpCountry = new Select(Driver.getDriver().findElement(By.name("country")));
        drpCountry.selectByVisibleText("United States");
        drpCountry.selectByVisibleText("United States");
        registrationPage.state.sendKeys(faker.address().state());
        registrationPage.city.sendKeys(faker.address().city());
        registrationPage.zipcode.sendKeys(faker.address().zipCode());
        registrationPage.mobileNumber.sendKeys(faker.phoneNumber().cellPhone());
        registrationPage.createAccount.click();
    }

    @When("Verify {string} and click {string} button in the Checkout Page")
    public void verifyACCOUNTCREATEDAndClickContinueButton(String arg0, String arg1) {
        Assert.assertTrue(registrationPage.verifyAcountCreated.isDisplayed());
        registrationPage.continueButton.click();
    }

    @And("Verify Logged in as username at top")
    public void verifyLoggedInAsUsernameAtTop() {
        registrationPage.verifyLoggedIn.isDisplayed();
    }

    @Then("Verify {string} and {string}")
    public void verifyAddressDetailsAndReviewYourOrder(String arg0, String arg1) {
        checkoutPage.adressDetails.isDisplayed();
        checkoutPage.reviewYourOrder.isDisplayed();
    }

    @When("Enter description in comment text area and click {string}")
    public void enterDescriptionInCommentTextAreaAndClickPlaceOrder(String arg01) {
        checkoutPage.message.sendKeys(Keys.TAB, "This text will appear in textarea");
        ReusableMethods.waitFor(2);
        checkoutPage.placeOrder.click();
        ReusableMethods.waitFor(2);
    }

    @And("Enter payment details: {string}, {string}, {string}, {string}")
    public void enterPaymentDetailsNameOnCardCardNumberCVCExpirationDate(String txt1, String txt2, String txt3, String txt4) {
        checkoutPage.nameOnCard.sendKeys(faker.name().name());
        checkoutPage.cardNumber.sendKeys(ConfigReader.getProperty("cardNumber"));
        checkoutPage.cvc.sendKeys(faker.number().digits(3));
        checkoutPage.expiryMonth.sendKeys(ConfigReader.getProperty("expiryMonth"));
        checkoutPage.expiryYear.sendKeys(ConfigReader.getProperty("expiryYear"));

    }

    @And("Click {string} button in the payment page")
    public void clickPayAndConfirmOrderButtonInThePaymentPage(String arg01) {
        checkoutPage.payAndConfirm.click();
    }
    @And("Verify success message {string}")
    public void verifySuccessMessageYourOrderHasBeenPlacedSuccessfully(String arg01) {
        Assert.assertTrue(checkoutPage.successMessage.isDisplayed());
    }

    @And("User Click {string} button in the payment page")
    public void userClickDeleteAccountButtonInThePaymentPage(String arg01) {
        checkoutPage.deleteAccount.click();
    }

    @Then("User Verify {string} and click {string} button")
    public void userVerifyACCOUNTDELETEDAndClickContinueButton(String arg01, String arg02) {
    }

}
