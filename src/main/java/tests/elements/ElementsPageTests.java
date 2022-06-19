package tests.elements;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class ElementsPageTests extends BaseTest {

    /**Verify that a user can be created in Text Box section with valid inputs*/

    @Test (priority = 1)
    public void verifyThatUserIsCreatedWithValidInputs(){
        getHomePage().elementsCardClick();
        getElementsPage().textBoxClick();
        getTextBoxPage().fillInTextBoxForm("Ivan Ivanovic","nekiemail@gmail.com",
                "nekiemail@gmail.com","Futoska 20, Novi Sad");
        Assert.assertTrue(getTextBoxPage().isOutputMessageDisplayed());
        getHomePage().headerClick();
    }

    /** Verify that "Yes" and "Impressive" buttons can be selected in Radio Button section,
     * and "No" button can not be selected */

    @Test (priority = 2)
    public void verifyThatYesAndImpressiveBtnsCanBeSelectedAndNoBtnDisabled(){
        getHomePage().elementsCardClick();
        getElementsPage().clickRadioBtn();
        getRadioButtonPage().clickYesBtn();
        Assert.assertFalse(getRadioButtonPage().isImpressiveBtnSelected());
        Assert.assertEquals(getRadioButtonPage().getYesMessage(), "You have selected Yes");
        getRadioButtonPage().clickImpressiveBtn();
        Assert.assertFalse(getRadioButtonPage().isYesBtnSelected());
        Assert.assertEquals(getRadioButtonPage().getYesMessage(), "You have selected Impressive");
        Assert.assertFalse(getRadioButtonPage().isNoBtnEnabled());
    }

}
