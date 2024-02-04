package myseleniumpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
public class MouseDoubleClickAction {
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
        driver.manage().window().maximize();
        driver.switchTo().frame("iframeResult");
        WebElement field1=driver.findElement(By.xpath("//input[@id='field1']"));
        field1.clear();
        field1.sendKeys("Welcome to Selenium: Shubham");

        WebElement button= driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
        //Actions Class created for double click functionality
        Actions act= new Actions(driver);
        act.doubleClick(button).perform(); //Internally calls build and performs the double click action
    }
}
