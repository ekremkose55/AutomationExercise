package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProductsPage {


    public ProductsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    public void productClick(int num) {
        String productLocator = "(//a[@data-product-id='" + num + "'])[1]";
        WebElement productElement = Driver.getDriver().findElement(By.xpath(productLocator));
        productElement.click();

    }


    public String productPrice(int num) {
        String productPriceLocator = "(//div[@class='productinfo text-center'])[" + num + "]//h2";
        WebElement productElement = Driver.getDriver().findElement(By.xpath(productPriceLocator));
        return productElement.getText();

    }


    public boolean cartPrice(int num) {
        String cartPriceLocator = "(//tr[@id='product-" + num + "']//p)[2]";
        WebElement cartPriceElement = Driver.getDriver().findElement(By.xpath(cartPriceLocator));
        return cartPriceElement.isDisplayed();

    }
    @FindBy(xpath = "//a[text()='Proceed To Checkout']")
    public WebElement checkoutButton;

    @FindBy(xpath = "(//p[@class='cart_total_price'])[3]")
    public WebElement totalPrice;

    @FindBy(xpath = "(//button[@class='disabled'])[1]")
    public WebElement firstQuantity;

    @FindBy(xpath = "(//button[@class='disabled'])[2]")
    public WebElement secondQuantity;

    @FindBy(xpath = "//h2//b")
    public WebElement accountCreated;


    @FindBy(xpath = "//h2[text()='Address Details']")
    public WebElement addressDetail;

    @FindBy(xpath = "//h2[text()='Review Your Order']")
    public WebElement reviewOrder;

    @FindBy(xpath = "//textarea[@name='message']")
    public WebElement testArea;

    @FindBy(xpath = "//a[text()='Place Order']")
    public WebElement placeOrder;

    @FindBy(xpath = "//input[@name='name_on_card']")
    public WebElement nameCard;

    @FindBy(xpath = "//input[@name='card_number']")
    public WebElement cardNum;

    @FindBy(xpath = "//input[@name='cvc']")
    public WebElement cvcNum;

    @FindBy(xpath = "//input[@name='expiry_month']")
    public WebElement expDate;

    @FindBy(xpath = "//input[@name='expiry_year']")
    public WebElement expYear;

    @FindBy(xpath = "//button[@id='submit']")
    public WebElement payButton;



}



