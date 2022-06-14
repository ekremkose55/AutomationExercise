package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }


    @FindBy(xpath = "//*[text()='Login to your account']")
    public WebElement verifyLogin;

    @FindBy(xpath = "(//input[@name='email'])[1]")
    public WebElement emailAddress;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(xpath = "//*[text()='Login']")
    public WebElement loginButton;

    
}
