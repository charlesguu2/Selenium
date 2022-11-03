package com.Syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class checkBoxDemo {
    public static void main(String[] args) {
        //set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/msedgedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new EdgeDriver();
//       goto ebay.com
        driver.get("http://syntaxprojects.com/basic-checkbox-demo.php");
//       maximize
        driver.manage().window().maximize();

//      find the checkbox
        WebElement checkBox = driver.findElement(By.id("isAgeSelected"));
//      click it
        checkBox.click();

    }
}
