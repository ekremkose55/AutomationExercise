package stepdefinitions.ui_stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.PurchasePage;
import pages.RegistrationPage;
import utilities.Driver;

import java.nio.file.Files;
import java.nio.file.Paths;

public class TC24_ArifStepDef {

    PurchasePage purchasePage = new PurchasePage();
    RegistrationPage registrationPage = new RegistrationPage();
    Faker faker=new Faker();

    @Then("user adds products to cart")
    public void user_adds_products_to_cart() {
        Driver.waitAndClick(purchasePage.firstProductAddToCart);
        Driver.waitAndClick(purchasePage.continueShopping);
        Driver.waitAndClick(purchasePage.secondProductAddToCart);
        Driver.waitAndClick(purchasePage.continueShopping);

    }
    @Then("verify that cart page is displayed")
    public void verify_that_cart_page_is_displayed() {
        Assert.assertTrue(purchasePage.proceedToCheckout.isDisplayed());

    }
    @Then("user clicks Proceed To Checkout")
    public void user_clicks_proceed_to_checkout() {
        Driver.waitAndClick(purchasePage.proceedToCheckout);

    }
    @Then("user clicks {string} button")
    public void user_clicks_button(String string) {
        Driver.waitAndClick(purchasePage.registerLoginButton);

    }

    @Then("verify Address Details and Review Your Order")
    public void verify_address_details_and_review_your_order() {
        Assert.assertTrue(purchasePage.addressDetailText.isDisplayed());

    }
    @Then("user enters description in comment text area and click {string}")
    public void user_enters_description_in_comment_text_area_and_click(String string) {
        String comment= "I need it today";
        Driver.waitAndSendText(purchasePage.commentTextArea,comment);
        Driver.waitAndClick(purchasePage.placeOrderButton);
    }
    @Then("user enters payment details: Name on Card, Card Number, CVC, Expiration date")
    public void user_enters_payment_details_name_on_card_card_number_cvc_expiration_date() {

        Driver.waitAndSendText(purchasePage.nameOnCard,"Arif Gun");
        Driver.waitAndSendText(purchasePage.cardNumber,"1111 2222 3333 4444");
        Driver.waitAndSendText(purchasePage.cvc,"137");
        Driver.waitAndSendText(purchasePage.expireMonth,"03");
        Driver.waitAndSendText(purchasePage.expireYear,"2030");

    }
    @And("user clicks Pay and Confirm Order button")
    public void userClicksPayAndConfirmOrderButton() {
        Driver.waitAndClick(purchasePage.payAndConfirmButton);
    }
    @Then("verify success message {string}")
    public void verify_success_message(String string) {
        Assert.assertTrue(purchasePage.successMessage.isDisplayed());

    }
    @Then("user clicks {string} button and verify invoice is downloaded successfully.")
    public void user_clicks_button_and_verify_invoice_is_downloaded_successfully(String string) {
        Driver.waitAndClick(purchasePage.downloadInvoice);
        Driver.sleep(1);
        String filePath= System.getProperty("userhome")+"/Downloads/invoice.txt";
        Assert.assertTrue(Files.exists(Paths.get(filePath)));

    }

    @And("user enters name and email as {string} , {string}")
    public void userEntersNameAndEmailAs(String name, String email) {
        Driver.waitAndSendText(registrationPage.name,name);
        Driver.waitAndSendText(registrationPage.email,faker.internet().emailAddress());

    }

    @And("user enter Title, Name, Email, Password, Date of Birth as {string} , {string} , {string} , {string} , {string} , {string} , {string}")
    public void userEnterTitleNameEmailPasswordDateOfBirthAs(String title, String name, String email, String password, String day, String month, String year)  {

        Driver.waitAndClick(registrationPage.title);
        registrationPage.name2.clear();
        Driver.waitAndSendText(registrationPage.name2,name);
        Driver.waitAndSendText(registrationPage.password,password);
        Driver.selectByIndex(registrationPage.days,24);
        Driver.selectByVisibleText(registrationPage.months,"July");
        Driver.selectAnItemFromDropdown(registrationPage.years,year);

    }

    @And("user fills details firstname,lastname,company,address{int},address{int},country,state,city,zipcode,mobile number as {string}, {string} , {string} , {string} , {string} , {string} , {string} , {string} , {string} , {string}")
    public void userFillsDetailsFirstnameLastnameCompanyAddressAddressCountryStateCityZipcodeMobileNumberAs(int arg1 , int arg2, String firstname, String lastname, String company, String address1, String address2, String country, String state, String city, String zipcode, String mobileNumber) {
        Driver.waitAndSendText(registrationPage.firstname,firstname);
        Driver.waitAndSendText(registrationPage.lastname,lastname);
        Driver.waitAndSendText(registrationPage.company,company);
        Driver.waitAndSendText(registrationPage.address1,address1);
        Driver.waitAndSendText(registrationPage.address2,address2);
        Driver.selectByVisibleText(registrationPage.country,country);
        Driver.waitAndSendText(registrationPage.state,state);
        Driver.waitAndSendText(registrationPage.city,city);
        Driver.waitAndSendText(registrationPage.zipcode,zipcode);
        Driver.waitAndSendText(registrationPage.mobileNumber,mobileNumber);
    }


}
