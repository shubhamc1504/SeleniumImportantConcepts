package myseleniumpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //ChromeDriver driver = new ChromeDriver();

        driver.get("https://snapdeal.com/");  //Opens Snapdeal homepage and waits till page load
        driver.get("https://www.amazon.com/"); //Opens Amazon homepage and waits till page load
        /*driver.navigate().to("https://www.amazon.com/");*/ // Opens Amazon homepage and does not wait till page load. Uses browser cookies to navigate back or forward.

        driver.navigate().back(); // brings it back to snapdeal homepage
        driver.navigate().forward(); //again back to amazon homepage

        driver.navigate().refresh(); //refreshes or reload the current webpage


    }
}
