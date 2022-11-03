package com.Syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class multipleSelectDropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "Drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        driver.manage().window().fullscreen();

//        find the WebElement that contains the select class
        WebElement DD = driver.findElement(By.xpath("//select[@id='multi-select']"));

//        using select class
        Select sel=new Select(DD);

//        By index
        sel.selectByIndex(3);
//        by visible text
        sel.selectByVisibleText("Texas");

        Thread.sleep(3000);
//         deselect by index
        sel.deselectByIndex(3);

//       write down the code to select all the options in the drop down
        List<WebElement> options = sel.getOptions();
        for(int i = 0; i < options.size(); i++) {

            sel.selectByIndex(i);

        }

        Thread.sleep(3000);
        sel.deselectAll();


//        how can you check if the drop down is multi select or not using selenium
        boolean multiselect = sel.isMultiple();
        System.out.println(multiselect);




    }
}
