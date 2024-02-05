package myseleniumpackage;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class CaptureScreenshots {
    public static void main(String [] args) throws IOException
    {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        //Full page screenshot
        /*TakesScreenshot ts= (TakesScreenshot) driver; //TakesScreenshot is an Interface (type-casted) where driver is assigned tp variable ts
        File src=ts.getScreenshotAs(OutputType.FILE); //Return a file Instance where screenshot is stored in src variable
        File trg=new File(".\\Screenshots\\nopcommercehomepage.png"); //Store the file in destination path
        FileUtils.copyFile(src, trg);*/ //copy the source into the target directory

        //Screenshot of a section or portion of the page

        /*WebElement section =driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
        File src=section.getScreenshotAs(OutputType.FILE); //Return a file Instance where screenshot is stored in src variable
        File trg=new File(".\\Screenshots\\featuredproducts.png"); //Store the file in destination path
        FileUtils.copyFile(src, trg);*/

        //Screenshot of a specific web-element

        WebElement logo =driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        File src=logo.getScreenshotAs(OutputType.FILE); //Return a file Instance where screenshot is stored in src variable
        File trg=new File(".\\Screenshots\\logo.png"); //Store the file in destination path
        FileUtils.copyFile(src, trg);
        driver.close();
    }
}
