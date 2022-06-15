package stepdefinitions.uistepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Ekrem_Test_Page;
import utilities.Driver;

public class RegistrationSteps {
    Ekrem_Test_Page ekremTestPage = new Ekrem_Test_Page();

    @Given("user goes to the url {string}")
    public void userGoesToTheUrl(String url) {

        Driver.navigateToUrl(url);
    }



    @Given("user verify home page is visibly")
    public void user_verify_home_page_is_visibly()  {
        Assert.assertTrue(ekremTestPage.verifyHomePage.isDisplayed());

    }

    @When("user click {string} button")
    public void user_click_button(String string) {

        Driver.waitAndClick(ekremTestPage.signupButton);
    }


    @Then("user verify {string} is visible")
    public void user_verify_is_visible(String string) {
        Assert.assertTrue(ekremTestPage.verifyNewUserSignup.isDisplayed());
    }


    @And("user enter name and email as {string} , {string}")
    public void userEnterNameAndEmailAs(String name, String email) {
        Driver.waitAndSendText(ekremTestPage.name,name);
        Driver.waitAndSendText(ekremTestPage.email,email);

    }
//    @Then("user enter name and email")
//    public void user_enter_name_and_email() {
//        registrationPage.name.sendKeys("Alex Prit");
//        registrationPage.email.sendKeys("alexprit345@gmail.com");
//    }

    @Then("user click Signup button")
    public void userClickSignupButton() {
        Driver.waitAndClick(ekremTestPage.verifySignup);

    }



    @Then("verify {string} is visible")
    public void verify_is_visible(String string) {
        Assert.assertTrue(ekremTestPage.verifyAccount.isDisplayed());
    }

    @And("enter Title, Name, Email, Password, Date of Birth as {string} , {string} , {string} , {string} , {string}")
    public void enterTitleNameEmailPasswordDateOfBirthAs(String title, String name, String email, String password, String dateOfBirth) {
        Driver.waitAndSendText(ekremTestPage.title,title);
        Driver.waitAndSendText(ekremTestPage.name2,name);
        Driver.waitAndSendText(ekremTestPage.email,email);
        Driver.waitAndSendText(ekremTestPage.password,password);

    }

//    @Then("enter Title, Name, Email, Password, Date of Birth")
//    public void enter_title_name_email_password_date_of_birth() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }

    @Then("user selects first checkbox")
    public void user_selects_first_checkbox() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user selects second checkbox")
    public void user_selects_second_checkbox() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @And("user fill details firstname,lastname,company,address{int},address{int},country,state,city,zipcode,mobile number as {string}, {string} , {string} , {string} , {string} , {string} , {string} , {string} , {string} , {string}")
    public void userFillDetailsFirstnameLastnameCompanyAddressAddressCountryStateCityZipcodeMobileNumberAs(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9, String arg10, String arg11) {

    }
//    @Then("user fill details as <First name> , <Last name> , <Company> , <Address1> , <Address2> , <Country> , <State> , <City> , <Zipcode> , <Mobile Number>")
//    public void user_fill_details_as_first_name_last_name_company_address1_address2_country_state_city_zipcode_mobile_number() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }

    @Then("user click create account button")
    public void user_click_create_account_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("verify 'Account created!\" is visible")
    public void verify_account_created_is_visible() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("click continue button")
    public void click_continue_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



    @Then("verify {string} is visible and click continue")
    public void verify_is_visible_and_click_continue(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}



