package tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class BookStorePageTests extends BaseTest {

    @Test (priority = 1)
    public void verifyUserLoginWithValidCredentials(){
        getHomePage().bookStoreCardClick();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        getBookStorePage().clickLoginLink();
        getLoginPage().userLogIn();
        getDriverWait().until(ExpectedConditions.visibilityOf(getProfilePage().getProfileUserName()));
        Assert.assertEquals(getProfilePage().getTextUserNameOnProfile(), "Ivke");
        Assert.assertTrue(getProfilePage().isLogoutBtnDisplayed());
    }

    @Test(priority = 2)
    public void verifyBookIsAddedToCollection(){
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        getProfilePage().addFirstBookToCollection();
        getDriverWait().until(ExpectedConditions.visibilityOf(getProfilePage().getFirstBook()));
        Assert.assertTrue(getProfilePage().isBookAdded());
    }

    @Test (priority = 3)
    public void verifyThatBookIsDeletedFroCollection(){
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        getProfilePage().removeBookFromCollection();
        Assert.assertTrue(getProfilePage().isBookDeleted());
    }

    @Test(priority = 4)
    public void verifyUserIsLoggedOut(){
        getProfilePage().clickLogoutBtn();
        Assert.assertTrue(getLoginPage().areUserNameAndPasswordFieldDisplayed());
    }

}
