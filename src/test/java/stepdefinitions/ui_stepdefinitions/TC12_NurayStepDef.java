package stepdefinitions.ui_stepdefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductsPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC12_NurayStepDef {

    static String price1;
    static String price2;
    ProductsPage productsPage =new ProductsPage();
    LoginPage loginPage= new LoginPage();




    @Then("Verify their prices, quantity and total price")
    public void verifyTheirPricesQuantityAndTotalPrice() {
        productsPage.checkoutButton.click();
       String totalPrice = productsPage.totalPrice.getText();
        System.out.println(totalPrice);
        int totPrice=Integer.parseInt(totalPrice.substring(4));
        int priceF=Integer.parseInt(price1.substring(4));
        int priceSec=Integer.parseInt(price2.substring(4));
        int actualTotalPrice=priceF+priceSec;
        Assert.assertEquals(actualTotalPrice,totPrice);

        Assert.assertTrue(productsPage.firstQuantity.getText().contains("1"));
        Assert.assertTrue(productsPage.secondQuantity.getText().contains("1"));

        Driver.getDriver().close();




    }


    @Then("User login the app")
    public void userLoginTheApp() {
        loginPage.emailInput1.sendKeys(ConfigReader.getProperty("email"));
        ReusableMethods.waitFor(1);
        loginPage.passwordInput.sendKeys(ConfigReader.getProperty("password"));
        loginPage.loginButton.click();


    }

    @Then("Verify {int} and {int} both products are added to Cart")
    public void verifyAndBothProductsAreAddedToCart(int num1, int num2) {
        Assert.assertTrue(productsPage.cartPrice(num1));
        Assert.assertTrue(productsPage.cartPrice(num2));


    }


    @Then("Hover over {int} first product and click Add to cart")
    public void hoverOverFirstProductAndClickAddToCart(int num1) {
        price1 = productsPage.productPrice(num1);
        productsPage.productClick(num1);

    }

    @Then("Hover over {int} second product and click Add to cart")
    public void hoverOverSecondProductAndClickAddToCart(int num2) {
        price2 = productsPage.productPrice(num2);
        productsPage.productClick(num2);
    }


}
