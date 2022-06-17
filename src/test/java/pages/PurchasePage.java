package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PurchasePage {

    public PurchasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'])[1]")
    public WebElement firstProductAddToCart;

    @FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'])[2]")
    public WebElement secondProductAddToCart;

    @FindBy(xpath = "//button[text()='Continue Shopping']")
    public WebElement continueShopping;

    @FindBy(xpath = "//a[text()='Proceed To Checkout']")
    public WebElement proceedToCheckout;

    @FindBy(xpath = "//*[text()='Register / Login']")
    public WebElement registerLoginButton;

    @FindBy(xpath = "//*[text()='Address Details']")
    public WebElement addressDetailText;

    @FindBy(xpath = "//*[@name='message']")
    public WebElement commentTextArea;

    @FindBy(xpath = "//*[text()='Place Order']")
    public WebElement placeOrderButton;

    @FindBy(xpath = "//*[@name='name_on_card']")
    public WebElement nameOnCard;

    @FindBy(xpath = "//*[@name='card_number']")
    public WebElement cardNumber;

    @FindBy(xpath = "//*[@name='cvc']")
    public WebElement cvc;

    @FindBy(xpath = "//*[@name='expiry_month']")
    public WebElement expireMonth;

    @FindBy(xpath = "//*[@name='expiry_year']")
    public WebElement expireYear;

    @FindBy(xpath = " //*[text()='Pay and Confirm Order']")
    public WebElement payAndConfirmButton;

    @FindBy(xpath = "//*[text()='Congratulations! Your order has been confirmed!']")
    public WebElement successMessage;

    @FindBy(xpath = "//*[text()='Download Invoice']")
    public WebElement downloadInvoice;








}
