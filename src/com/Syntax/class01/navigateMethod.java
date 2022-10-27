package com.Syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class navigateMethod {
    public static void main(String[] args) throws InterruptedException {
//          go to google.com
//          got to fb.com
//          go back to google.com
        System.setProperty("webdriver.edge.driver", "Drivers/msedgedriver.exe");
//      create the Webdriver instance
        WebDriver driver = new EdgeDriver();
//       go to google.com
        driver.get("https://www.google.com/");
//      go to facebook.com
        driver.navigate().to("https://www.facebook.com/");


//    introduce some sleep which means wait
//     or pause for 2000 milliseconds (2 seconds)
        Thread.sleep(2000);
//     go back to google.com
        driver.navigate().back();

//       wait for 2 seconds
        Thread.sleep(2000);
//      go back to fb.com
        driver.navigate().forward();

//    wait for 2 se
      Thread.sleep(2000);
//    refresh the page
      driver.navigate().refresh();

    }
}
