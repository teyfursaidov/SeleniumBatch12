package HomeWorkProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeVideoSelect {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("http://www.youtube.com");
        WebElement search=driver.findElement(By.name("search_query"));
        search.sendKeys("teyfur senmisin");
        Thread.sleep(2000);
        driver.findElement(By.id("search-icon-legacy")).click();
        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("Vahi ")).click();
        Thread.sleep(60000);
        driver.quit();




    }
}
