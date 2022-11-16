package com.Syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class tableBasic {
    public static void main(String[] args) {
        //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.edge.driver", "Drivers/msedgedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new EdgeDriver();
//      maximize window
        driver.manage().window().maximize();
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");

        //        print the whole table on the console

        WebElement allTable = driver.findElement(By.xpath("//table[@id='customers']"));
        String textAllTable = allTable.getText();
        System.out.println(textAllTable);

        //        print all the rows of the table
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
        for (WebElement row : rows) {
            String rowText = row.getText();
//            System.out.println(rowText);
//            System.out.println("-----------------");
//             modified task : print only the row which has company google
            if (rowText.contains("Google")) {
                System.out.println(rowText);
            }


            //        print all the individual columns of the table
            List<WebElement> columns = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
            for (WebElement column : columns) {
                String columntext = column.getText();
                System.out.println(columntext);
                System.out.println("-----------------");
            }

        }
    }
}
