package com.lambdaTest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InputFormPage extends BasePage{

    InputFormPage(WebDriver driver, WebDriverWait wait){
        super(driver,wait);

    }
    By name=By.name("name");
    By email=By.name("email");
    By password=By.name("password");
    By company=By.name("company");
    By website=By.name("website");
    By country=By.name("country");
    By city=By.name("city");
    By address1=By.name("address_line1");
    By address2=By.name("address_line2");
    By state=By.id("inputState");
    By zipCode = By.id("inputZip");
    By submit = By.cssSelector("button[type=submit]");
    By successMessage = By.className("success-msg hidden");

    public void clickSubmit(){
        doClick(submit);
    }
    public String fillFormDetails(){
        doSendKeys(name,"UserName");
        System.out.println(name);
        doSendKeys(email,"email@gmail.com");
        System.out.println(email);
        doSendKeys(password,"password");
        System.out.println(password);
        doSendKeys(company,"company");
        doSendKeys(website,"www.google.com");
        //selectByValue(country,"United States");
        doSendKeys(city,"city");
        doSendKeys(address1,"address1");
        doSendKeys(address2,"address2");
        doSendKeys(state,"state");
        doSendKeys(zipCode,"201001");
        clickSubmit();
        return getSuccessMessage();

    }

    public String getSuccessMessage(){
        return doGetText(successMessage);
    }



}
