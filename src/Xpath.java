import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Xpath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ayse\\Documents\\Selenium Dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://google.com/");


        WebElement agree= driver.findElement(By.xpath("(//div[@class='jyfHyd'])[2]"));
        agree.click();
        Thread.sleep(1000);

        WebElement searchBox=driver.findElement(By.name("q"));

        searchBox.sendKeys("porselain teapot set"+ Keys.ENTER);
        Thread.sleep(1000);

//        WebElement search= driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
//        search.click();

        WebElement foundItems= driver.findElement(By.xpath("//div[@id='result-stats']"));
        System.out.println("Teapot result on google "+foundItems.getText().substring(6,17));


    }
}
