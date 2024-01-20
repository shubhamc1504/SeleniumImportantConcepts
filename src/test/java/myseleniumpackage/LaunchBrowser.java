package myseleniumpackage;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {
    public static void main(String[] args){
        //Chrome browser
        /*System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //ChromeDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");*/

        //Firefox browser
        //System.setProperty("webdriver.gecko.driver", "C:\\webdrivers\\geckodriver-v0.34.0-win64\\geckodriver.exe");
        //WebDriver driver = new FirefoxDriver(); //FirefoxDriver driver = new FirefoxDriver();
        //driver.get("https://demo.nopcommerce.com/");*/

        //Edge browser
        System.setProperty("webdriver.edge.driver", "C:\\webdrivers\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver(); //EdgeDriver driver = new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");
        System.out.println("Title of the webpage is:"+driver.getTitle());
        System.out.println("URL of the webpage is:"+driver.getCurrentUrl());
    }
}
