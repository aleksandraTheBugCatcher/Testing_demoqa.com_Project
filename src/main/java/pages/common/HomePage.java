package pages.common;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.common.BasePage;

public class HomePage extends BasePage {

    private By header = By.xpath("//*[@id=\"app\"]/header/a");
    private By elementsCard= By.xpath("/html/body/div[2]/div/div/div[2]/div/div[1]");
    private By formsCard = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]");
    private By alertsCard = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]");
    private By widgetsCard = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]");
    private By interactionsCard = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[5]");
    private By bookStoreCard = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[6]");

    public HomePage(WebDriver driver, WebDriverWait driverWait, Actions actions) {
        super(driver, driverWait, actions);
    }

    public WebElement getHeader() {
        return getDriver().findElement(header);
    }

    public WebElement getElementsCard() {
        return getDriver().findElement(elementsCard);
    }

    public WebElement getFormsCard() {
        return getDriver().findElement(formsCard);
    }

    public WebElement getAlertsCard() {
        return getDriver().findElement(alertsCard);
    }

    public WebElement getWidgetsCard() {
        return getDriver().findElement(widgetsCard);
    }

    public WebElement getInteractionsCard() {
        return getDriver().findElement(interactionsCard);
    }

    public WebElement getBookStoreCard() {
        return getDriver().findElement(bookStoreCard);
    }

    public void headerClick(){getActions().moveToElement(getHeader()).click().perform();}

    public void elementsCardClick(){
        scrollMethod();
        getElementsCard().click();}

    public void formsCardClick(){
        scrollMethod();
        getFormsCard().click();}

    public void alertsCardClick(){
        scrollMethod();
        getAlertsCard().click();}

    public void widgetsCardClick(){getActions().moveToElement(getWidgetsCard()).click().perform();}

    public void interactionsCardClick(){getActions().moveToElement(getInteractionsCard()).click().perform();}

    public void bookStoreCardClick(){getActions().moveToElement(getBookStoreCard()).click().perform();}

}
