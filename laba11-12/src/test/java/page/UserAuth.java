package page;

import Accaunt.AccauntAthorityConfig;
import model.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserAuth extends BasePage {

    private User user;
    public UserAuth(WebDriver driver, User user) {
        super(driver);
        PageFactory.initElements(driver, this);
        this.user = user;
    }
    @FindBy(xpath = "/html/body/header/div[4]/form/div/div[2]/div[1]/input")
    private WebElement loginInput;
    @FindBy(xpath = "/html/body/header/div[4]/form/div/div[2]/div[2]/input")
    private WebElement passwordInput;
    @FindBy(xpath = "/html/body/header/div[4]/form/div/div[2]/input")
    private WebElement authorityButton;

    public void addLogin(){
        loginInput.sendKeys( user.getLogin());
    }
    public void addPassword(){passwordInput.sendKeys( user.getPassword());
    }
    public void clickLoginButton() {
        authorityButton.click();
    }

}
