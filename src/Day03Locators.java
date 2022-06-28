import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Day03Locators {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ayse\\Documents\\Selenium Dependencies\\drivers\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
/*
        Create a class : LocatorsIntro 
Create main method and complete the following task. 
user goes to http://a.testaddressbook.com/sign_in 
Locate the elements of email textbox, password textbox, and signin button 
Enter below username and password then click sign in button 
Username :  testtechproed@gmail.com 
Password : Test1234!
Then verify that the expected user id  testtechproed@gmail.com (USE getText() method to get the text from the page) 
Verify the Addresses and Sign Out  texts are displayed  
Find the number of total link on the page 
Sign out from the page
         */
        driver.get("http://a.testaddressbook.com/sign_in");
        driver.manage().window().maximize();
        WebElement emailBox=driver.findElement(By.id("session_email"));
        emailBox.sendKeys("testtechproed@gmail.com");
        WebElement passwordTextBox=driver.findElement(By.name("session[password]"));
        passwordTextBox.sendKeys("Test1234!");
        Thread.sleep(1000);
        System.out.println(driver.findElement(By.name("commit")).getAttribute("value"));
        driver.findElement(By.name("commit")).click();
        String tech=driver.findElement(By.className("navbar-text")).getText();










    }
}
