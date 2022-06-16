package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {

     public HomePage() {
         PageFactory.initElements(Driver.getDriver(), this);
     }


    public static void homePageClick(String text) {
       String homePageLocator= "//*[text()='"+text+"']";
       WebElement homePageElement=Driver.getDriver().findElement(By.xpath(homePageLocator));
       homePageElement.click();

    }
    @FindBy(xpath = "//a[text()=' Cart']")
    public WebElement cartButton;




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


    @FindBy(xpath = "//a[@id='scrollUp']")
    public WebElement scrollUpArrow;

         @FindBy(xpath = "(//h2)[1]")
         public WebElement upTitle;

    @FindBy(xpath = "//a//b")
    public WebElement upAccountName;


     }














