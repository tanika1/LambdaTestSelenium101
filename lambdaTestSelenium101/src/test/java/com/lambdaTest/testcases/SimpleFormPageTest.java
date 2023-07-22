package com.lambdaTest.testcases;

import com.lambdaTest.pages.HomePage;
import com.lambdaTest.pages.Page;
import com.lambdaTest.pages.SimpleFormPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SimpleFormPageTest extends BaseTest {

    @Test(priority =1)
    public void verifySimpleFormPageURL(){
         page.getInstance(HomePage.class).clickSimpleFormlink();
        String url= page.getInstance(SimpleFormPage.class).getPageURL();
        System.out.println("Page URL is :" + url);
        Assert.assertTrue(url.contains("simple-form-demo"),"Page Url contains simple-form-demo");
    }

    @Test(priority =2)
    public void verifySimpleFormMessage(){
        page.getInstance(HomePage.class).clickSimpleFormlink();
        String msg ="Welcome to LambdaTest Message Entered";
        page.getInstance(SimpleFormPage.class).enterMessage(msg);
        String printedMsg = page.getInstance(SimpleFormPage.class).getYourMessage();
        System.out.println("Entered Message is :" + msg);
        System.out.println("Printed Message is :" + printedMsg);
        Assert.assertEquals(printedMsg,msg);
        System.out.println("Printed message is same as entered message");

    }

}

