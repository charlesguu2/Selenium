package com.Syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class keysUsage {
    public static void main(String[] args) {
//       set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.edge.driver", "Drivers/msedgedriver.exe");
//       create a WebDriver instance
        WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//       maximize
        driver.manage().window().maximize();
//       goto amazon.com
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
//        username Text box
        WebElement userName = driver.findElement(By.xpath("//input[@name='ctl100$MainContent$username']"));
        userName.sendKeys("Tester", Keys.TAB);
//       password field
        WebElement password = driver.findElement(By.xpath("//input[@name='ctl100$MainContent$password']"));
        password.sendKeys("test", Keys.ENTER);



    }
}
