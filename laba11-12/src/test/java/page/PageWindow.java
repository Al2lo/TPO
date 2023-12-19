package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageWindow extends BasePage {
    public PageWindow(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/header/div[2]/form/div/div[2]/input")
    private WebElement go;
    public void clickLoginBtn() {
        go.click();
    }

}
