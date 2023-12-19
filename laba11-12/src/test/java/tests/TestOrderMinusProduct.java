package tests;

import driver.Driver;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.BasketPage;
import page.MainPage;
import page.PageWindow;

import java.util.concurrent.TimeUnit;

public class TestOrderMinusProduct {
    public static MainPage menuPage;
    public  static BasketPage basketPage;
    public static WebDriver driver;
    public static PageWindow windowPage;
    @BeforeClass
    public static void setup() {
        driver = Driver.getDriver();
        menuPage = new MainPage(driver);
        basketPage = new BasketPage(driver);
        windowPage = new PageWindow(driver);
    }
    @Test
    public void OrderMinusTest() {
        windowPage.clickLoginBtn();
        menuPage.clickAddTovar();
        menuPage.clickAdd();
        menuPage.goToBasket();
        basketPage.minusTovar();
        String count = basketPage.getCount();
        Assert.assertEquals(Integer.parseInt(count), 1);
    }
    @AfterClass
    public static void tearDown() {
        menuPage.driver.quit();
        basketPage.driver.quit();
    }
}
