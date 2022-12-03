package com.Syntax.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.concurrent.TimeUnit;

public class CommonMethods {
    public static WebDriver driver;
    public static void openWithSpecificUrl(String url) {
        System.setProperty("webdriver.edge.driver", "Drivers/msedgedriver.exe");

        driver = new EdgeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public static void tearDown() {
        driver.quit();
    }

}
