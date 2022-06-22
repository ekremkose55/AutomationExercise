package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutoExePage {

    public AutoExePage(){
        PageFactory.initElements(Driver.getDriver(),this); }

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

    @FindBy(xpath = "//*[contains(text(),'Contact us')]")
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

    @FindBy(name = "upload_file")
    public WebElement uploadButton;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//*[contains(text(),'Category')]")
    public WebElement categoryText;

    @FindBy(xpath = "//a[@href='#Women']")
    public WebElement womenButton;

    @FindBy(xpath = "(//a[contains(text(), 'Dress')])[1]")
    public WebElement dressButton;

    @FindBy(xpath = "//*[contains(text(),'Women - Dress Products')]")
    public WebElement womenDressBarText;

    @FindBy(xpath = "//a[@href='#Men']")
    public WebElement menButton;

    @FindBy(xpath = "//*[contains(text(), 'Tshirts')]")
    public WebElement tshirtsButton;


    @FindBy(xpath = "//*[contains(text(), 'Men - Tshirts Products')]")
    public WebElement menCategoryText;

    @FindBy(name = "name")
    public WebElement newName;

    @FindBy(xpath = "(//input[@name='email'])[2]")
    public WebElement newEmail;

    @FindBy(id = "id_gender2")
    public WebElement title;

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


    @FindBy(xpath = "(//a[@data-product-id='1'])[1]")
    public WebElement blueTopProduct;

    @FindBy(xpath = "//button[@data-dismiss='modal']")
    public WebElement continueShoppingButton;


    @FindBy(xpath = "(//a[@data-product-id='2'])[1]")
    public WebElement menTshirtProduct;

    @FindBy(xpath = "(//a[@data-product-id='3'])[1]")
    public WebElement sleevelessDressProduct;

    @FindBy(xpath = "//*[text()='View Cart']")
    public WebElement viewCart;

    @FindBy(xpath = "//*[.='Shopping Cart']")
    public WebElement cartPageText;

    @FindBy(xpath = "//a[contains(text(),'Proceed To Checkout')]")
    public WebElement proceedToCheckout;


    @FindBy(xpath = "(//*[@class='address_address1 address_address2'])[2]")
    public WebElement addressLine1A;

    @FindBy(xpath = "(//*[@class='address_address1 address_address2'])[5]")
    public WebElement addressLine1B;

    @FindBy(xpath = "(//*[@class='address_city address_state_name address_postcode'])[1]")
    public WebElement addressLine2A;

    @FindBy(xpath = "(//*[@class='address_city address_state_name address_postcode'])[1]")
    public WebElement addressLine2B;

    @FindBy(xpath = "//*[text()= ' Delete Account']")
    public WebElement deleteAccount;





}
