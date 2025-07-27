package test.day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
  navigate to amazon
  maximize
  navigate back
  navigate forward
  refresh
   */
public class NavigateToAmazon {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        // maximize the window
        driver.manage().window().maximize();
        // just wait
        Thread.sleep(3000);
        // navigate the page
        driver.get("https://www.amazon.com/");
        // maximize the window
        driver.manage().window().maximize();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }

}
