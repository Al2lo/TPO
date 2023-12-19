package Accaunt;

import Configuration.ConfigTest;
import model.User;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AccauntAthorityConfig {
    private static User user;

    public static User getUser()
    {
        if (user == null) {
            user = new User( ConfigTest.getProperty("login"),ConfigTest.getProperty("password"));
        }
        return user;
    }
}
