package com.Syntax.reviewClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class checkBoxes {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "Drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.ironspider.ca/forms/checkradio.htm");
//       find the checkBoxes
        List<WebElement> colors = driver.findElements(By.cssSelector("input[name='color']"));

//what does this list contain
//          it contains all the 6 webElements

        for(WebElement checkBox:colors) {

            String color = checkBox.getAttribute("value");

            if(color.equalsIgnoreCase("blue")) {
                checkBox.click();
            }
           }
        }


    }

