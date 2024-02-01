package myseleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //Instantiate the chromedriver
        driver.get("https://www.google.com/"); //URL
        driver.manage().window().maximize(); //maximize the web page
        driver.findElement(By.name("q")).sendKeys("Selenium"); //Selenium passed in search box section
        driver.findElement(By.name("q")).sendKeys(Keys.RETURN); //Press ENTER Button
        //Explicit wait: Element specific, use this for multiple web elements.
        By elelocator = By.xpath("//a[normalize-space()='WebDriver']");
        waitForElementPresent(driver, elelocator, 10).click(); //returning the webelement on which we click on
        driver.quit();
    }

    public static WebElement waitForElementPresent(WebDriver driver, By locator, int timeout) {
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        return driver.findElement(locator); //returning the web element
    }
}
