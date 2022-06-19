package pages.forms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.common.BasePage;

public class PracticeFormPage extends BasePage {
    private By firstName = By.id("firstName");
    private By lastName = By.id("lastName");
    private By userEmail = By.id("userEmail");
    private By gender = By.id("gender-radio-1");
    private By mobileNumber = By.id("userNumber");
    private By dateOfBirth = By.id("dateOfBirthInput");
    private By hobbySports = By.id("hobbies-checkbox-1");
    private By submitBtn = By.id("submit");
    private By modalTitle = By.id("example-modal-sizes-title-lg");
    private By studentData = By.xpath("/html/body/div[4]/div/div/div[2]/div/table/tbody");

    public PracticeFormPage(WebDriver driver, WebDriverWait driverWait, Actions actions) {
        super(driver, driverWait, actions);
    }

    public WebElement getFirstName(){return getDriver().findElement(firstName);}

    public WebElement getLastName(){return getDriver().findElement(lastName);}

    public WebElement getUserEmail(){return getDriver().findElement(userEmail);}

    public WebElement getGender(){return getDriver().findElement(gender);}

    public WebElement getMobileNumber(){return getDriver().findElement(mobileNumber);}

    public WebElement getDateOfBirth(){return getDriver().findElement(dateOfBirth);}

    public WebElement getHobbySports(){return getDriver().findElement(hobbySports);}

    public WebElement getSubmitBtn(){return getDriver().findElement(submitBtn);}

    public void enterFirstName(String name){getFirstName().sendKeys(name);}

    public void enterLastName(String surname){getLastName().sendKeys(surname);}

    public void enterEmail(String email){getUserEmail().sendKeys(email);}

    public void selectGender(){getActions().moveToElement(getGender()).click().perform();}

    public void enterMobileNumber(String phoneNumb){getMobileNumber().sendKeys(phoneNumb);}

    public void enterDateOfBirth(String date){
        scrollMethod();
        getDateOfBirth().clear();
        getDateOfBirth().sendKeys(date);
    }

    public void selectHobby(){
        scrollMethod();
        getActions().moveToElement(getHobbySports()).click().perform();
    }

    public void clickSubmitBtn(){
        scrollMethod();
        getActions().moveToElement(getSubmitBtn()).click().perform();
    }

    public void fillInTheForm(String name,String surname,String email,String phoneNumb,String date){
        enterFirstName(name);
        enterLastName(surname);
        enterEmail(email);
        selectGender();
        enterMobileNumber(phoneNumb);
        enterDateOfBirth(date);
        selectHobby();
        clickSubmitBtn();
    }

    public String studentData(){
        switchToChildWindow();
        getDriverWait().until(ExpectedConditions.visibilityOf(getDriver().findElement(modalTitle)));
        return getDriver().findElement(modalTitle).getText();
    }

    public void fillInTheFormWithEnter(String name,String surname,String email,String phoneNumb,String date){
        enterFirstName(name);
        enterLastName(surname);
        enterEmail(email);
        selectGender();
        enterMobileNumber(phoneNumb);
        enterDateOfBirth(date);
        selectHobby();
        getHobbySports().sendKeys(Keys.ENTER);

    }




}
