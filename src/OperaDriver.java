import org.openqa.selenium.WebDriver;

public class OperaDriver {
    public static void main(String[] args) {
        System.setProperty("webdriver.opera.driver","C:\\Users\\Ayse\\Documents\\Selenium Dependencies\\drivers\\operadriver.exe");

        WebDriver driver=new org.openqa.selenium.opera.OperaDriver();

        driver.manage().window().maximize();



        driver.get("https://www.google.com/");
        driver.quit();
    }
}
