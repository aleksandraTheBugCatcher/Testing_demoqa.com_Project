package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.common.BasePage;

public class ButtonsPage extends BasePage {
    private By doubleClickMeBtn = By.id("doubleClickBtn");
    private By rightClickMeBtn = By.id("rightClickBtn");
    private By clickMeBtn = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button");
    private By doubleClickMessage = By.id("doubleClickMessage");
    private By rightClickMessage = By.id("rightClickMessage");
    private By dynamicClickMessage = By.id("dynamicClickMessage");


    public ButtonsPage(WebDriver driver, WebDriverWait driverWait, Actions actions) {
        super(driver, driverWait, actions);
    }

    public WebElement getDoubleClickMeBtn(){return getDriver().findElement(doubleClickMeBtn);}

    public WebElement getRightClickMeBtn(){return getDriver().findElement(rightClickMeBtn);}

    public WebElement getClickMeBtn(){return getDriver().findElement(clickMeBtn);}

    public void doubleClickOnBtn(){getActions().doubleClick(getDoubleClickMeBtn()).perform();}

    public void rightClickOnBtn(){getActions().contextClick(getRightClickMeBtn()).perform();}

    public void dynamicClickOnBtn(){getActions().moveToElement(getClickMeBtn()).click().perform();}

    public String doubleClickMessage(){return getDriver().findElement(doubleClickMessage).getText();}

    public String rightClickMessage(){return getDriver().findElement(rightClickMessage).getText();}

    public String dynamicClickMessage(){
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getClickMeBtn()));
        return getDriver().findElement(dynamicClickMessage).getText();}


}
