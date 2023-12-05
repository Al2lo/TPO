import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MyTest {
    public static testPage menuPage;
    public static TestPageWindow windowPage;
    public  static TestBasketPage basketPage;
    public  static TestMessagePage messagePage;
    public  static TestCreaetMessagePage creaetMessagePage;

    public  static TestSuccessWindow succsessWindow;

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
        menuPage = new testPage(driver);
        windowPage = new TestPageWindow(driver);
        basketPage = new TestBasketPage(driver);
        messagePage = new TestMessagePage(driver);
        creaetMessagePage= new TestCreaetMessagePage(driver);
        succsessWindow = new TestSuccessWindow(driver);
    }
    @Test
    public void OrderMinusTest() {
        windowPage.clickLoginBtn();
        menuPage.clickAddTovar();
        menuPage.clickAdd();
        menuPage.goToBasket();
        basketPage.minusTovar();
        String count = basketPage.getCount();
        Assert.assertEquals(Integer.parseInt(count),1);
 }
    @Test
    public void createMessagePage() {
        windowPage.clickLoginBtn();
        menuPage.setGoMessage();
        messagePage.setGoMessage();
        creaetMessagePage.setGoMessage();
        String str = succsessWindow.getCount();
        boolean b = str.equals("������");
        Assert.assertEquals(b, true);
    }
    @AfterClass
    public static void tearDown() {
        windowPage.driver.quit();
        menuPage.driver.quit();
        basketPage.driver.quit();
    }

}
