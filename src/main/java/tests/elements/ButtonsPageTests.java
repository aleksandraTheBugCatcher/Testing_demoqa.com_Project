package tests.elements;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class ButtonsPageTests extends BaseTest {

    @BeforeMethod
    public void beforeMethod(){
        getHomePage().elementsCardClick();
        getElementsPage().clickButtonsLink();
    }

    @Test
    public void verifyDoubleClickBtnFunctionality(){
        getButtonsPage().doubleClickOnBtn();
        Assert.assertEquals(getButtonsPage().doubleClickMessage(),"You have done a double click");
    }

    @Test
    public void verifyRightClickBtnFunctionality(){
        getButtonsPage().rightClickOnBtn();
        Assert.assertEquals(getButtonsPage().rightClickMessage(),"You have done a right click");
    }

    @Test
    public void verifyDynamicClickBtnFunctionality(){
        getButtonsPage().dynamicClickOnBtn();
        Assert.assertEquals(getButtonsPage().dynamicClickMessage(),"You have done a dynamic click");
    }

}
