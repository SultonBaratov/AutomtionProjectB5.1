package test.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLocatorsPractice {
    public static void main(String[] args) {

        // create driver object
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // navigate loopcamp practice page
        // https://loopcamp.vercel.app
        driver.get("https://loopcamp.vercel.app/registration_form.html");

        // First Name
        WebElement firstName = driver.findElement(By.name("firstname")); // locate the first name
        String firstname = "Loop";
        firstName.sendKeys(firstname); // send key firstName

        // Last name
        WebElement lastName = driver.findElement(By.name("lastname")); // locate the first name
        String lastname = "camp";
        lastName.sendKeys(lastname); // send key firstName

        // Username
        WebElement userName = driver.findElement(By.name("username"));
        String username = "loopcamper";
        userName.sendKeys(username);

        // Email
        WebElement email = driver.findElement(By.name("email"));
        String emaiL = "loopcamper@gmail.com";
        email.sendKeys(emaiL);

        // password
        WebElement passWord = driver.findElement(By.name("password"));
        String password = "loopcamperIsBest0001";
        passWord.sendKeys(password);

        // Phone Number
        WebElement phoneNumber = driver.findElement(By.name("phone"));
        String phonenumber = "870-918-8888";
        phoneNumber.sendKeys(phonenumber);

        // Gender
        WebElement female = driver.findElement(By.name("gender"));
        female.click();

        // Date of birth
        WebElement birthDay = driver.findElement(By.name("birthday"));
        String birthday = "12/18/1988";
        birthDay.sendKeys(birthday);

        // Department
        WebElement departmenT = driver.findElement(By.name("department"));
        String department = "Department of Engineering";
        departmenT.sendKeys(department);

        // Job Title
        WebElement JobTitle = driver.findElement(By.name("job_title"));
        String jobtitle = "QA";
        JobTitle.sendKeys(jobtitle);






    }
}
