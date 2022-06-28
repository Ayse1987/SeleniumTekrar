import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.net.UrlChecker;

import java.net.URL;

public class Day02Review {
     /*
1.Create chrome driver. Maximize the window
2.Go to youtube and verify if page title is “youtube”, If not, print the correct title.
3.Verify if the page URL contains youtube if not, print the right url.
4.Then Navigate to https://www.amazon.com/
5.Navigate back to youtube
6.Refresh the page
7.Navigate forward to amazon
9.Then verify if page title includes “Amazon”, If not, print the correct title.
10.Verify if the page URL is https://www.amazon.com/, if not print the correct url
11.Quit the browser
*/
     public static void main(String[] args) {
         System.setProperty("webdriver.chrome.driver","C:\\Users\\Ayse\\Documents\\Selenium Dependencies\\drivers\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.google.com/");
         //2.Go to youtube and verify if page title is “youtube”, If not, print the correct title.
         String actualTitle=driver.getTitle();
         String expectedTitle="Google";
         if(expectedTitle.equals(actualTitle)){
             System.out.println("Pass");
         }else{
             System.out.println("Fail : Actual Title :"+actualTitle);

         }
         driver.navigate().to("https://www.amazon.com/");
         String actualUrl=driver.getCurrentUrl();
         String expectedUrl="amazon";
         if(actualUrl.contains(expectedUrl)){
             System.out.println("Pass");
         }else{
             System.out.println("Fail");
             System.out.println("Actual Url :"+ actualUrl);
         }
         driver.navigate().back();
         driver.navigate().refresh();
         driver.navigate().forward();
         //9.Then verify if page title includes “Amazon”, If not, print the correct title.
         String expectedTitle1="amazon";
         String actualTitle1= driver.getTitle();
         if(actualTitle1.contains(expectedTitle1)){
             System.out.println("Pass");
         }else{
             System.out.println("Fail");
             System.out.println("Actual Title :" +actualTitle1);
         }


         driver.close();




     }
}
