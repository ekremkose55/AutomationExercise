package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProductDetailPage {

    public ProductDetailPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='quantity']")
    public WebElement quantity;

    @FindBy(xpath = "//button[@type='button']")
    public WebElement addToCart;

    @FindBy(xpath = "//*[text()='View Cart']")
    public WebElement viewCart;

    @FindBy(xpath = "(//button[@class='disabled'])[1]")
    public WebElement exactQuantity;

    @FindBy(xpath = "(//button[@class='disabled'])[1]")
    public WebElement cartQuantity;



}
