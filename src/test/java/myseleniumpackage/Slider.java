package myseleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
        driver.manage().window().maximize();

        WebElement min_slider =driver.findElement(By.xpath("//span[1]")); //left slider
        System.out.println("Location of minimum slider is:"+min_slider.getLocation()); //(59, 250)
        System.out.println("Height and Width of the element is:"+min_slider.getSize()); //(21, 21)

        Actions act=new Actions(driver);
        act.dragAndDropBy(min_slider, 100, 0).perform();
        System.out.println("Location of minimum slider is:"+min_slider.getLocation()); //(158, 250)
        System.out.println("Height and Width of the element is:"+min_slider.getSize()); //(21, 21)

        WebElement max_slider =driver.findElement(By.xpath("//span[2]")); //right slider
        act.dragAndDropBy(max_slider, -100, 0).perform();
        System.out.println("Location of maximum slider is:"+max_slider.getLocation()); //(512, 250)
        System.out.println("Height and Width of the element is:"+max_slider.getSize()); //(21, 21)
    }
}
