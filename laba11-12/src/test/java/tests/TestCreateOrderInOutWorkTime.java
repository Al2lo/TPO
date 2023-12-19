package tests;

import driver.Driver;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import page.BasketPage;
import page.MainPage;
import page.PageWindow;

public class TestCreateOrderInOutWorkTime {
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
        basketPage.createOrder();
        Assert.assertNotEquals(basketPage.getResultOrder(), "");
    }
    @AfterClass
    public static void tearDown() {
        menuPage.driver.quit();
        basketPage.driver.quit();
    }
}
