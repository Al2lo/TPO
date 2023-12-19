package driver;

import Configuration.ConfigTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    private static WebDriver driver;

    public Driver() { }

    public static WebDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver", ConfigTest.getProperty("microsoftedge"));
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get(ConfigTest.getProperty("loginpage"));
        }
        return driver;
    }


    public static void closeDriver() {
        driver.quit();
        driver = null;
    }
}