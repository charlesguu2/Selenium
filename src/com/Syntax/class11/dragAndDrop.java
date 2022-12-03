package com.Syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class dragAndDrop {
    public static void main(String[] args) {
        //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.edge.driver", "Drivers/msedgedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        maximize
        driver.manage().window().maximize();

        //        goto amazon.com

        driver.get("https://jqueryui.com/droppable/");

//        switch the focus to the iframe
                driver.switchTo().frame(0);

//        dragable
        WebElement dragableElement = driver.findElement(By.xpath("//div[@id='draggable']"));
//        drop location
        WebElement dropLocation = driver.findElement(By.xpath("//div[@id='droppable']"));

        Actions action= new Actions(driver);

//        action.dragAndDrop(dragableElement,dropLocation).perform();
          action.clickAndHold(dragableElement).moveToElement(dropLocation).release().build().perform();



    }

    }
