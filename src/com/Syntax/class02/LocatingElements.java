package com.Syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatingElements {
    public static void main(String[] args) {
// go to Fb.com
// Enter username
// Enter password
// click login

        System.setProperty("webdriver.edge.driver", "Drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.facebook.com/");
//      enter the username in the TestBOX
             //     1.locate the element and send the keys
        driver.findElement(By.id("email")).sendKeys("abrbayue");
//       enter the password in the Textbox
        driver.findElement(By.name("pass")).sendKeys("ksiaod09");
//       click the login
//        driver.findElement(By.name("login")).click();

//      task2:
//      click on forgot password using linkText locater
//      driver.findElement(By.linkText("Forgot password?")).click();

//      task3:
      //        click on forgot password using Partial linkText locater

      driver.findElement(By.partialLinkText("Forgot")).click();

    }
}
