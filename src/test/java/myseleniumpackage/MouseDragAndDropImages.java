package myseleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MouseDragAndDropImages {
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
        driver.manage().window().maximize();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"))); //switch to frame

        //Source 1st image store in item1
        WebElement item1 =driver.findElement(By.xpath("//li[1]"));

        //Source 2nd image store in item2
        WebElement item2 =driver.findElement(By.xpath("//li[2]"));

        WebElement target=driver.findElement(By.xpath("//div[@id='trash']"));

        //Actions class for Drag and Drop image to trash functionality
        Actions act=new Actions(driver);

        //Move both the items into trash
        act.dragAndDrop(item1, target).perform();
        act.dragAndDrop(item2, target).perform();

    }
}
