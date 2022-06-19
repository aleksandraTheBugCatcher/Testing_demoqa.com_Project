package tests.elements;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;
;

public class WebTablesPageTests extends BaseTest {

    @Test (priority = 1)
    public void verifyThatNewRecordCanBeAddedToATable(){
        getHomePage().elementsCardClick();
        getElementsPage().clickWebTableLink();
        getWebTablesPage().fillInForm("Petar","Jovic","newmail@gmail.com",
                "31","1250","QA");
        Assert.assertEquals(getWebTablesPage().newRecordText(),"Petar\n" +
                "Jovic\n" +
                "31\n" +
                "newmail@gmail.com\n" +
                "1250\n" +
                "QA");
    }

    /**Had to use thread sleep for search field, because no waiter will wait enough to enter wanted text in search field
     *  and actual result will always be the first record in table */


    @Test (priority = 2)
    public void verifySearchFunctionality(){
        getHomePage().elementsCardClick();
        getElementsPage().clickWebTableLink();
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getWebTablesPage().getSearchField()));
        getWebTablesPage().enterInSearchField("petar");
        Assert.assertEquals(getWebTablesPage().firstInSearchText(),"Petar\n" +
                "Jovic\n" +
                "31\n" +
                "newmail@gmail.com\n" +
                "1250\n" +
                "QA");
    }

    @Test (priority = 3)
    public void verifyThatLastRecordIsDeleted(){
        getHomePage().elementsCardClick();
        getElementsPage().clickWebTableLink();
        getWebTablesPage().clickDeleteBtn();
        Assert.assertEquals(getWebTablesPage().newRecordText(),"");
    }


}
