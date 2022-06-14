import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementsPage extends BasePage{
    private By textBox = By.xpath("//*[@id=\"item-0\"]");
    private By fullnameField = By.id("userName");
    private By email = By.id("userEmail");
    private By currentAddress = By.xpath("currentAddress");
    private By permanentAddress = By.id("permanentAddress");
    private By submitBtn = By.id("submit");
    private By outputMessage = By.xpath("//*[@id=\"output\"]/div");
    private By radioBtn = By.id("item-2");
    private By yesBtn = By.id("yesRadio");
    private By impressiveBtn = By.id("impressiveRadio");
    private By noBtn = By.id("noRadio");
    private By yesMessage = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/p");

    public ElementsPage(WebDriver driver, WebDriverWait driverWait, Actions actions) {
        super(driver, driverWait, actions);
    }

    public WebElement getTextBox() {return getDriver().findElement(textBox);}

    public WebElement getFullnameField() {return getDriver().findElement(fullnameField);}

    public WebElement getEmail() {return getDriver().findElement(email);}

    public WebElement getPermanentAddress() {return getDriver().findElement(permanentAddress);}

    public WebElement getSubmitBtn() {return getDriver().findElement(submitBtn);}

    public WebElement getradioBtn(){return getDriver().findElement(radioBtn);}

    public WebElement getYesBtn(){return getDriver().findElement(yesBtn);}

    public WebElement getImpressiveBtn(){return getDriver().findElement(impressiveBtn);}

    public String getYesMessage(){
        System.out.println(getDriver().findElement(yesMessage));
        return getDriver().findElement(yesMessage).getText();}

    public void textBoxClick(){getActions().moveToElement(getTextBox()).click().perform();}

    public void enterFullName(String name){getActions().moveToElement(getFullnameField()).sendKeys(name);}

    public void enterEmail(String userEmail){getEmail().sendKeys(userEmail);}

    public void enterCurrentAddress(String usersCurrentAddress){getFullnameField().sendKeys(usersCurrentAddress);};

    public void enterPermanentAddress(String usersPermanentAddress){getPermanentAddress().sendKeys(usersPermanentAddress);};

    public void clickSubmitBtn(){
        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        jsExecutor.executeScript("window.scrollBy(0,500)");
        getSubmitBtn().click();}

    public void clickRadioBtn(){
        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        jsExecutor.executeScript("window.scrollBy(0,500)");
        getradioBtn().click();}

    public void clickYesBtn(){getActions().moveToElement(getYesBtn()).click().perform();}

    public void clickImpressiveBtn(){getActions().moveToElement(getImpressiveBtn()).click().perform();}

    public boolean isNoBtnEnabled(){return getDriver().findElement(noBtn).isEnabled();}


    public void fillInTextBoxForm(){
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        textBoxClick();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        enterFullName("Ivan Ivanovic");
        enterEmail("nekiemail@gmail.com");
        enterCurrentAddress("Futoska 20, Novi Sad");
        enterPermanentAddress("Futoska 20, Novi Sad");
        clickSubmitBtn();
    }

    public boolean isOutputMessageDisplayed(){return getDriver().findElement(outputMessage).isDisplayed();}

}