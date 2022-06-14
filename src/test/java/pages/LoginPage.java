package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
}


    public void productClick(int num) {
        String productLocator= "(//a[@data-product-id='"+num+"'])[1]";
        WebElement productElement=Driver.getDriver().findElement(By.xpath(productLocator));
        productElement.click();

    }
    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameInput;

    @FindBy(xpath = "(//input[@name='email'])[1]")
    public WebElement emailInput;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[text()='Signup']")
    public WebElement signUpButton;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginButton;


}

