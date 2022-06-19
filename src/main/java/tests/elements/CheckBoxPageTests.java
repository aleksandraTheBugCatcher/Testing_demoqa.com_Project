package tests.elements;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class CheckBoxPageTests extends BaseTest {

    @BeforeMethod
    public void beforeMethod(){
        getHomePage().elementsCardClick();
        getElementsPage().checkBoxClick();
    }

    @Test
    public void verifyThatHomeCheckBoxIsSelected(){
        getCheckBoxPage().clickHomeCheckBox();
        Assert.assertEquals(getCheckBoxPage().getConformationMessageText(),
                getCheckBoxPage().expectedMessageForHomeCheckBox());
    }

    @Test
    public void verifyThatReactCheckBoxIsSelected(){
        getCheckBoxPage().clickReactCheckBox();
        Assert.assertEquals(getCheckBoxPage().getConformationMessageText(), "You have selected :\n" +
                "react");
    }


}
