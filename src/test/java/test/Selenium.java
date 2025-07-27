package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
    public static void main(String[] args) throws InterruptedException {
        // Setting up the driver

        //ChromeDriver options = new ChromeDriver();
        WebDriver driver = new ChromeDriver();

        // maximize the window
        driver.manage().window().maximize();

        // just wait
        Thread.sleep(3000);

        // navigate the page
        driver.get("https://www.loopcamp.io");

        // just wait
        Thread.sleep(3000);

        // navigate to the page
        driver.navigate().to("https://www.google.com");

        // just wait
        Thread.sleep(3000);

        // navigate back to page
        driver.navigate().back();

        // just wait
        Thread.sleep(3000);

        // navigate forward
        driver.navigate().forward();

        // Refresh
        driver.navigate().refresh();

        //quiting the browser
        driver.quit();



    }
}
