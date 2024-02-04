package myseleniumpackage;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MouseDragAndDropAction {
    public static void main(String [] args)
    {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        //Capture source(rome) and target(italy) directory
        WebElement rome=driver.findElement(By.id("box6"));
        WebElement italy=driver.findElement(By.id("box106"));
        //Actions class for Drag and Drop functionality
        Actions act=new Actions(driver);
        act.dragAndDrop(rome, italy).perform(); //drag and drop operation will be performed
    }
}
