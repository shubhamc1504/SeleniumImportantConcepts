package myseleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
1. How many rows in the table
2. How many columns in the table
3. Retrieve specific row/column in the table
4. Retrieve all the data from the table
 */
public class WebTable {
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
        driver.manage().window().maximize();

        //1
        int rows=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
        System.out.println("No of rows in a table:"+rows); //7

        //2
        int cols=driver.findElements(By.xpath("//table[@id='customers']//tbody/tr/th")).size();
        System.out.println("No of columns in a table:"+cols); //3

        //3
        String value=driver.findElement(By.xpath("//table[@id='customers']//tr[4]/td[1]")).getText();
        System.out.println("The value is:"+value); //Microsoft

        //4
        System.out.println("Data from the table: -------------");
        for(int r=2;r<=rows;r++) //as 1st row denotes heading
        {
            for(int c=1;c<=cols;c++) //columns internal for loop
            {
                String data=driver.findElement(By.xpath("//table[@id='customers']//tr["+r+"]/td["+c+"]")).getText();
                System.out.print(data+"   ");
            }
            System.out.println();
        }
        driver.quit();
    }
}
