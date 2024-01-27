package myseleniumpackage;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleLinks {
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        //1. Locate Links in Selenium Webdriver
        //driver.findElement(By.linkText("Today's Deals")).click();
        //driver.findElement(By.partialLinkText("Deals")).click();
        //2. Capture all the links from webpage
        List<WebElement> links=driver.findElements(By.tagName("a"));
        //System.out.println("Number of links present in webpage:"+links.size());

        //2.1 Normal For loop
        /*for(int i=0;i<=links.size();i++)
        {
            System.out.println(links.get(i).getText());
            System.out.println(links.get(i).getAttribute("href"));

        }*/
        //2.2 For each loop
        for(WebElement link:links)
        {
            System.out.println(link.getText());
            System.out.println(link.getAttribute("href"));
        }
    }
}
