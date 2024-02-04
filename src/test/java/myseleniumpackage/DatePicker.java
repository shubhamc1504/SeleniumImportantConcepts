package myseleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class DatePicker {
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='dob']")).click();

        //Month and Year selection:-

        Select month_drp= new Select(driver.findElement(By.cssSelector("select[aria-label='Select month']")));
        month_drp.selectByVisibleText("Apr");
        Select year_drp=new Select(driver.findElement(By.xpath("//select[@aria-label='Select year']")));
        year_drp.selectByVisibleText("1998");

        String date="15"; //Date to be selected

        //Date selection:-

        List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));

        for(WebElement ele:allDates) //For each loop
        {
            String dt=ele.getText(); //Return the string with
            if (dt.equals(date))
            {
                ele.click();
                break;
            }
        }
        driver.quit();
    }
}
