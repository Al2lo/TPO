package page;

import Accaunt.AccauntAthorityConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProfilePage extends  BasePage{

    public ProfilePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "/html/body/main/div[3]/div/div[2]/form/div[1]/div[1]/div/input")
    private WebElement cityInput;
    @FindBy(xpath = "/html/body/main/div[3]/div/div[2]/form/div[1]/div[2]/div[1]/input")
    private WebElement streetInput;
    @FindBy(xpath = "/html/body/main/div[3]/div/div[2]/form/div[1]/div[2]/div[2]/div[1]/input")
    private WebElement houseNumberInput;
    @FindBy(xpath = "/html/body/main/div[3]/div/div[2]/form/input")
    private WebElement addAddress;
    @FindBy(xpath = "/html/body/main/div[6]/section[1]/div[2]/form/div[3]/div[1]/input")
    private WebElement addPhoneNumber;
    @FindBy(xpath = "/html/body/main/div[6]/section[2]/div/div[2]/div")
    private WebElement out;
    @FindBy(xpath = "/html/body/main/div[4]/div/div[2]/p")
    private WebElement resultAddPhone;

    public void clickAddAddress() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/main/div[6]/section[1]/div[3]/div[2]/span")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
    }
    public void addCity(){cityInput.sendKeys("Minsk");}
    public void setAddPhoneNumber(){addPhoneNumber.sendKeys("000000000");}
    public void addStreet(){streetInput.sendKeys( "fasdfa");}
    public void addHouse(){houseNumberInput.sendKeys( "12");}
    public Boolean addAddress(){
        return addAddress.isEnabled();
    }
    public String getResultAddPhone(){
        System.out.println(resultAddPhone.getText());
        return resultAddPhone.getText();
    }

}
