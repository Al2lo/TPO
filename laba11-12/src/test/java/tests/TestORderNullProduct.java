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

public class TestORderNullProduct {
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
    public void ORderNullProduct() {
        windowPage.clickLoginBtn();
        menuPage.clickAddTovar();
        menuPage.deleteIngridients();
        menuPage.clickAdd();
        menuPage.goToBasket();
        String ingridients = basketPage.getIngridients();
        Assert.assertNotEquals(ingridients, "");
        Assert.assertNotEquals(ingridients, " ");
    }
    @AfterClass
    public static void tearDown() {
        menuPage.driver.quit();
        basketPage.driver.quit();
    }
}
