package com.Syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CssSelector {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "Drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://syntaxprojects.com/basic-first-form-demo.php");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("input[placeholder*='Please enter']")).sendKeys("ahadjeijd");
 //       another method for this operation
        WebElement textBox = driver.findElement(By.cssSelector("input[placeholder= 'Please enter']"));
        textBox.sendKeys("abracadbra");

//        press the button show message
        WebElement button = driver.findElement(By.cssSelector("button[onclick ^='showIn']"));
        button.click();
    }
}
