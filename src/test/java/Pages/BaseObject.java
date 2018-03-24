package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseObject {
    WebDriver driver;
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Tihon\\Desktop\\Новая папка\\CHROME\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
}
