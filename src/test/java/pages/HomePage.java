package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@href='/product_details/4']")
    public WebElement viewProduct;

    @FindBy(xpath = "(//*[text()='Add to cart'])[1]")
    public WebElement blueTop;

    @FindBy(xpath = "(//*[text()='Add to cart'])[2]")
    public WebElement MenTshirt;

    @FindBy(xpath = "(//*[text()='Add to cart'])[3]")
    public WebElement SleevelessDress;

    @FindBy(xpath = "//*[text()='Continue Shopping']")
    public WebElement continueShopping;

    @FindBy(xpath = "//*[text()=' Cart']")
    public WebElement cart;

}
