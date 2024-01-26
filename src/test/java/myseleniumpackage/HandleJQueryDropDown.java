package myseleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;


public class HandleJQueryDropDown {

    public static void main(String[] args)
    {

        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //Initiate the Chromedriver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //Implicitly waits for 10 secs
        driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/"); //Launching the URL
        driver.manage().window().maximize(); //Maximize the page
        driver.findElement(By.id("justAnInputBox")).click(); // ID Locator used to find the Multi selection option dropdown
        selectChoiceValues(driver,"choice 1"); //Single dropdown select
        //selectChoiceValues(driver,"choice 2", "choice 2 3", "choice 6", "choice 6 1", "choice 6 2 1", "choice 6 2"); //Multiple dropdown select
        //selectChoiceValues(driver,"all"); //all options select

    }

    public static void selectChoiceValues(WebDriver driver, String... value) //string... value can hold single and multiple parameters
    {
        List<WebElement> choiceList =driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']")); //All choices from dropdown

        if(!value[0].equalsIgnoreCase("all")) //If all the options are not selected
        {
            for(WebElement item:choiceList) //Reading each item from the choice list.
            {
                String text=item.getText();//capturing the text value from the variable // comparing the text with the expected list of items

                for(String val: value)
                {
                    if(text.equals(val)) //Compares val with text
                    {
                        item.click();
                        break;
                    }
                }
            }
        }
        else
        {
           for(WebElement item:choiceList) //Reading each choice list from item variable
           {
                item.click();
           }
        }
    }
}
