import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestSuccessWindow {
    public WebDriver driver;
    TestSuccessWindow(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }
    @FindBy(xpath = "/html/body/div[3]/div/div[2]/p")
    private WebElement infoText;

    public String getCount() {
        return infoText.getText();
    }


}
