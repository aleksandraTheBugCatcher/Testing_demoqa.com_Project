package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.bookstore.BookStorePage;
import pages.bookstore.LoginPage;
import pages.bookstore.ProfilePage;
import pages.common.HomePage;
import pages.elements.*;
import pages.forms.PracticeFormPage;
import pages.forms.FormsPage;

import java.time.Duration;

public class BaseTest {
    private WebDriver driver;
    private WebDriverWait driverWait;
    private Actions actions;
    private HomePage homePage;
    private ElementsPage elementsPage;
    private TextBoxPage textBoxPage;
    private RadioButtonPage radioButtonPage;
    private CheckBoxPage checkBoxPage;
    private WebTablesPage webTablesPage;
    private ButtonsPage buttonsPage;
    private FormsPage formsPage;
    private PracticeFormPage practiceFormPage;
    private BookStorePage bookStorePage;
    private LoginPage loginPage;
    private ProfilePage profilePage;

    public WebDriver getDriver(){return driver;}

    public WebDriverWait getDriverWait(){return driverWait;}

    public Actions getActions(){return actions;}

    public HomePage getHomePage(){return homePage;}

    public ElementsPage getElementsPage(){return elementsPage;}

    public TextBoxPage getTextBoxPage(){return textBoxPage;}

    public RadioButtonPage getRadioButtonPage(){return radioButtonPage;}

    public CheckBoxPage getCheckBoxPage(){return checkBoxPage;}

    public WebTablesPage getWebTablesPage(){return webTablesPage;}

    public ButtonsPage getButtonsPage(){return buttonsPage;}

    public FormsPage getFormsPage() {return formsPage;}

    public PracticeFormPage getPracticeFormPage(){return practiceFormPage;}

    public BookStorePage getBookStorePage(){return bookStorePage;}

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
        textBoxPage = new TextBoxPage(driver,driverWait,actions);
        radioButtonPage = new RadioButtonPage(driver,driverWait,actions);
        checkBoxPage = new CheckBoxPage(driver,driverWait,actions);
        webTablesPage = new WebTablesPage(driver,driverWait,actions);
        buttonsPage = new ButtonsPage(driver,driverWait,actions);
        formsPage = new FormsPage(driver,driverWait,actions);
        practiceFormPage = new PracticeFormPage(driver,driverWait,actions);
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
