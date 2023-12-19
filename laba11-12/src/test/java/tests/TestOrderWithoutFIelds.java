package tests;

import driver.Driver;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import page.BasketPage;
import page.CreateOrderPage;
import page.MainPage;
import page.PageWindow;

public class TestOrderWithoutFIelds {
    public static MainPage menuPage;
    public  static BasketPage basketPage;
    public static WebDriver driver;
    public  static CreateOrderPage orderPage;
    public static PageWindow windowPage;
    @BeforeClass
    public static void setup() {
        driver = Driver.getDriver();
        menuPage = new MainPage(driver);
        orderPage = new CreateOrderPage(driver);
        basketPage = new BasketPage(driver);
        windowPage = new PageWindow(driver);
    }
    @Test
    public void ORderNullProduct() {
        windowPage.clickLoginBtn();
        menuPage.clickAddTovar();
        menuPage.clickAdd();
        menuPage.goToBasket();
        basketPage.order();
        Assert.assertEquals(orderPage.canOrder(), true);
    }
    @AfterClass
    public static void tearDown() {
        menuPage.driver.quit();
        basketPage.driver.quit();
    }
}
