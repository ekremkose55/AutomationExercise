package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegistrationPage {

    public RegistrationPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

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




}
