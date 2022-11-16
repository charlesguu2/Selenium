package com.Syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
public class waitsDemo {
    public static void main(String[] args) {
        //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.edge.driver", "Drivers/msedgedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//      maximize window
        driver.manage().window().maximize();
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

//       click on button "change text to selenium webDriver"
        WebElement button1 = driver.findElement(By.xpath("//button[@id = 'populate-text']"));
        button1.click();

//         get the text of Selenium webDriver
        WebElement webDriverText = driver.findElement(By.xpath("//h2[text() = 'Selenium Webdriver']"));

//       print out the text on the screen
        System.out.println(webDriverText.getText());

//  Task2
//           click on the button "display button after 10 seconds"
        WebElement btn2 = driver.findElement(By.xpath("//button[@id = 'display-other-button']"));
        btn2.click();

//        as the button appears up after some time so in order to click it or get text from
//         it we need to define some explicit wait

        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id = 'hidden']")));

        WebElement visiblebtn = driver.findElement(By.xpath("//button[@id = 'hidden']"));
        visiblebtn.click();



    }
}
