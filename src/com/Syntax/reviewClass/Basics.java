package com.Syntax.reviewClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Basics {
    public static void main(String[] args) throws InterruptedException {
//   setting up the Webdriver
     System.setProperty("webdriver.edge.driver","Drivers/msedgedriver.exe");
//   create an instance
     WebDriver driver = new EdgeDriver();
//   open facebook
     driver.get("https://www.facebook.com/");
//   maximize the window
     driver.manage().window().maximize();





//   before closing wait for some time
        Thread.sleep(5000);
//   quit browser
     driver.quit();

    }
}
