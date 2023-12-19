package tests;

import Accaunt.AccauntAthorityConfig;
import driver.Driver;
import model.User;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import page.*;

public class TestIncorrectPhoneNumber {
    public static PageWindow windowPage;
    public static MainPage menuPage;
    public static ProfilePage profilePage;
    public  static UserAuth userAuth;
    private static User user;
    public static WebDriver driver;
    @BeforeClass
    public static void setup() {
        user = AccauntAthorityConfig.getUser();
        driver = Driver.getDriver();
        windowPage = new PageWindow(driver);
        menuPage = new MainPage(driver);
        profilePage = new ProfilePage(driver);
        userAuth = new UserAuth(driver,user);
    }
    @Test
    public void createMessagePage() {
        windowPage.clickLoginBtn();
        menuPage.clickAuthority();
        userAuth.addLogin();
        userAuth.addPassword();
        userAuth.clickLoginButton();
        menuPage.clickGoProfile();
        profilePage.setAddPhoneNumber();
       String result = profilePage.getResultAddPhone();
        Assert.assertEquals(result, "");
    }
    @AfterClass
    public static void tearDown() {
        windowPage.driver.quit();
        menuPage.driver.quit();
    }
}
