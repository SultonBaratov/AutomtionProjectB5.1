package test.day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Locale;

/*
 * Navigate to Google search
 * maximize the page
 * get title of the page
 * get url of the page
 * validate the title, expected title is "Google"
 * validate the url of the page, expected url is "https://www.google.com/"
 * close the browser
 */
public class GoogleSearch {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        //navigate
        driver.get("https://www.google.com/");
        //driver.navigate().to(driver.manage().window().maximize();
        driver.manage().window().maximize();

        String expectedTitle = "Google";

        //actula title
        String actualTitle =driver.getTitle(); // return String

        // Validation
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Actual title: " +actualTitle + ", matches expected title: " + expectedTitle +". => TEST PASS");
        } else {
            System.out.println("Actual title: " + actualTitle + ", Does not match expected title: " + expectedTitle + ". => TEST FAIL");
        }

        // expected URL
        String expectedURL = "https://www.google.com/";

        // actual URL
        String actualURL = "https://www.google.com/";



        if (actualURL.contains(expectedURL)){
            System.out.println("Actual url: " + actualURL + ", matches expected URL: " + expectedURL+ ". => TEST PASS");
        } else {
            System.out.println("Actual url: " + actualURL + ", DOES NOT matches expected URL: " + expectedURL+ ". => TEST FAIL");
        }
        //Thread.sleep(5000); // to delay quit
        driver.quit();



    }
}
