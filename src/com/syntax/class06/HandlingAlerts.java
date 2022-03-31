package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

    public static String url = "http://www.uitestpractice.com/Students/Switchto";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement simpleAlertButton=driver.findElement(By.id("alert"));
        Thread.sleep(1000);
        driver.manage().window().maximize();
        simpleAlertButton.click();

        Alert simpleAlert = driver.switchTo().alert();
        // switch the focus to alert
        Thread.sleep(2000);
        simpleAlert.accept();

        WebElement confirmAlertButton=driver.findElement(By.id("confirm"));
        Thread.sleep(1000);
        driver.manage().window().maximize();
        confirmAlertButton.click();

        Alert confirmAlert=driver.switchTo().alert();
        Thread.sleep(1000);
        String alertText=confirmAlert.getText();
        System.out.println(alertText);
        confirmAlert.dismiss();

        WebElement promptAlertButton=driver.findElement(By.cssSelector("button#prompt"));
        promptAlertButton.click();
        Thread.sleep(2000);
        Alert promptAlert=driver.switchTo().alert();
        Thread.sleep(1000);
        promptAlert.sendKeys("Best Batch Ever");
        promptAlert.accept();
















    }
}