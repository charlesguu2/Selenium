package com.Syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Hw1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "Drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        WebElement newAcc = driver.findElement(By.xpath("//a[text()='Create new account']"));
        newAcc.click();
        Thread.sleep(2000);
        WebElement name = driver.findElement(By.name("firstname"));
        name.sendKeys("Jane");
        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Hartwell");
        WebElement phonenum = driver.findElement(By.xpath("//input[@name = 'reg_email__']"));
        phonenum.sendKeys("5712899020");
        WebElement pass = driver.findElement(By.xpath("//input[@name = 'reg_passwd__']"));
        pass.sendKeys("Soccerstar29018");
        WebElement table = driver.findElement(By.cssSelector("select[name = 'birthday_month']"));

        Select selectMon = new Select(table);
        selectMon.selectByIndex(4);


        WebElement table1 = driver.findElement(By.cssSelector("select[name = 'birthday_day']"));

        Select selectDay = new Select(table1);
        selectDay.selectByIndex(4);

        WebElement table2 = driver.findElement(By.cssSelector("select[name = 'birthday_year']"));

        Select selcectYear = new Select(table2);
        selcectYear.selectByVisibleText("2003");

        WebElement male = driver.findElement(By.xpath("//input[@value='2']"));
        male.click();
        driver.quit();















    }
}


