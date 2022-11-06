package reviewClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class dropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "Drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.facebook.com/");

//  find the button create acc and click on it
        WebElement createAccount = driver.findElement(By.xpath("//a[text()='Create new account']"));
        createAccount.click();

//      sleep for 3 seconds to wait for the window to open up
         Thread.sleep(3000);

//        Select the date from the down
//        approach to use the select class
//         1. Find the webElement that contains the select Tag
//         2.use Select class Select sel = new Select(WebElement)

//        1.Find the webElement that contains the select Tag

        WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
//         2.use Select class Select sel = new Select(WebElement)
        Select sel = new Select(day);

//      We have now three methods
//       1.Select by index
         sel.selectByIndex(4);
         Thread.sleep(2000);
         sel.selectByVisibleText("31");
         Thread.sleep(2000);
         sel.selectByValue("9");
//       ..........................

        //        1.find the WebElement
//        2. use the select class to intiate an instance
        //        1.find the WebElement
        WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
        //        2. use the select class to intiate an instance
        Select selectMonth= new Select(month);
//
        selectMonth.selectByVisibleText("Aug");

//        print all the available months in the console
//        traverse through the loop and print each WebElement
        List<WebElement> options = selectMonth.getOptions();
       for(int i = 0 ; i < options.size() ; i++) {

           String months = options.get(i).getText();
           System.out.println(months);
       }


    }
}
