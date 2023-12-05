import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestPageWindow {
    public WebDriver driver;
    TestPageWindow(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(xpath = "/html/body/header/div[2]/form/div/div[2]/input")
    private WebElement go;

    public void clickLoginBtn() {
        go.click();
    }

}
