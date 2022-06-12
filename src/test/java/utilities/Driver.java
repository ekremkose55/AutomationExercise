package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;


import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class Driver {

    //Driver class, driver instance'i baslatmak icin kullanilir.(Sinngleton Driver)
    //Ihtiyacimiz oldugunda driver'i kurmak ve baslatmak icin kullaniriz.
    //Driver null oldugunda create edip baslatacagiz.(if driver==null)
    //Driver classi farkli browserlar(tarayici) ile de kullanacagimiz sekilde olusturacagiz.

    private Driver(){  // parametresiz bir driver constructor olusturduk ki baska bir sebeple kullanilmasin!!!
        // Baska obje olusturulmasini istemedigimiz icin create ediyoruz.
    }

    //driver instance olusturalim
    static WebDriver driver;  // static olmali ki butun class'lar icin kullanabilelim
    //driver'i baslatmak icin statik bir method olusturalim
    public static WebDriver getDriver(){
        if(driver==null){  //  driver null olmasi kosuluyla calisacak.
            String browser = ConfigurationReader.getProperty("browser");
            if ("chrome".equals(browser)) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            } else if ("firefox".equals(browser)) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            } else if ("ie".equals(browser)) {
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
            } else if ("safari".equals(browser)) {
                WebDriverManager.getInstance(SafariDriver.class).setup();
                driver = new SafariDriver();
            } else if ("headless-chrome".equals(browser)) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
            }

        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
    public static void closedDriver(){
        if(driver!=null){  //Eger driver chrome'u isaret ediyorsa
            driver.quit();   // driver'i kapat!
            driver=null;  // driver'in null oldugundan emin olmak icin tekrar null olarak assign ettik ki
            // tekrar null olarak baslayabilelim.
        }                 // Multi browser (chrome,firefox,ie vb) test yaparken bu onemli olacaktir
    }


}
