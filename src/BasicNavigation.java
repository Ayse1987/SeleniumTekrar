import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BasicNavigation {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ayse\\Documents\\Selenium Dependencies\\drivers\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.navigate().to("https://www.amazon.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.navigate().refresh();
        driver.navigate().back();
        driver.navigate().forward();

        driver.close();
    }
}
