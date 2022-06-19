package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.common.BasePage;

public class RadioButtonPage extends BasePage {
    private By yesBtn = By.id("yesRadio");
    private By impressiveBtn = By.id("impressiveRadio");
    private By noBtn = By.id("noRadio");
    private By yesMessage = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/p");

    public RadioButtonPage(WebDriver driver, WebDriverWait driverWait, Actions actions) {
        super(driver, driverWait, actions);
    }

    public WebElement getYesBtn(){return getDriver().findElement(yesBtn);}

    public WebElement getImpressiveBtn(){return getDriver().findElement(impressiveBtn);}

    public String getYesMessage(){
        System.out.println(getDriver().findElement(yesMessage));
        return getDriver().findElement(yesMessage).getText();}

    public void clickYesBtn(){getActions().moveToElement(getYesBtn()).click().perform();}

    public boolean isYesBtnSelected(){return getYesBtn().isSelected();}

    public void clickImpressiveBtn(){
        getActions().moveToElement(getImpressiveBtn()).click().perform();}

    public boolean isImpressiveBtnSelected(){return getImpressiveBtn().isSelected();}

    public boolean isNoBtnEnabled(){return getDriver().findElement(noBtn).isEnabled();}


}
