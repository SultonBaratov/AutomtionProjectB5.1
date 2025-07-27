package test.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locators {
    public static void main(String[] args) throws InterruptedException {

        // create an option to avoid google capture
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-blink-features=AutomationControlled");

        // create the object
        WebDriver driver = new ChromeDriver(options);

        // navigate to google page
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        // locate the element
        WebElement searchBoxWithID = driver.findElement(By.id("APjFqb"));

        // get
        String textToSearch = "Feyruz is the king of JAVA";

        // just wait
        Thread.sleep(3000);

        // send the text to the input
        searchBoxWithID.sendKeys(textToSearch);

        // clear the box
        searchBoxWithID.clear();

        // click enter
        searchBoxWithID.sendKeys("Nadir is smart"+Keys.ENTER);

        Thread.sleep(3000);

        driver.navigate().back();

        WebElement searchBoxWithName = driver.findElement(By.name("q"));
        searchBoxWithName.sendKeys(textToSearch + Keys.ENTER);

        //navigate back again
        driver.navigate().back();

        // click about with using linkText
        WebElement aboutLink = driver.findElement(By.linkText("About"));

        // click that link
        aboutLink.click();







    }
}
