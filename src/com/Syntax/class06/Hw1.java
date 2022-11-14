package com.Syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hw1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "Drivers/msedgedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new EdgeDriver();
//        goto syntax project /dropDown demo
        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0);
        driver.switchTo().frame(0);

        WebElement checkbox = driver.findElement(By.xpath("//input[@id='a']"));
        checkbox.click();

        driver.switchTo().defaultContent();

        driver.switchTo().frame(1);

        WebElement animalsList = driver.findElement(By.xpath("//select[@id='animals']"));
        Select sel = new Select(animalsList);
        sel.selectByVisibleText("Baby Cat");

        driver.switchTo().defaultContent();

        driver.switchTo().frame(0);

        WebElement textBox = driver.findElement(By.xpath("//input"));
        textBox.sendKeys("DONE");

    }
}
