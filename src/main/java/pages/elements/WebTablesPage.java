package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.common.BasePage;

public class WebTablesPage extends BasePage {
    private By addButton = By.id("addNewRecordButton");
    private By firstName = By.id("firstName");
    private By lastName = By.id("lastName");
    private By email = By.id("userEmail");
    private By age = By.id("age");
    private By salary = By.id("salary");
    private By department = By.id("department");
    private By submitBtn = By.id("submit");
    private By searchField = By.id("searchBox");
    private By newRecord = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]");
    private By firstInSearch = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]");
    private By deleteBtn = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div/div[7]/div/span[2]");



    public WebTablesPage(WebDriver driver, WebDriverWait driverWait, Actions actions) {
        super(driver, driverWait, actions);
    }

    public WebElement getAddButton(){return getDriver().findElement(addButton);}

    public WebElement getFirstName(){return getDriver().findElement(firstName);}

    public WebElement getLastName(){return getDriver().findElement(lastName);}

    public WebElement getEmail(){return getDriver().findElement(email);}

    public WebElement getAge(){return getDriver().findElement(age);}

    public WebElement getSalary(){return getDriver().findElement(salary);}

    public WebElement getDepartment(){return getDriver().findElement(department);}

    public WebElement getSubmitBtn(){return getDriver().findElement(submitBtn);}

    public WebElement getSearchField(){return getDriver().findElement(searchField);}

    public WebElement getDeleteBtn(){return getDriver().findElement(deleteBtn);}

    public void clickAddBtn(){
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getAddButton()));
        getAddButton().click();}

    public void enterFirstName(String name){getFirstName().sendKeys(name);}

    public void enterLastName(String surname){getLastName().sendKeys(surname);}

    public void enterEmail(String emailAddress){getEmail().sendKeys(emailAddress);}

    public void enterAge(String  userAge){getAge().sendKeys(userAge);}

    public void enterSalary(String userSalary){getSalary().sendKeys(userSalary);}

    public void enterDepartment(String userDepartment){getDepartment().sendKeys(userDepartment);}

    public void clickSubmitBtn(){getActions().moveToElement(getSubmitBtn()).click().perform();}

    public void fillInForm(String name,String surname,String emailAddress,String userAge,String userSalary,
                           String userDepartment){
        clickAddBtn();
        switchToChildWindow();
        enterFirstName(name);
        enterLastName(surname);
        enterEmail(emailAddress);
        enterAge(userAge);
        enterSalary(userSalary);
        enterDepartment(userDepartment);
        clickSubmitBtn();
    }

    public String newRecordText(){return getDriver().findElement(newRecord).getText();}

    public void enterInSearchField(String text){getSearchField().sendKeys(text);}

    public String firstInSearchText(){return getDriver().findElement(firstInSearch).getText();}

    public void clickDeleteBtn(){
        scrollMethod();
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getDeleteBtn()));
        getDeleteBtn().click();}

}
