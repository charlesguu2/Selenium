package com.Syntax.class12;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class jsExecutorScroll {
    public static void main(String[] args) throws InterruptedException {
        //       set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.edge.driver", "Drivers/msedgedriver.exe");
//       create a WebDriver instance
        WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//       maximize
        driver.manage().window().maximize();
//       goto amazon.com
        driver.get("http://www.amazon.com/");
//       scroll down
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(3000);
//        scroll down
        js.executeScript("window.scrollBy(0,-500)");


    }
}
