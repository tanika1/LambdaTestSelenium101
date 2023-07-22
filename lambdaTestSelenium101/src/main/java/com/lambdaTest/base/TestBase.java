package com.lambdaTest.base;

import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
    static WebDriver driver;
    static Properties prop = new Properties();
    TestBase() {
        try {
            FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "src/main/java/com/lambdaTest/config/config.properties");
        prop.load(ip);
        }
        catch(FileNotFoundException e){
            e.printStackTrace();}
        catch(IOException e){
                e.printStackTrace();
        }
    }
    public static void intialization(){

    }
}
