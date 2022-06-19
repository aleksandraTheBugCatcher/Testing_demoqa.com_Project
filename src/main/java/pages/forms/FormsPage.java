package pages.forms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.common.BasePage;

import java.time.Duration;

public class FormsPage extends BasePage {
    private By practiceForm = By.id("item-0");

    public FormsPage(WebDriver driver, WebDriverWait driverWait, Actions actions) {
        super(driver, driverWait, actions);
    }

    public WebElement getPracticeForm(){return getDriver().findElement(practiceForm);}

    public void clickOnPracticeFormLink(){
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        getActions().moveToElement(getPracticeForm()).click().perform();
    }

}
