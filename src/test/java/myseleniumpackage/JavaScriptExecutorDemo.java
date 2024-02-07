package myseleniumpackage;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class JavaScriptExecutorDemo {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        //Syntax of Javascript executor//
        //JavascriptExecutor js=(JavascriptExecutor) driver; //Type-casted as JSE(Instance) is another Interface inherited from RemoteWebDriver class whereas Web-driver is another Interface.
        //js.executeScript(Script, args); //Script and arguments are passed in the variable.

        //1. Drawing border and take screenshot
            /*WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
            JavascriptUtil.drawBorder(logo, driver); //Draw border

            TakesScreenshot ts=(TakesScreenshot) driver;
            File src=ts.getScreenshotAs(OutputType.FILE); //Takes screenshot
            File trg=new File(".\\Screenshots\\logoBorder.png");
            FileUtils.copyFile(src, trg);*/

        //2. Getting title of the page
            //String title=JavascriptUtil.getTitleByJS(driver);
            //System.out.println(title);

        //3. Click action
            //WebElement regLink= driver.findElement(By.linkText("Register"));
            //JavascriptUtil.clickElementByJS(regLink, driver);

        //4. Generate alert
            //JavascriptUtil.generateAlert(driver, "This is my ALert...");

        //5. Refreshing the page
            //JavascriptUtil.refreshBrowserByJS(driver);

        //6. Scrolling down the page
            //JavascriptUtil.scrollPageDown(driver);
            //Thread.sleep(2000);

        //7. Scroll up the page
            //JavascriptUtil.scrollPageUp(driver);

        //8. Zoom page
            //JavascriptUtil.zoomPageByJS(driver);

        //9. Flash
        WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        JavascriptUtil.flash(logo, driver);
    }
}
