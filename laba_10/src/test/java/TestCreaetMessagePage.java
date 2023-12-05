import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestCreaetMessagePage {
    public WebDriver driver;
    public TestCreaetMessagePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }
    @FindBy(xpath = "/html/body/main/div/div/form/input")
    private WebElement createMessage;

    public void setGoMessage() {
        createMessage.click();
    }

}
