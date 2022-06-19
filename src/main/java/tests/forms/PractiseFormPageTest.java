package tests.forms;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import java.time.Duration;

public class PractiseFormPageTest extends BaseTest {

    @Test
    public void verifyStudentIsRegisteredWithValidInputs(){
        getHomePage().formsCardClick();
        getFormsPage().clickOnPracticeFormLink();
        getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        getPracticeFormPage().fillInTheForm("Ivan","Ivanovic","nekimail@gmail.com",
                "0099132457","12 Jun 1990");

        Assert.assertEquals(getPracticeFormPage().studentData(), "");

    }


}
