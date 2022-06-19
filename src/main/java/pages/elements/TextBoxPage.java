package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.common.BasePage;

import java.time.Duration;

public class TextBoxPage extends BasePage {
    private By fullNameField = By.id("userName");
    private By email = By.id("userEmail");
    private By currentAddress = By.id("currentAddress");
    private By permanentAddress = By.id("permanentAddress");
    private By submitBtn = By.id("submit");
    private By outputMessage = By.xpath("//*[@id=\"output\"]/div");

    public TextBoxPage(WebDriver driver, WebDriverWait driverWait, Actions actions) {
        super(driver, driverWait, actions);
    }
    public WebElement getFullNameField() {return getDriver().findElement(fullNameField);}

    public WebElement getEmail() {return getDriver().findElement(email);}

    public WebElement getCurrentAddress(){return getDriver().findElement(currentAddress);}

    public WebElement getPermanentAddress() {return getDriver().findElement(permanentAddress);}

    public WebElement getSubmitBtn() {return getDriver().findElement(submitBtn);}

    public void enterFullName(String name){getActions().moveToElement(getFullNameField()).sendKeys(name);}

    public void enterEmail(String userEmail){getEmail().sendKeys(userEmail);}

    public void enterCurrentAddress(String usersCurrentAddress){getCurrentAddress().sendKeys(usersCurrentAddress);};

    public void enterPermanentAddress(String usersPermanentAddress){getPermanentAddress().sendKeys(usersPermanentAddress);};

    public void clickSubmitBtn(){
        scrollMethod();
        getSubmitBtn().click();}

    public void fillInTextBoxForm(String fulName, String email, String currentAddress, String permanentAddress){
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        enterFullName(fulName);
        enterEmail(email);
        enterCurrentAddress(currentAddress);
        enterPermanentAddress(permanentAddress);
        clickSubmitBtn();
    }

    public boolean isOutputMessageDisplayed(){return getDriver().findElement(outputMessage).isDisplayed();}

}
