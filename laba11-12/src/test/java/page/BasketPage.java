package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasketPage extends BasePage{
    public BasketPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div[3]/div/span[3]")
    private WebElement plus;
    @FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div[3]/div/span[1]")
    private WebElement minus;
    @FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div[3]/div/span[2]")
    private WebElement count;
    @FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div[2]/div/span[2]")
    private WebElement ingridients;
    @FindBy(xpath = "/html/body/div[3]/div/div[1]/h2")
    private WebElement resultOrder;
    public void minusTovar() {
        System.out.println("minus");
        minus.click();
    }
    public void plusTovar() {
        System.out.println("plus tovar");
        plus.click();
    }
    public String getIngridients()
    {
        System.out.println(ingridients.getText());
        return ingridients.getText();
    }
    public String getCount() {
        System.out.println(count.getText());
        return count.getText();
    }

    public Boolean goOrder() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div[4]/a")));
        return element.isEnabled();
    }
    public void createOrder() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div[4]/a")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
    }
    public String getResultOrder() {
        System.out.println(resultOrder.getText());
        return resultOrder.getText();
    }
    public void order(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div[4]/a")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
    }

}
