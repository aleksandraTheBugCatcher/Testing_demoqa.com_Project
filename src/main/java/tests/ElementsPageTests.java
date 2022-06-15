package tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

public class ElementsPageTests extends BaseTest {

    @Test (priority = 1) //Verify that a user can be created in Text Box section with valid inputs
    public void verifyThatUserIsCreatedWithValidInputs(){
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getHomePage().getElementsCard()));
        getHomePage().elementsCardClick();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        getElementsPage().fillInTextBoxForm();
        Assert.assertTrue(getElementsPage().isOutputMessageDisplayed());
    }

    @Test (priority = 2)//Verify that "Yes" and "Impressive" buttons can be selected in Radio Button section, and "No" can not be selected
    public void verifyThatYesAndImpressiveBtnsCanBeSelectedAndNoBtnDisabled(){
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getHomePage().getElementsCard()));
        getHomePage().elementsCardClick();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        getElementsPage().clickRadioBtn();
        getElementsPage().clickYesBtn();
        Assert.assertEquals(getElementsPage().getYesMessage(), "You have selected Yes");
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        getElementsPage().clickImpressiveBtn();
        Assert.assertEquals(getElementsPage().getYesMessage(), "You have selected Impressive");
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        Assert.assertFalse(getElementsPage().isNoBtnEnabled());
    }

}
