package myseleniumpackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavascriptUtil {
    //1. Drawing border and take screenshot
    public static void drawBorder(WebElement element, WebDriver driver)
    {
        JavascriptExecutor js= ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].style.border='3px solid red'", element);
    }
    //2. Getting title of the page
    public static String getTitleByJS(WebDriver driver)
    {
        JavascriptExecutor js= ((JavascriptExecutor) driver);
        String title=js.executeScript("return document.title;").toString();
        return title;
    }
    //3. Click action
    public static void clickElementByJS(WebElement element, WebDriver driver)
    {
        JavascriptExecutor js= ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].click;" , element);
    }
    //4. Generate alert
    public static void generateAlert(WebDriver driver, String message)
    {
        JavascriptExecutor js= ((JavascriptExecutor) driver);
        js.executeScript("alert('" + message + "')");
    }
    //5. Refreshing the page
    public static void refreshBrowserByJS(WebDriver driver)
    {
        JavascriptExecutor js= ((JavascriptExecutor) driver);
        js.executeScript("history.go(0)");
    }
    //6. Scrolling down the page
    public static void scrollPageDown(WebDriver driver)
    {
        JavascriptExecutor js= ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }
    //7. Scroll up the page
    public static void  scrollPageUp(WebDriver driver)
    {
        JavascriptExecutor js= ((JavascriptExecutor) driver);
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
    }
    //8. Zoom page
    public static void zoomPageByJS(WebDriver driver)
    {
        JavascriptExecutor js= ((JavascriptExecutor) driver);
        js.executeScript("document.body.style.zoom= '50%'"); //zoom out by 100%
    }
    //9. Flash
    public static void flash(WebElement element, WebDriver driver)
    {
        JavascriptExecutor js= ((JavascriptExecutor) driver);
        String bgcolor= element.getCssValue("backgroundColor");

        for (int i=0; i<50; i++)
        {
            changeColor("#000000", element, driver); //1
            changeColor(bgcolor, element, driver); //2
        }
    }
    private static void changeColor(String color, WebElement element, WebDriver driver)
    {
        JavascriptExecutor js= ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);
        try
        {
            Thread.sleep(100);
        }
        catch (InterruptedException e)
        {

        }
    }
}
