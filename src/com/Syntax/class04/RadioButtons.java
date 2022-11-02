package com.Syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class RadioButtons {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "Drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
//        goto syntaxProject.com radio button
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");

        driver.manage().window().fullscreen();

//        get the radio button Male
         WebElement maleRadioBtn = driver.findElement(By.xpath("//input[@name='optradio' and @value='Male']"));
//        check if the radio btn is displayed
        boolean displayStatus = maleRadioBtn.isDisplayed();
//        print the display status
        System.out.println("The radio button is Displayed :"+displayStatus);

//        check wether the radio button male is enabled
        boolean enableStatus = maleRadioBtn.isSelected();
        System.out.println("The radio button is selcted :"+enableStatus);

//      check weather the radio button male is selcted
        boolean selectStatus = maleRadioBtn.isSelected();
        System.out.println("The radio button is selected :"+selectStatus);

//check if the radio button male is not selected then click on it
        if(!selectStatus){
//           perform a click operation on the radio button
            maleRadioBtn.click();        }
       selectStatus=maleRadioBtn.isSelected();
       System.out.println("The radio button is selected :"+selectStatus);

    }
}
