package com.Syntax.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;

public class Hw2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "Drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Jessie");
        driver.findElement(By.name("lastname")).sendKeys("White");
        driver.findElement(By.name("reg_email__")).sendKeys("jessieWhite230@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("jessieWhite230@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("Strawberryandcola90");
        driver.findElement(By.name("birthday_month")).sendKeys("September");
        driver.findElement(By.name("birthday_day")).sendKeys("24");
        driver.findElement(By.name("birthday_year")).sendKeys("2000");
        driver.findElement(By.name("sex")).click();
        driver.findElement(By.linkText("Sign Up")).click();





    }
}
