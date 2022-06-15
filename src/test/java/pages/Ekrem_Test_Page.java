package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Ekrem_Test_Page {


    public Ekrem_Test_Page(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//*[contains(text(), 'Home')]")
    public WebElement verifyHomePage;

    @FindBy(xpath = "//*[contains(text(), 'Login')]")
    public WebElement signupButton;

    @FindBy(xpath = "//*[text()='New User Signup!']")
    public WebElement verifyNewUserSignup;

    @FindBy(name = "name")
    public WebElement name;

    @FindBy(xpath = "(//input[@name='email'])[2]")
    public WebElement email;

    @FindBy(xpath = "//*[text()='Signup']")
    public WebElement verifySignup;

    @FindBy(xpath = "//*[text()='Enter Account Information']")
    public WebElement verifyAccount;

    @FindBy(id = "id_gender2")
    public WebElement title;

    @FindBy(id = "name")
    public WebElement name2;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "days")
    public WebElement days;

    @FindBy(name = "months")
    public WebElement months;

    @FindBy(id = "years")
    public WebElement years;

    @FindBy(id = "newsletter")
    public WebElement newsletterCheckbox;

    @FindBy(id = "optin")
    public WebElement secondCheckbox;

    @FindBy(id = "first_name")
    public WebElement firstname;

    @FindBy(id = "last_name")
    public WebElement lastname;

    @FindBy(id = "company")
    public WebElement company;

    @FindBy(id = "address1")
    public WebElement address1;

    @FindBy(id = "address2")
    public WebElement address2;

    @FindBy(id = "country")
    public WebElement country;

    @FindBy(id = "state")
    public WebElement state;

    @FindBy(id = "city")
    public WebElement city;

    @FindBy(id = "zipcode")
    public WebElement zipcode;

    @FindBy(id = "mobile_number")
    public WebElement mobileNumber;

    @FindBy(xpath = "//*[text()='Create Account']")
    public WebElement createAccount;

    @FindBy(xpath = "//*[text()='Account Created!']")
    public WebElement verifyAcountCreated;

    @FindBy(xpath = "//*[text()='Continue']")
    public WebElement continueButton;

    @FindBy(xpath = "//*[text()=' Logged in as ']")
    public WebElement verifyLoggedIn;

    @FindBy(xpath = "//*[text()= ' Delete Account']")
    public WebElement deleteAccount;

    @FindBy(xpath = "(//*[contains(text(), 'Delete')])[4]")
    public WebElement delete;

    @FindBy(xpath = "//*[@class='nav navbar-nav']")
    public WebElement homePage;

    @FindBy(xpath = "//i[@class='fa fa-lock']")
    public WebElement signUp;

    @FindBy(xpath = "//*[.='New User Signup!']")
    public WebElement newUserSigUpText;

    @FindBy(name = "name")
    public WebElement nameBox;

    @FindBy(xpath = "(//input[@name='email'])[2]")
    public WebElement emailBox;

    @FindBy(xpath = "//*[.='Signup']")
    public WebElement signUpButton;

    @FindBy(xpath = "//*[.='Email Address already exist!']")
    public WebElement emailVerifyText;

    @FindBy(xpath = "//i[@class='fa fa-envelope']")
    public WebElement contactUsButton;

    @FindBy(xpath = "//*[.='Get In Touch']")
    public WebElement getInTouchText;

    @FindBy(name = "name")
    public WebElement nameTestBox;

    @FindBy(name = "email")
    public WebElement emailTestBox;

    @FindBy(name = "subject")
    public WebElement subjectTestBox;

    @FindBy(id = "message")
    public WebElement messageTestBox;

    @FindBy(name = " upload_file")
    public WebElement uploadFile;




}
