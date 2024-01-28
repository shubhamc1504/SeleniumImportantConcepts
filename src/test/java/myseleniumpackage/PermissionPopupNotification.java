package myseleniumpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PermissionPopupNotification {
    public static void main(String[] args)
    {
        ChromeOptions options = new ChromeOptions(); //Class used
        options.addArguments("--disable-notifications"); //disable the popup notifications

        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.redbus.in/");
        driver.manage().window().maximize();
    }
}
