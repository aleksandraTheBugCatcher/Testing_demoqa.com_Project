package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.*;

import java.time.Duration;

public class BaseTest {
    private WebDriver driver;
    private WebDriverWait driverWait;
    private Actions actions;
    private HomePage homePage;
    private ElementsPage elementsPage;
    private BookStorePage bookStorePage;
    private LoginPage loginPage;
    private ProfilePage profilePage;

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getDriverWait() {
        return driverWait;
    }

    public Actions getActions() {
        return actions;
    }

    public HomePage getHomePage() {
        return homePage;
    }

    public ElementsPage getElementsPage() {
        return elementsPage;
    }

    public BookStorePage getBookStorePage() {return bookStorePage;}

    public LoginPage getLoginPage(){return loginPage;}

    public ProfilePage getProfilePage(){return profilePage;}

    @BeforeClass
    public void beforeClass(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driverWait = new WebDriverWait(driver, Duration.ofSeconds(15));
        actions = new Actions(driver);
        homePage = new HomePage(driver,driverWait,actions);
        elementsPage = new ElementsPage(driver,driverWait, actions);
        bookStorePage = new BookStorePage(driver,driverWait,actions);
        loginPage = new LoginPage(driver,driverWait,actions);
        profilePage = new ProfilePage(driver,driverWait,actions);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.navigate().to("https://demoqa.com/");
    }


    @AfterClass
    public void afterClass(){
        driver.close();
    }



}
