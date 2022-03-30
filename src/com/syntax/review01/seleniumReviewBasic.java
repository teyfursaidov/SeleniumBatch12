package com.syntax.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumReviewBasic {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //driver.get("https://www.gmail.com");
        driver.navigate().to("https://demoqa.com/text-box");
        //driver.quit();
        /*
        WebElement username=driver.findElement(By.id("userName"));
        username.sendKeys("Jaga-jaga");
        Thread.sleep(1000);
        username.clear();
        Thread.sleep(1000);
        username.sendKeys("Jagernut");
        WebElement email=driver.findElement(By.id("userEmail"));
        email.sendKeys("email@email.email");*/
        WebElement username=driver.findElement(By.xpath("//input[@id='userName']"));
        username.sendKeys("Test101");











    }
}
