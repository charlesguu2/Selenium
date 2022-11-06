package reviewClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class RadioButtons {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "Drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
//        find the radio button


        List<WebElement> radioBtns = driver.findElements(By.xpath("//input[@name='ageGroup']"));

//       transverse through the list of webElements
        for(WebElement radioBtn:radioBtns){

//          find the desired radio button
          String option = radioBtn.getAttribute("value");

            if(option.equalsIgnoreCase("5 - 15")) {
//            click on the radio Btn
              radioBtn.click();
            }
        }

    }
}
