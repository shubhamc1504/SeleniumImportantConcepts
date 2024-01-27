package myseleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.URL;
import java.net.HttpURLConnection;
import java.util.List;

public class HandleBrokenLinks {
    public static void main(String[] args) throws IOException
    {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver= new ChromeDriver(); //Chromedriver is initialized
        driver.get("http://www.deadlinkcity.com/"); //URL of the webpage
        List< WebElement> links=driver.findElements(By.tagName("a")); //stores all the links under variable links.

        int brokenLinks=0; //Initialized value to 0
        for(WebElement element:links)
        {
            String url= element.getAttribute("href"); // storing the links on url variable.

            if(url==null || url.isEmpty()) //comparing the link
            {
                System.out.println("url is empty"); //prints if url is empty and continue for each link
                continue;
            }

            URL link = new URL(url); //url variable is converted from string to URL format.

            try
            {
                HttpURLConnection httpconn= (HttpURLConnection) link.openConnection(); //HttpURLConnection Class is instantiated or established
                httpconn.connect(); //to connect with the url
                if(httpconn.getResponseCode()>=400) //code for greater than or equal to 400 message code
                {
                    System.out.println("Message Code:"+httpconn.getResponseCode()+" URL:"+url+" is"+" Broken Link"); //Prints the url as a broken link
                    brokenLinks++; // increase the count of broken links.
                }
                else //code for less than 400 message code
                {
                    System.out.println("Message Code:"+httpconn.getResponseCode()+" URL:"+url+" is"+" Valid Link"); //Prints the url as a valid link
                }
            }
            catch(Exception e)
            {

            }
        }
        System.out.println("No of Broken links:"+brokenLinks); //prints the count of broken links on the webpage
        driver.quit(); //close the page
    }
}
