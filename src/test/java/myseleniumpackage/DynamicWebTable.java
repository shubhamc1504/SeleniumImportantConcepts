package myseleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class DynamicWebTable {
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();

        options.addArguments("start-maximized");

        options.addArguments("disable-infobars");

        options.addArguments("--disable-extensions");
        WebDriver driver= new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.opencart.com/admin/index.php");
        driver.manage().window().maximize();

        //Login
        WebElement username=driver.findElement(By.id("input-username"));
        username.clear();
        username.sendKeys("demo");
        WebElement password= driver.findElement(By.id("input-password"));
        password.clear();
        password.sendKeys("demo");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        //Sales--Orders
        driver.findElement(By.xpath("//a[normalize-space()='Sales']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Orders']")).click();

        //Table
        //1) Find the total no of pages in the table
        String text=driver.findElement(By.xpath("(//div[@class='col-sm-6 text-end'])[1]")).getText();
        System.out.println("Text:"+text);
    }
}
