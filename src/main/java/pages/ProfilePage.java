package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ProfilePage extends BasePage{

    private By profileUserName = By.id("userName-value");
    private By logoutBtn = By.id("submit");
    private By goToBookStoreBtn = By.id("gotoStore");
    private By firstBook = By.xpath("//*[@id=\"see-book-Git Pocket Guide\"]/a");
    private By deleteAllBooks = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/div[3]/button");
    private By confirmDeletingBook = By.id("closeSmallModal-ok");
    private By addBookToCollection = By.id("addNewRecordButton");


    public ProfilePage(WebDriver driver, WebDriverWait driverWait, Actions actions) {
        super(driver, driverWait, actions);
    }

    public WebElement getProfileUserName(){return getDriver().findElement(profileUserName);}

    public WebElement getLogoutBtn(){return getDriver().findElement(logoutBtn);}

    public WebElement getGoToBookStoreBtn(){return getDriver().findElement(goToBookStoreBtn);}

    public WebElement getFirstBook(){return getDriver().findElement(firstBook);}

    public WebElement getDeleteAllBooks(){return getDriver().findElement(deleteAllBooks);}

    public WebElement getConfirmDeletingBook(){return getDriver().findElement(confirmDeletingBook);}

    public WebElement getAddBookToCollection(){return getDriver().findElement(addBookToCollection);}

    public String getTextUserNameOnProfile(){return getProfileUserName().getText();}

    public boolean isLogoutBtnDisplayed(){return getLogoutBtn().isDisplayed();}

    public void clickGoToBookStore(){
        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        jsExecutor.executeScript("window.scrollBy(0,500)");
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getGoToBookStoreBtn()));
        getGoToBookStoreBtn().click();}

    public void clickFirstBook(){getFirstBook().click();}

    public void clickAddBookToCollection(){
        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        jsExecutor.executeScript("window.scrollBy(0,500)");
        getAddBookToCollection().click();
    }

    public void addFirstBookToCollection(){
        clickGoToBookStore();
        getDriverWait().until(ExpectedConditions.visibilityOf(getFirstBook()));
        clickFirstBook();
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getAddBookToCollection()));
        clickAddBookToCollection();
    }

    public boolean isBookAdded(){return getFirstBook().isDisplayed();}

    public void removeBookFromCollection(){
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        jsExecutor.executeScript("window.scrollBy(0,500)");
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getAddBookToCollection()));
        getDeleteAllBooks().click();
        getDriverWait().until(ExpectedConditions.visibilityOf(getConfirmDeletingBook()));
        getConfirmDeletingBook().click();
    }

    public boolean isBookDeleted(){
        List<WebElement> listOfBooks = getDriver().findElements(By.className("rt-tr-group"));
        return listOfBooks.isEmpty();}

    public void clickLogoutBtn(){
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getLogoutBtn()));
        getLogoutBtn().click();
    }

}
