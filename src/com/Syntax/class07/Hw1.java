package com.Syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Set;

public class Hw1 {
    public static void main(String[] args) {
        //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.edge.driver", "Drivers/msedgedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new EdgeDriver();
//        open gmail.com sigup page
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");

        WebElement helpBtn = driver.findElement(By.xpath("//a[text() = 'Help']"));
        helpBtn.click();

        WebElement privacyBtn = driver.findElement(By.xpath("//a[text() = 'Privacy']"));
        privacyBtn.click();

        Set<String> windowHandles = driver.getWindowHandles();



    }
}
