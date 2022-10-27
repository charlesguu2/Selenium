package com.Syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "Drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.facebook.com/");
//      enter username
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Abragiar");
    }
}
