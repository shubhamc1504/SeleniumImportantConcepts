package myseleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionMultipleKeys {
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://text-compare.com/");
        driver.manage().window().maximize();
        WebElement input1 =driver.findElement(By.xpath("//textarea[@id='inputText1']"));
        WebElement input2 =driver.findElement(By.xpath("//textarea[@id='inputText2']"));

        input1.sendKeys("Welcome to Selenium!!");

        Actions act=new Actions(driver);
        //Ctrl+A (select all)s
        act.keyDown(Keys.CONTROL); //pressing control key
        act.sendKeys("a"); //value is selected
        act.keyUp(Keys.CONTROL); //un-pressing the control key
        act.perform();

        //Ctrl+C (copy)
        act.keyDown(Keys.CONTROL); //pressing control key
        act.sendKeys("c"); //value is selected
        act.keyUp(Keys.CONTROL); //un-pressing the control key
        act.perform();

        //Tab - Shift to input2 box
        act.sendKeys(Keys.TAB);
        act.perform(); //shifted from input 1 to 2

        //Ctrl+V (paste)
        act.keyDown(Keys.CONTROL); //pressing control key
        act.sendKeys("v"); //value is selected
        act.keyUp(Keys.CONTROL); //un-pressing the control key
        act.perform();

        //compare text
        if(input1.getAttribute("value").equals(input2.getAttribute("value")))
        {
            System.out.println("Text is copied!!");
        }
        else
        {
            System.out.println("Text not copied!!");
        }
    }
}
