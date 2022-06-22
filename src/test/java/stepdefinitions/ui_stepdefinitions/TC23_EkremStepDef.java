package stepdefinitions.ui_stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutoExePage;
import utilities.Driver;

public class TC23_EkremStepDef {
    AutoExePage autoPage = new AutoExePage();
    Actions actions=new Actions(Driver.getDriver());

    Faker faker = new Faker();
    String registrationAddress;

    @When("Fill all details in Signup and create account")
    public void fill_all_details_in_signup_and_create_account() {

        String name = faker.name().name();
        String email = faker.internet().emailAddress();
        String password = faker.internet().password();
        autoPage.newName.sendKeys(name);
        autoPage.newEmail.sendKeys(email);
        autoPage.signUpButton.click();

        Driver.waitAndClick(autoPage.title);
        autoPage.password.sendKeys(password);

        Driver.selectByIndex(autoPage.days,10);
        Driver.selectByIndex(autoPage.months,6);
        Driver.selectByVisibleText(autoPage.years,"1977");
        Driver.waitAndClick(autoPage.newsletterCheckbox);
        Driver.waitAndClick(autoPage.secondCheckbox);

        String firstName = faker.name().firstName();
        Driver.waitAndSendText(autoPage.firstname,firstName);

        String lastName = faker.name().lastName();
        Driver.waitAndSendText(autoPage.lastname,lastName);

        String companyName = faker.company().industry();
        Driver.waitAndSendText(autoPage.company, companyName);

        String address1 = faker.address().streetAddress();
        Driver.waitAndSendText(autoPage.address1, address1);
        registrationAddress = address1;

        String address2 = faker.address().buildingNumber();
        // Driver.waitAndSendText(autoPage.address2, address2);

        Driver.waitAndSendText(autoPage.country,"United State");

        String state = faker.address().state();
        Driver.waitAndSendText(autoPage.state,state);

        String city = faker.address().city();
        Driver.waitAndSendText(autoPage.city, city);

        String zipCode = faker.address().zipCode();
        Driver.waitAndSendText(autoPage.zipcode,zipCode);

        String phoneNumber = faker.phoneNumber().cellPhone();
        Driver.waitAndSendText(autoPage.mobileNumber,phoneNumber);
        Driver.waitAndClick(autoPage.createAccount);
    }


    @When("Verify {string} and click {string} button")
    public void verify_and_click_button(String string, String string2) {
        Assert.assertTrue(autoPage.verifyAcountCreated.isDisplayed());
        Driver.waitAndClick(autoPage.continueButton); }

    @When("Verify {string} at top")
    public void verify_at_top(String string) {
        Assert.assertTrue(autoPage.verifyLoggedIn.isDisplayed()); }


    @When("Add products to cart")
    public void add_products_to_cart() {
        Actions actions = new Actions(Driver.getDriver());
        actions.click(autoPage.blueTopProduct).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        Driver.wait(3);

        autoPage.continueShoppingButton.click();
        actions.click(autoPage.menTshirtProduct).perform();
        autoPage.continueShoppingButton.click();
        actions.click(autoPage.sleevelessDressProduct).perform();
        autoPage.viewCart.click(); }

    @When("Verify that cart page is displayed")
    public void verify_that_cart_page_is_displayed() {
        System.out.println("cart sayfasi: " + autoPage.cartPageText.getText());
        Assert.assertTrue(autoPage.cartPageText.isDisplayed()); }



    @When("Click Proceed To Checkout")
    public void click_proceed_to_checkout() { autoPage.proceedToCheckout.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();}

    @When("Verify that the delivery address is same address filled at the time registration of account")
    public void verify_that_the_delivery_address_is_same_address_filled_at_the_time_registration_of_account() {
        String deliveryAdress = autoPage.addressLine1A.getText();
        System.out.println("Adres verify: " + deliveryAdress + " = " + registrationAddress);
        Assert.assertTrue(registrationAddress.contains(deliveryAdress));
    }

    @When("Verify that the billing address is same address filled at the time registration of account")
    public void verify_that_the_billing_address_is_same_address_filled_at_the_time_registration_of_account() {
        String bilingAdress = autoPage.addressLine1B.getText();
        Assert.assertTrue(registrationAddress.contains(bilingAdress));
    }

    @When("Users Click {string} button")
    public void users_click_button(String string) {
        autoPage.deleteAccount.click();
    }

    @Then("User Verify {string} and click {string} button")
    public void user_verify_and_click_button(String string, String string2) {

    }

}
