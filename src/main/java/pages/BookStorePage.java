package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookStorePage extends BasePage {

    private By loginLink = By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[6]/div/ul/li[1]");
    private By bookStoreLink = By.xpath("//*[@id=\"item-2\"]");
    private By profileLink = By.id("item-3");
    private By bookStoreAPILink = By.id("item-4");

    public BookStorePage(WebDriver driver, WebDriverWait driverWait, Actions actions) {
        super(driver, driverWait, actions);
    }

    public WebElement getLoginLink(){return getDriver().findElement(loginLink);}

    public WebElement getBookStoreLink(){return getDriver().findElement(bookStoreLink);}

    public WebElement getProfileLink(){return getDriver().findElement(profileLink);}

    public WebElement getBookStoreAPILink(){return getDriver().findElement(bookStoreAPILink);}


    public void clickBookStoreBtn(){
        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        jsExecutor.executeScript("window.scrollBy(0,500)");
        getBookStoreLink().click();
    }

    public void clickLoginLink(){JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        jsExecutor.executeScript("window.scrollBy(0,500)");
        getLoginLink().click();}

    public void clickProfileLink(){
        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        jsExecutor.executeScript("window.scrollBy(0,500)");
        getProfileLink().click();
    }

}
