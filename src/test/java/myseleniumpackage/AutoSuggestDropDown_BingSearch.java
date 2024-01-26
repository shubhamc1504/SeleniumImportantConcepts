package myseleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class AutoSuggestDropDown_BingSearch {

    public static void main(String [] args)
    {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //wait for list to populate
        driver.get("https://www.bing.com/"); //URL of website
        driver.manage().window().maximize(); //maximize the webpage
        driver.findElement(By.id("sb_form_q")).sendKeys("selenium"); // send keys to search tab
        List<WebElement> list=driver.findElements(By.xpath("//li[@class='sa_sg']//span")); //hover over the lists and store them in list.
        System.out.println("Size of Autosuggestions is:"+list.size()); //print the autosuggestions count
        for(WebElement listitem:list)
        {
           if(listitem.getText().contains("webdriver")) // compares the presence of webdriver within the list
           {
               listitem.click(); // clicks on selenium webdriver
               break; //comes out of the loop
           }
        }
    }
}
