package com.Syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class maximizeWindow {
    public static void main(String[] args) {

        // go to google.com
        // maximize your window


        System.setProperty("webdriver.edge.driver", "Drivers/msedgedriver.exe");
        //      create the Webdriver instance
        WebDriver driver = new EdgeDriver();
//      go to google.com
        driver.get("https://www.ebay.com/");
//      maximize
//      driver.manage().window().maximize();
//      fullscreen
        driver.manage().window().fullscreen();
//      quit
        driver.quit();


    }
}