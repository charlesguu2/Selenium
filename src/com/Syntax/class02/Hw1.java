package com.Syntax.class02;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Hw1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "Drivers/msedgedriver.exe");
        org.openqa.selenium.WebDriver driver = new EdgeDriver();
        driver.get(" https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Charles");
        driver.findElement(By.id("customer.lastName")).sendKeys("Guevara");
        driver.findElement(By.id("customer.address.street")).sendKeys("6039 GlenBerry Ave.");
        driver.findElement(By.id("customer.address.city")).sendKeys("Talls Hall");
        driver.findElement(By.id("customer.address.state")).sendKeys("Virginia");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("23091");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("5813828091");
        driver.findElement(By.id("customer.ssn")).sendKeys("091-981-2381");
        driver.findElement(By.id("customer.username")).sendKeys("CharlesG123");
        driver.findElement(By.id("customer.password")).sendKeys("Barcelona123-");
        driver.findElement(By.id("repeatedPassword")).sendKeys("Barcelona123-");
        driver.findElement(By.className("button")).click();
        driver.quit();





    }
}
