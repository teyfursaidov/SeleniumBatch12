package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe"); // for windows add extension .exe
        WebDriver driver=new ChromeDriver(); // launches the browser
        driver.get("https://www.google.com/"); // navigates to the specific URL
        String url=driver.getCurrentUrl();
        System.out.println(url);
        driver.getTitle();
        String title= driver.getTitle();
        System.out.println(title);
        driver.quit(); // closes/quits the browser

    }
}
