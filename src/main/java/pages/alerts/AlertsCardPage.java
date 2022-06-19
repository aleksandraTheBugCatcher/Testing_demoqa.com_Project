package pages.alerts;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.common.BasePage;

public class AlertsCardPage extends BasePage {

    private By browserWindows = By.id("item-0");
    private By newTabBtn = By.id("tabButton");
    private By newWindowBtn = By.id("windowButton");
    private By newWindowMessageBtn = By.id("messageWindowButton");
    private By newPageHeader = By.id("sampleHeading");
    private By newMessage = By.xpath("/html/body");



    public AlertsCardPage(WebDriver driver, WebDriverWait driverWait, Actions actions) {
        super(driver, driverWait, actions);
    }

    public WebElement getBrowserWindows(){return getDriver().findElement(browserWindows);}

    public WebElement getNewTabBtn(){return getDriver().findElement(newTabBtn);}

    public WebElement getNewWindowBtn(){return getDriver().findElement(newWindowBtn);}

    public WebElement getNewWindowMessageBtn(){return getDriver().findElement(newWindowMessageBtn);}

    public String samplePageMessage(){return getDriver().findElement(newPageHeader).getText();}

    public String newMessageWindow(){return getDriver().findElement(newMessage).getText();}

    public void clickBrowserWindows(){
        scrollMethod();
        getBrowserWindows().click();}

    public void clickNewTabBtn(){getActions().moveToElement(getNewTabBtn()).click().perform();}

    public void clickNewWindowBtn(){getActions().moveToElement(getNewWindowBtn()).click().perform();}

    public void clickNewWindowMessageBtn(){getActions().moveToElement(getNewWindowMessageBtn()).click().perform();}



}
