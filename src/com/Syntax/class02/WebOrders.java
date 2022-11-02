package com.Syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class WebOrders {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "Drivers/msedgedriver.exe");
        org.openqa.selenium.WebDriver driver = new EdgeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.manage().window().maximize();
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        driver.findElement(By.className("button")).click();

//        Make sure title is correct  i. e Web Orders

//       get the title of the page
        String title = driver.getTitle();

        if(title.equalsIgnoreCase("Web Orders")) {
            System.out.println("The title is correct :"+title);
        }else {
            System.out.println("The title is incorrect :"+title);
        }

    }
}
