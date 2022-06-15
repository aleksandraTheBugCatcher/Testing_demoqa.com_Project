package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookStorePage extends BasePage {

    private By loginLink = By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[6]/div/ul/li[1]");
    private By bookStoreLink = By.xpath("//*[@id=\"item-2\"]");
    private By profileLink = By.id("item-3");
    private By bookStoreAPILink = By.id("item-4");
    private By loginBtn = By.id("login");
    private By userName = By.id("userName");
    private By passwordField = By.id("password");



    public BookStorePage(WebDriver driver, WebDriverWait driverWait, Actions actions) {
        super(driver, driverWait, actions);
    }

    public WebElement getLoginLink(){return getDriver().findElement(loginLink);}

    public WebElement getBookStoreLink(){return getDriver().findElement(bookStoreLink);}

    public WebElement getProfileLink(){return getDriver().findElement(profileLink);}

    public WebElement getBookStoreAPILink(){return getDriver().findElement(bookStoreAPILink);}

    public WebElement getLoginBtn(){return getDriver().findElement(loginBtn);}

    public WebElement getUserNameField(){return getDriver().findElement(userName);}

    public WebElement getPasswordField(){return getDriver().findElement(passwordField);}



    public void clickBookStoreBtn(){
        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        jsExecutor.executeScript("window.scrollBy(0,500)");
        getBookStoreLink().click();
    }

    public void clickLoginLink(){JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        jsExecutor.executeScript("window.scrollBy(0,500)");
        getLoginLink().click();}


    public void enterUserName(String userName){getUserNameField().sendKeys(userName);}

    public void enterPassword(String password){getPasswordField().sendKeys(password);}



    public void clickLoginBtn(){JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        jsExecutor.executeScript("window.scrollBy(0,500)");
        getLoginBtn().click();}

}
