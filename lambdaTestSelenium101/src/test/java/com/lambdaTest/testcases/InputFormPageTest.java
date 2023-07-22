package com.lambdaTest.testcases;

import com.lambdaTest.pages.HomePage;
import com.lambdaTest.pages.InputFormPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InputFormPageTest extends BaseTest{

    @Test(priority =1)
    public void verifyInputFormFailureMessage(){
        System.out.println("Test");
    }

    @Test
    public void verifyInputFormSuccessMessage(){
        page.getInstance(HomePage.class).clickInputFormSubmit();
        System.out.println("Debug");
        try{
        Thread.sleep(2000);}
        catch(Exception e){
            e.printStackTrace();
        }
        String printedMsg =page.getInstance(InputFormPage.class).fillFormDetails();
        System.out.println("Printed Message is :" + printedMsg);
        Assert.assertEquals(printedMsg,"Thanks for contacting us, we will get back to you shortly.");

    }

}

