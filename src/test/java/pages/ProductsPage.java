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


    @FindBy(xpath = "//*[contains(text(), ' Products')]")
    public WebElement productsButton;

    @FindBy(xpath = "//*[text()='View Cart']")
    public WebElement viewCart;

    @FindBy(xpath = "//*[text()='Shopping Cart']")
    public WebElement verifyCartPage;

    @FindBy(xpath = "//a[@class='cart_quantity_delete']")
    public WebElement xButton;

    @FindBy(xpath = "//*[text()='Cart is empty!']")
    public WebElement verifyEmptyCart;

//    @FindBy(xpath = "//a[@href='/products']")
//    public WebElement productsButton;

    @FindBy(xpath = "//div[@class='brands_products']")
    public WebElement brands;

    @FindBy(xpath = "//a[@href='/brand_products/Polo']")
    public WebElement poloBrand;

    @FindBy(xpath = "//a[@href='/brand_products/Madame']")
    public WebElement madameBrand;

    @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement brandProductsTitle;



}



