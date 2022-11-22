package com.Syntax.reviewclass04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class webTable {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "Drivers/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%22");

        WebElement username = driver.findElement(By.xpath("//input[ @type ='text']"));
        username.sendKeys("admin");

        WebElement password= driver.findElement(By.xpath("//input[ @type ='password']"));
        password.sendKeys("Hum@nhrm123");

        WebElement button= driver.findElement(By.xpath("//input[@type='submit']"));
        button.click();

        WebElement pimButton= driver.findElement(By.xpath("//b[text()='PIM']"));
        pimButton.click();

        WebElement employeeList= driver.findElement(By.xpath("//a[text()='Employee List']"));
        employeeList.click();
        //      get particular id 44969A and check the checkBox

        List<WebElement> listofID=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));

//      traverse

        for(int i=1; i<listofID.size(); i++) {
            String id=listofID.get(i).getText();


            if(id.equalsIgnoreCase("44969A")) {
                System.out.println(i);
//              check the checkBox

                WebElement checkBox=driver.findElement(By.xpath("//table@id='resultTable']/tbody/tr[" + i + "]/td[1]"));
                checkBox.click();
            }
        }
    }
    }
