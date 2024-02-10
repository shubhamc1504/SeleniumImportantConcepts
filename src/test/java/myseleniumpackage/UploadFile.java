package myseleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class UploadFile {
    public static void main(String[] args) throws AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.foundit.in/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn__text']")).click();
        //1. Using send keys

        /*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn__text']")));
        element.sendKeys("C:\\Users\\dell\\OneDrive\\Desktop\\Personal Docs\\Resume\\Shubham Choudhury Resume.pdf");*/

        //2. Using Robot Class
        WebElement button=driver.findElement(By.xpath("//input[@id='file-upload']"));
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();" , button); //click action on button

        /*
        1. Copy the path
        2. Cntrl+V
        3. Enter
         */

        Robot rb =new Robot();
        rb.delay(3000);
        //Copy the file into clipboard
        StringSelection ss =new StringSelection("C:\\Users\\dell\\OneDrive\\Desktop\\Personal Docs\\Resume\\Shubham Choudhury Resume.pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

        //Paste the same in file name text box Control+V
        rb.keyPress(KeyEvent.VK_CONTROL); //Press on control key on keyboard
        rb.keyPress(KeyEvent.VK_V); // Press on V Key

        //Release the key and click on Enter key
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);

        rb.keyPress(KeyEvent.VK_ENTER); //press the enter key
        rb.keyRelease(KeyEvent.VK_ENTER); //release the enter key
    }
}
