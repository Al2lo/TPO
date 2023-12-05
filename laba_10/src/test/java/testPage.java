import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class testPage {
    public WebDriver driver;
    public testPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }
    @FindBy(xpath = "/html/body/header/div[3]/div/div[1]/div[2]/div[6]/a")
    private WebElement goMessage;

    @FindBy(xpath = "/html/body/main/div[3]/div[1]/div/div[1]/div[2]/div[2]/div[2]")
    private WebElement addTovar;

    @FindBy(xpath = "/html/body/main/div[10]/div/div[2]/form/div[6]/div")
    private WebElement add;
    @FindBy(xpath = "/html/body/header/div[3]/div/div[3]")
    private WebElement basket;

    public void goToBasket() {basket.click();}
    public void clickAddTovar() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/main/div[3]/div[1]/div/div[1]/div[2]/div[2]/div[2]")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
    }
    public void clickAdd() {
        add.click();
    }
    public void setGoMessage() {
        goMessage.click();
    }


}
