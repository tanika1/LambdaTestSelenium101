package com.lambdaTest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends Page{

    public BasePage(WebDriver driver, WebDriverWait wait) {
        super(driver,wait);
    }

    public void doSendKeys(By locator, String text){
       driver.findElement(locator).sendKeys(text);
    }
    public void doClick(By locator){
        driver.findElement(locator).click();
    }

    public String doGetText(By locator){
        return driver.findElement(locator).getText();
    }

    public String getPageURL(){
        String url = driver.getCurrentUrl();
        return url;
    }

    public void selectByValue(By locator,String value){
        Select drp = new Select(driver.findElement(locator));
        drp.selectByValue(value);
    }
}
