package stepdefinitions.ui_stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.RegistrationPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC01_TugbaStepDef {
    RegistrationPage registrationPage = new RegistrationPage();
    Faker faker = new Faker();

    @Given("user goes to the url {string}")
    public void userGoesToTheUrl(String url) {

        Driver.navigateToUrl(url);
    }



    @Given("user verify home page is visibly")
    public void user_verify_home_page_is_visibly()  {
        Assert.assertTrue(registrationPage.verifyHomePage.isDisplayed());

    }

    @When("user click {string} button")
    public void user_click_button(String string) {

        Driver.waitAndClick(registrationPage.signupButton);
    }


    @Then("user verify {string} is visible")
    public void user_verify_is_visible(String string) {
        Assert.assertTrue(registrationPage.verifyNewUserSignup.isDisplayed());
    }



    @And("user enter name and email as {string} , {string}")
    public void userEnterNameAndEmailAs(String name, String email) {
        name = faker.name().name();
        Driver.waitAndSendText(registrationPage.name,name);
        email = faker.internet().emailAddress();
        Driver.waitAndSendText(registrationPage.email,email);

    }

    @Then("user click Signup button")
    public void userClickSignupButton() {
        Driver.waitAndClick(registrationPage.verifySignup);

    }

    @Then("verify {string} is visible")
    public void verify_is_visible(String string) {

        Assert.assertTrue(registrationPage.verifyAccount.isDisplayed());
    }

    @And("enter Title, Name, Email, Password, Date of Birth as {string} , {string} , {string} , {string} , {string} , {string} , {string}")
    public void enterTitleNameEmailPasswordDateOfBirthAs(String title, String name, String email, String password, String day, String month, String year)  {

        Driver.waitAndClick(registrationPage.title);
        registrationPage.name2.clear();
        name = faker.name().name();
        Driver.waitAndSendText(registrationPage.name2,name);
        password = faker.internet().password();
        Driver.waitAndSendText(registrationPage.password,password);
        Driver.selectByIndex(registrationPage.days,24);
        Driver.selectByVisibleText(registrationPage.months,"July");
        Driver.selectAnItemFromDropdown(registrationPage.years,year);

    }



    @Then("user selects first checkbox")
    public void user_selects_first_checkbox() {

        Driver.waitAndClick(registrationPage.newsletterCheckbox);
    }

    @Then("user selects second checkbox")
    public void user_selects_second_checkbox() {

        Driver.waitAndClick(registrationPage.secondCheckbox);
    }

    @And("user fill details firstname,lastname,company,address{int},address{int},country,state,city,zipcode,mobile number as {string}, {string} , {string} , {string} , {string} , {string} , {string} , {string} , {string} , {string}")
    public void userFillDetailsFirstnameLastnameCompanyAddressAddressCountryStateCityZipcodeMobileNumberAs(int arg1 , int arg2, String firstname, String lastname, String company, String address1, String address2, String country, String state, String city, String zipcode, String mobileNumber) {
       firstname = faker.name().firstName();
        Driver.waitAndSendText(registrationPage.firstname,firstname);
        lastname = faker.name().lastName();
        Driver.waitAndSendText(registrationPage.lastname,lastname);
        company = faker.company().industry();
        Driver.waitAndSendText(registrationPage.company,company);
        address1 = faker.address().fullAddress();
        Driver.waitAndSendText(registrationPage.address1,address1);
        address2 = faker.address().fullAddress();
        Driver.waitAndSendText(registrationPage.address2,address2);
        Driver.selectByVisibleText(registrationPage.country,"Canada");
        Driver.waitAndSendText(registrationPage.state,state);
        Driver.waitAndSendText(registrationPage.city,city);
        Driver.waitAndSendText(registrationPage.zipcode,zipcode);
        Driver.waitAndSendText(registrationPage.mobileNumber,mobileNumber);



    }


    @Then("user click create account button")
    public void user_click_create_account_button() {
        Driver.waitAndClick(registrationPage.createAccount);

    }

    @Then("verify 'Account created!\" is visible")
    public void verify_account_created_is_visible() {
        Assert.assertTrue(registrationPage.verifyAcountCreated.isDisplayed());

    }

    @Then("click continue button")
    public void click_continue_button() {
        Driver.waitAndClick(registrationPage.continueButton);

    }



    @Then("verify Logged in as username is visible")
    public void verifyLoggedInAsUsernameIsVisible() {

        Assert.assertTrue(registrationPage.verifyLoggedIn.isDisplayed());

    }


    @When("user click Delete Account button")
    public void userClickDeleteAccountButton() {
        Driver.waitAndClick(registrationPage.deleteAccount);

    }

    @Then("verify Account Deleted! is visible and click continue")
    public void verifyAccountDeletedIsVisibleAndClickContinue() {
        Assert.assertFalse("ACCOUNT DELETED!", false);
        Driver.closeDriver();

    }



}



