package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookElementsDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://fb.com");
        driver.findElement(By.id("email")).sendKeys("testlogin@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("1224323");

    }
}
