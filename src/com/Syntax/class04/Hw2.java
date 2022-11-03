package com.Syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Hw2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "Drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D");
        WebElement username = driver.findElement(By.cssSelector("input[name=txtUsername]"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.cssSelector("input[name=txtPassword]"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginButton = driver.findElement(By.cssSelector("input.button"));
        loginButton.click();
        WebElement wrongpassword = driver.findElement(By.cssSelector("span[id=spanMessage]"));
        boolean displayStatus = wrongpassword.isDisplayed();

        if(displayStatus) {
            System.out.println(" Password cannot be empty is displayed : "+ displayStatus);
        }
    }
}
