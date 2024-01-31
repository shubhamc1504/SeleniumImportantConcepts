package myseleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InnerIFrame {
    public static void main(String [] args)
    {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Frames.html");
        driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();
        WebElement outerframe= driver.findElement(By.xpath("//*[@id='Multiple']/iframe"));
        driver.switchTo().frame(outerframe); //Passing frame as the web element

        WebElement innerframe= driver.findElement(By.xpath("//html/body/section/div/div/iframe"));
        driver.switchTo().frame(innerframe); //Switch to Inner frame

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Welcome to Automation");

    }
}
