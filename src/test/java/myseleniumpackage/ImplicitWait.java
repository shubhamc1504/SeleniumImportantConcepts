package myseleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWait {

    public static void main(String [] args)
    {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        //Implicit wait: Can add only once with the max time of 10 secs. Static time mentioned with increased chances of exception.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.name("q")).sendKeys("Selenium"); //Selenium passed in search box section
        driver.findElement(By.name("q")).sendKeys(Keys.RETURN); //Press ENTER Button

        driver.findElement(By.xpath("//a[normalize-space()='WebDriver']")).click(); // go to Webdriver
        driver.close(); // close the driver

    }
}
