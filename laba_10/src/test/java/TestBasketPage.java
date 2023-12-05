import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestBasketPage {
    public WebDriver driver;
    TestBasketPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div[3]/div/span[1]")
    private WebElement minus;
    @FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div[3]/div/span[2]")
    private WebElement count;


    public void minusTovar() {
        System.out.println("minus");
        minus.click();
    }
    public String getCount() {
        System.out.println(count.getText());
        return count.getText();
    }

}
