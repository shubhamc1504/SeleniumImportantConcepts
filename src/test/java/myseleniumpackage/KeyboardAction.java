package myseleniumpackage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/key_presses");

        Actions act=new Actions(driver); //Actions class with driver instance passed
        act.sendKeys(Keys.ENTER).perform();//performs ENTER action
        Thread.sleep(3000);
        act.sendKeys(Keys.BACK_SPACE).perform();
        Thread.sleep(3000);
        act.sendKeys(Keys.ESCAPE).perform();
        Thread.sleep(3000);
        act.sendKeys(Keys.SPACE).perform();
        Thread.sleep(3000);
    }
}
