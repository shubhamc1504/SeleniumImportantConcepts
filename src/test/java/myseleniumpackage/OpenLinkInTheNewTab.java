package myseleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenLinkInTheNewTab {
    public static void main(String [] args)
    {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        String tab= Keys.chord(Keys.CONTROL, Keys.RETURN); // Keys class where Control and Return/Enter key is stored in string tab variable.
        driver.findElement(By.linkText("Register")).sendKeys(tab); //Send keys method used where tab is passed

    }
}
