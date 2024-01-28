package myseleniumpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticatedPopup {
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.get("https://the-internet.herokuapp.com/basic_auth"); //URL of application
        driver.manage().window().maximize();

        //Syntax for providing user and password at the time of browser launch
        //https://admin:admin@the-internet.herokuapp.com/basic_auth
        //https://user:pass@URL
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
    }
}
