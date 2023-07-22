package com.lambdaTest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDropPage extends BasePage{

DragAndDropPage(WebDriver driver, WebDriverWait wait){
    super(driver,wait);
}
    By slider = By.xpath("//div[@id='slider3']/div/input");
    By slidingRange = By.id("rangeSuccess");

    public void dragBar(int num) {
        for (int i = 1; i <= num; i++) {
            driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
        }
    }
        public String getSlidingRange(){
           return doGetText(slidingRange);
        }

}
    


