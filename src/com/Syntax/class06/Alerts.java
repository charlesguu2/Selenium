package com.Syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "Drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");

        WebElement clickMe = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        clickMe.click();
        Thread.sleep(2000);
//      Handling the alert
        Alert simpleAlert1 = driver.switchTo().alert();
        simpleAlert1.accept();

//       find the button for confirmation alert and click on it
        WebElement confirmationAlert = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        confirmationAlert.click();
        Thread.sleep(2000);

        Alert simpleAlert2 = driver.switchTo().alert();
        simpleAlert2.dismiss();
//      find the prompt alert and send some text then accept it

        WebElement thirdBox = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        thirdBox.click();

        Alert simpleAlert3 = driver.switchTo().alert();
        simpleAlert3.sendKeys("abracadabrea");
        simpleAlert3.accept();

    }
}
