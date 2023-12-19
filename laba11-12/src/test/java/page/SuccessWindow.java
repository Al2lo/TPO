package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuccessWindow extends BasePage {
    public SuccessWindow(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);}
    @FindBy(xpath = "/html/body/div[3]/div/div[2]/p")
    private WebElement infoText;

    @FindBy(xpath = "/html/body/div[3]/div/div[1]/div")
    private WebElement go;
    public String getCount() {
        return infoText.getText();
    }
    public void clickLoginBtn() {
        go.click();
    }
}
