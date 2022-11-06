package com.Syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Hw2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "Drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement categories = driver.findElement(By.xpath("//select[@id='gh-cat']"));
        Select selCategories = new Select(categories);

        List<WebElement> options = selCategories.getOptions();

        for(int i = 0; i < options.size();i++) {

            WebElement option = options.get(i);
            String text = option.getText();
            System.out.println(text);
        }
        selCategories.selectByVisibleText("Computers/Tablets & Networking");

        WebElement search = driver.findElement(By.xpath("//input[@value='Search']"));
        search.click();

        String title = driver.getTitle();
        System.out.println("The title is "+title);

        String confirmTitle = "Computers, Laptops, Tablets & Network Hardware for Sale - eBay";

        if(title.equalsIgnoreCase(confirmTitle)) {
            System.out.println("The title "+confirmTitle+" is verified");
        } else {
            System.out.println("The title "+confirmTitle+" is not verified");
        }






    }
}
