package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.common.BasePage;

import java.time.Duration;

public class CheckBoxPage extends BasePage {
    private By homeCheckBox = By.xpath("//*[@id=\"tree-node\"]/ol/li/span/label/span[1]");
    private By conformationMessage = By.id("result");
    private By expandAllBtn = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/div/button[1]");
    private By reactCheckBox= By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[1]/ol/li[1]/span/label/span[1]");


    public CheckBoxPage(WebDriver driver, WebDriverWait driverWait, Actions actions) {
        super(driver, driverWait, actions);
    }

    public WebElement getHomeCheckBox(){return getDriver().findElement(homeCheckBox);}

    public WebElement getConformationMessage(){return getDriver().findElement(conformationMessage);}

    public WebElement getExpandAllBtn(){return getDriver().findElement(expandAllBtn);}

    private WebElement getReactCheckBox(){return getDriver().findElement(reactCheckBox);}

    public void clickHomeCheckBox(){
        getDriverWait().until(ExpectedConditions.visibilityOf(getHomeCheckBox()));
        getHomeCheckBox().click();
    }

    public String getConformationMessageText(){return getConformationMessage().getText();}

    public String expectedMessageForHomeCheckBox(){
    String text = "You have selected :\n" +
            "home\n" +
            "desktop\n" +
            "notes\n" +
            "commands\n" +
            "documents\n" +
            "workspace\n" +
            "react\n" +
            "angular\n" +
            "veu\n" +
            "office\n" +
            "public\n" +
            "private\n" +
            "classified\n" +
            "general\n" +
            "downloads\n" +
            "wordFile\n" +
            "excelFile";
    return text; }

    public void clickExpandAllBtn(){
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        getActions().moveToElement(getExpandAllBtn()).click().perform();}

    public void clickReactCheckBox(){
        clickExpandAllBtn();
        scrollMethod();
        getReactCheckBox().click();
    }



}
