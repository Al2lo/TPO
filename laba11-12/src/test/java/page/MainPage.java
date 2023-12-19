package page;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class MainPage extends BasePage{
    public MainPage(WebDriver driver) {
        super(driver);
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
    @FindBy(xpath = "/html/body/header/div[2]/div[1]/div[4]/span")
    private WebElement goAuthority;
    @FindBy(xpath = "/html/body/header/div[2]/div[1]/a/span")
    private WebElement goProfile;
    @FindBy(xpath = "/html/body/main/div[3]/div[1]/div")
    private WebElement container;
    @FindBy(xpath = "html/body/main/div[3]/div[1]/div/div[19]")
    private WebElement first;
    @FindBy(xpath = "/html/body/main/div[3]/div[1]/div/div[21]")
    private WebElement second;

    public void goToBasket() {basket.click();}
    public void clickAddTovar() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/main/div[3]/div[1]/div/div[1]/div[2]/div[2]/div[2]")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
    }
    public void deleteIngridients(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/main/div[10]/div/div[2]/form/div[5]/div[1]/span")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
         element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/main/div[10]/div/div[2]/form/div[5]/div[2]/span")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
         element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/main/div[10]/div/div[2]/form/div[5]/div[3]/span")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
         element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/main/div[10]/div/div[2]/form/div[5]/div[4]/span")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
        element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/main/div[10]/div/div[2]/form/div[5]/div[5]/span")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
        element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/main/div[10]/div/div[2]/form/div[5]/div[6]/span")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
    }
    public void addFilterChicken(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/main/div[3]/div[1]/form/div/div[1]/label")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
    }
        public void addFilterSpicy() {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/main/div[3]/div[1]/form/div/div[3]/label")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        }
    public void clickAdd() {
        add.click();
    }
    public void clickAuthority() {
        goAuthority.click();
    }
    public void setGoMessage() {
        goMessage.click();
    }
    public void clickGoProfile() {
        goProfile.click();
    }
    public boolean getCountDoners(){
        return first.isEnabled() && second.isEnabled();
    }



}
