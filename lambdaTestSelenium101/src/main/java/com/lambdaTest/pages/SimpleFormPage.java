package com.lambdaTest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SimpleFormPage extends BasePage {

    SimpleFormPage(WebDriver driver, WebDriverWait wait){
        super(driver,wait);

    }
    By enterMessage = By.xpath("//input[@id='user-message']");

    By getCheckedValue = By.cssSelector("button#showInput");
    By printedMessage = By.id("message");

public void enterMessage(String s){
    doSendKeys(enterMessage,s);
    doClick(getCheckedValue);
}

public String getYourMessage(){

    return doGetText(printedMessage);
}



}
