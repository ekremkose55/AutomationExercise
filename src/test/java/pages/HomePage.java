package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {


    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@href='/product_details/1']")
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

    @FindBy(xpath = "//h2[text()='Subscription']")
    public WebElement subscriptionText;

    @FindBy(xpath = "//input[@id='susbscribe_email']")
    public WebElement subscriptionEmailInput;

    @FindBy(xpath = "//button[@id='subscribe']")
    public WebElement subscriptionArrowButton;

    @FindBy(xpath = "//div[@class='alert-success alert']")
    public WebElement subscriptionSuccessText;

    @FindBy(xpath = "//p[@class='pull-left']")
    public WebElement footerElement;

    @FindBy(xpath = "//div[@id='attach-popover-lgtbox']")
    public WebElement noButtonProtectionAlert;

    @FindBy(xpath = "//span[text()='Create a List']")
    public WebElement selectCreateList;

    public static void homePageClick(String text) {
        String homePageLocator= "//*[text()='"+text+"']";
        WebElement homePageElement=Driver.getDriver().findElement(By.xpath(homePageLocator));
        homePageElement.click();

    }
    @FindBy(xpath = "//a[text()=' Cart']")
    public WebElement cartButton;


}

























