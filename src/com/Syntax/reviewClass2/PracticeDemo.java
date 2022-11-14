package com.Syntax.reviewClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class PracticeDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "Drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

//        When user sends in username Admin
        WebElement userName = driver.findElement(By.id("txtUsername"));
//         send the username
        userName.sendKeys("");

//          When user send in the wrong password
       WebElement pass = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        pass.sendKeys("abracfiure");

        WebElement btn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        btn.click();

//        Then verify the error "Invalid credentials"

//    get the error message from the DOM
        WebElement errorMSG = driver.findElement(By.xpath("//span[@id='spanMessage']"));
        String error = errorMSG.getText();

//         verification

        if(error.equalsIgnoreCase("Invalid credentials")) {
            System.out.println("The correct Error message is there ------> verified");
        } else {
            System.out.println("The correct Error message is not there");
        }
    }
}
