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

    @FindBy(xpath = "//select[@id='days']")
    public WebElement day;

    @FindBy(xpath = "//select[@id='months']")
    public WebElement months;








}
