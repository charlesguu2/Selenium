package com.Syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class checkBoxDemo2 {
    public static void main(String[] args) {
        //set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("http://syntaxprojects.com/basic-checkbox-demo.php");
        driver.manage().window().fullscreen();

//       find all checkboxes
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));

//      traverse through list of checkboxes to find desired one
        for(WebElement checkBox:checkBoxes){
//       get the attribute value to check if this is the right option to select
           String optionName = checkBox.getAttribute("value");
//       if condition to make sure it is in the right checkbox
        if(optionName.equalsIgnoreCase("Option-2")) {
//       if passed click on it
         checkBox.click();

        }

        }

    }
}
