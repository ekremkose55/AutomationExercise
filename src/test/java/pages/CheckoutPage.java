package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CheckoutPage {

    public CheckoutPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Proceed To Checkout']")
    public WebElement proceedToCheckout;

    @FindBy(xpath = "//*[text()='Register / Login']")
    public WebElement registerLogin;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement name;

    @FindBy(xpath = "(//input[@name='email'])[2]")
    public WebElement email;

    @FindBy(xpath = "(//*[text()='Signup'])")
    public WebElement signUp;

    @FindBy(xpath = "//input[@id='id_gender2']")
    public WebElement title;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement signUpName;

    @FindBy(xpath = "(//input[@name='email'])[2]" )
    public WebElement signUpEmail;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//option[@value='10']")
    public WebElement day;

    @FindBy(xpath = "//*[text()='April']")
    public WebElement month;

    @FindBy(xpath = "//option[@value='2000']")
    public WebElement year;

    @FindBy(xpath = "//input[@id='newsletter']")
    public WebElement checkboxNewsLetter;

    @FindBy(xpath = "//input[@id='optin']")
    public WebElement checkBoxOffers;

    @FindBy(xpath = "//option[@value='United States']']")
    public WebElement country;

    @FindBy(xpath = "//*[text()='Address Details']")
    public WebElement adressDetails;

    @FindBy(xpath = "//*[text()='Review Your Order']")
    public WebElement reviewYourOrder;

    @FindBy(xpath = "//textarea[@name='message']" )
    public WebElement message;

    @FindBy(xpath = "//*[text()='Place Order']")
    public WebElement placeOrder;

    @FindBy(xpath = "//input[@name='name_on_card']")
    public WebElement nameOnCard;

    @FindBy(xpath = "//input[@name='card_number']")
    public WebElement cardNumber;

    @FindBy(xpath = "//input[@name='cvc']")
    public WebElement cvc;

    @FindBy(xpath = "//input[@name='expiry_month']")
    public WebElement expiryMonth;

    @FindBy(xpath = "//input[@name='expiry_year']")
    public WebElement expiryYear;

    @FindBy(xpath = "//button[@id='submit']")
    public WebElement payAndConfirm;

    @FindBy(xpath = "//*[text()='Congratulations! Your order has been confirmed!']")
    public WebElement successMessage;

    @FindBy(xpath = "//*[text()=' Delete Account']")
    public WebElement deleteAccount;

    @FindBy(xpath = "//*[text()='Delete']")
    public WebElement delete;









}
