package tests;

import driver.Driver;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import page.*;

public class TestCreateMessage {

    public static MainPage menuPage;
    public static PageWindow windowPage;
    public  static MessagePage messagePage;
    public  static CreaetMessagePage creaetMessagePage;

    public  static SuccessWindow succsessWindow;

    public static WebDriver driver;
    @BeforeClass
    public static void setup() {
        driver = Driver.getDriver();
        menuPage = new MainPage(driver);
        windowPage = new PageWindow(driver);
        messagePage = new MessagePage(driver);
        creaetMessagePage = new CreaetMessagePage(driver);
        succsessWindow = new SuccessWindow(driver);
    }
    @Test
    public void createMessagePage() {
        windowPage.clickLoginBtn();
        menuPage.setGoMessage();
        messagePage.setGoMessage();
        creaetMessagePage.setGoMessage();
        String str = succsessWindow.getCount();
        boolean b = str.equals("Ошибка");
        succsessWindow.clickLoginBtn();
        Assert.assertEquals(b, true);
    }
    @AfterClass
    public static void tearDown() {
        windowPage.driver.quit();
        menuPage.driver.quit();
    }
}
