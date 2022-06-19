package tests.bookstore;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import tests.BaseTest;

import java.time.Duration;

public class BookStorePageTests extends BaseTest {



    @Test (priority = 1)
    public void verifyUserLoginWithValidCredentials(){
        getHomePage().bookStoreCardClick();
        getBookStorePage().clickLoginLink();
        getLoginPage().userLogIn("Ivke", "Ivan@0706");
        Assert.assertEquals(getProfilePage().getTextUserNameOnProfile(), "Ivke");
        Assert.assertTrue(getProfilePage().isLogoutBtnDisplayed());
    }

    @Test(priority = 2)
    public void verifyBookIsAddedToCollection(){
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
    @Ignore
    public void verifyUserIsLoggedOut(){
        getProfilePage().clickLogoutBtn();
        Assert.assertTrue(getLoginPage().areUserNameAndPasswordFieldDisplayed());
    }

}
