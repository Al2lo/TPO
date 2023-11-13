import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.datatype.Duration;
import java.util.concurrent.TimeUnit;

public class test {
    public static testPage loginPage;
    public static WebDriver driver;
    @BeforeClass
    public static void setup() {
        //����������� ���� �� �������� � ��� ���������
        System.setProperty("webdriver", ConfigTest.getProperty("microsoftedge"));
        //�������� ���������� ��������
        WebDriver driver = new ChromeDriver();
        //���� ��������������� �� ������ �����
        driver.manage().window().maximize();
        //�������� �� ���������� ����� = 10 ���.
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //��������� ������ �� �������� ����� �� ����� ��������
        driver.get(ConfigTest.getProperty("loginpage"));
        loginPage = new testPage(driver);
    }
    @Test
    public void loginTest() {
        loginPage.clickLoginBtn();
        loginPage.clickAddTovar();
        loginPage.clickAdd();
        loginPage.goToBasket();
        loginPage.minusTovar();
        String count = loginPage.getCount();
        Assert.assertEquals(Integer.parseInt(count),1);
 }

}
