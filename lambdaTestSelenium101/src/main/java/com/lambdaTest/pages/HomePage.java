package com.lambdaTest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{

    HomePage(WebDriver driver, WebDriverWait wait){
        super(driver,wait);

    }

    By simpleFormlink = new By.ByLinkText("Simple Form Demo");
    By dragDropLink = new By.ByLinkText("Drag & Drop Sliders");
    By inputFormSubmit = new By.ByLinkText("Input Form Submit");

public void clickSimpleFormlink(){
    doClick(simpleFormlink);
}
    public void clickDragDropLink(){
        doClick(dragDropLink);
    }
    public void clickInputFormSubmit(){
        doClick(inputFormSubmit);
    }

}
