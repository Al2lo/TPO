package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreaetMessagePage extends BasePage {
    public CreaetMessagePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "/html/body/main/div/div/form/input")
    private WebElement createMessage;

    public void setGoMessage() {
        createMessage.click();
    }

}
