package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ElementsPageTests extends BaseTest {

    @Test (priority = 1) //Verify that a user can be created in Text Box section with valid inputs
    public void verifyThatUserIsCreatedWithValidInputs(){
        getHomePage().elementsCardClick();
        getElementsPage().fillInTextBoxForm();
        Assert.assertTrue(getElementsPage().isOutputMessageDisplayed());
        getHomePage().headerClick();
    }

    @Test (priority = 2)//Verify that "Yes" and "Impressive" buttons can be selected in Radio Button section, and "No" can not be selected
    public void verifyThatYesAndImpressiveBtnsCanBeSelectedAndNoBtnDisabled(){
        getHomePage().elementsCardClick();
        getElementsPage().clickRadioBtn();
        getElementsPage().clickYesBtn();
        Assert.assertFalse(getElementsPage().isImpressiveBtnSelected());
        Assert.assertEquals(getElementsPage().getYesMessage(), "You have selected Yes");
        getElementsPage().clickImpressiveBtn();
        Assert.assertFalse(getElementsPage().isYesBtnSelected());
        Assert.assertEquals(getElementsPage().getYesMessage(), "You have selected Impressive");
        Assert.assertFalse(getElementsPage().isNoBtnEnabled());
    }

}
