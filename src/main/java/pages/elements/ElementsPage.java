package pages.elements;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.common.BasePage;

public class ElementsPage extends BasePage {
    private By textBox = By.id("item-0");
    private By checkBox = By.id("item-1");
    private By radioBtn = By.id("item-2");
    private By webTables= By.id("item-3");
    private By buttons = By.id("item-4");

    public ElementsPage(WebDriver driver, WebDriverWait driverWait, Actions actions) {
        super(driver, driverWait, actions);
    }

    public WebElement getTextBox(){return getDriver().findElement(textBox);}

    public WebElement getCheckBox(){return getDriver().findElement(checkBox);}

    public WebElement getRadioBtn(){return getDriver().findElement(radioBtn);}

    public WebElement getWebTables(){return getDriver().findElement(webTables);}

    public WebElement getButtons(){return getDriver().findElement(buttons);}


    public void textBoxClick(){getActions().moveToElement(getTextBox()).click().perform();}

    public void checkBoxClick(){
        scrollMethod();
        getCheckBox().click();
    }

    public void clickRadioBtn(){
        scrollMethod();
        getRadioBtn().click();}

    public void clickWebTableLink(){
        scrollMethod();
        getWebTables().click();
    }

    public void clickButtonsLink(){
        scrollMethod();
        getButtons().click();
    }

}