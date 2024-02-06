package myseleniumpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenURLsIn2Tabs {
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        //driver.switchTo().newWindow(WindowType.TAB); //Open URL in new tab
        driver.switchTo().newWindow(WindowType.WINDOW); //Open URL in new Window
        driver.get("https://demo.opencart.com/");
    }
}
