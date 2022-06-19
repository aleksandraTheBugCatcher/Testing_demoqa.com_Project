package pages.bookstore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.common.BasePage;

import java.time.Duration;

public class LoginPage extends BasePage {

    private By loginBtn = By.id("login");
    private By userName = By.id("userName");
    private By passwordField = By.id("password");

    public LoginPage(WebDriver driver, WebDriverWait driverWait, Actions actions) {
        super(driver, driverWait, actions);
    }
    public WebElement getLoginBtn(){return getDriver().findElement(loginBtn);}

    public WebElement getUserNameField(){return getDriver().findElement(userName);}

    public WebElement getPasswordField(){return getDriver().findElement(passwordField);}

    public void enterUserName(String userName){getUserNameField().sendKeys(userName);}

    public void enterPassword(String password){getPasswordField().sendKeys(password);}

    public void clickLoginBtn(){
        scrollMethod();
        getLoginBtn().click();}

    public void userLogIn(String userName, String password){
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        enterUserName(userName);
        enterPassword(password);
        getDriverWait().until(ExpectedConditions.elementToBeClickable(loginBtn));
        clickLoginBtn();
    }

    public boolean areUserNameAndPasswordFieldDisplayed(){
        if (getUserNameField().isDisplayed() && getPasswordField().isDisplayed()){
            return true;
        }else return false;
    }

}
