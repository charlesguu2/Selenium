package com.Syntax.class12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class uploadFile {
    public static void main(String[] args) throws InterruptedException {
        //       set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.edge.driver", "Drivers/msedgedriver.exe");
//       create a WebDriver instance
        WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//       maximize
        driver.manage().window().maximize();

        driver.get("http://www.amazon.com/");
   }
}
