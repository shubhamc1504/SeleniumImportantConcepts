package myseleniumpackage;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class HandlingCookies {
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        //1. How to capture cookies from the browser
        Set<Cookie> cookies=driver.manage().getCookies();
        System.out.println("Size of cookies:"+cookies.size()); //3

        //2. How to print cookies from browser?
        for(Cookie cookie:cookies) //storing each cookies into cookie variable
        {
            System.out.println(cookie.getName()+" : " +cookie.getValue()); //get each name and value of cookie
        }

        //3. How to add cookie to the browser?
        Cookie cookieobj= new Cookie("ShubhamCookie", "shubham1504");
        driver.manage().addCookie(cookieobj);
        cookies =driver.manage().getCookies();
        System.out.println("Size of cookies after adding:"+cookies.size()); //4

        //4. How to delete specific cookie from the browser?
        //driver.manage().deleteCookie(cookieobj); // to delete specific cookie
        //driver.manage().deleteCookieNamed("ShubhamCookie");
        driver.manage().deleteAllCookies(); // to delete all cookies
        cookies =driver.manage().getCookies();
        System.out.println("Size of cookies after deletion:"+cookies.size()); //0
        driver.quit();
    }
}
