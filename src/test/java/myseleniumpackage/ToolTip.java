package myseleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://jqueryui.com/tooltip/");
        driver.manage().window().maximize();
        driver.switchTo().frame(0); //only 1 frame is present
        WebElement inputbox=driver.findElement(By.xpath("//input[@id='age']"));
        String tooltiptext=inputbox.getAttribute("title");
        System.out.println(tooltiptext);

    }
}
