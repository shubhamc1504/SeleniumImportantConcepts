package myseleniumpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); //path where chromedriver is present
        WebDriver driver = new ChromeDriver(); //Instantiating the chromedriver instance
        driver.get("https://the-internet.herokuapp.com/javascript_alerts"); // landing to webpage
        driver.manage().window().maximize(); // maximize the webpage
        //1. Alert window with OK button
        /*driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click(); // relative xpath for 1st button
        Thread.sleep(3000); // wait for 3 secs and throws interrupted exception as well if the popup is not coming
        driver.switchTo().alert().accept();*/ // to accept the alert which pops up on the webpage

        //2. Alert window with OK and Cancel button
        /*driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click(); // relative xpath for 2nd button
        Thread.sleep(3000);*/ //wait for 3 secs to select the popup option
        /*driver.switchTo().alert().accept();*/ // close alert by clicking on OK button
        /*driver.switchTo().alert().dismiss();*/ // close alert by clicking on Cancel button

        //3. Alert window with Input Box
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click(); // relative xpath for 3rd button
        Thread.sleep(3000); //wait for 3 secs to select the popup option
        Alert alertwindow= driver.switchTo().alert();
        System.out.println("Message displayed on alert:" +alertwindow.getText());
        alertwindow.sendKeys("Welcome to Selenium Automation"); // text on the popup text box
        alertwindow.accept();
    }
}
