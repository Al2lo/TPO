import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestMessagePage {
    public WebDriver driver;
    public TestMessagePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }
    @FindBy(xpath = "/html/body/main/div/a")
    private WebElement message;

    public void setGoMessage() {
        message.click();
    }

}
