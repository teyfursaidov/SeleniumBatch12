package HomeWorkProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookHW {
    public static String url = "http://fb.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.findElement(By.partialLinkText("Create New Account")).click();

        Thread.sleep(2000);

        WebElement name=driver.findElement(By.name("firstname"));
        name.sendKeys("Henry");

        Thread.sleep(2000);

        WebElement lastName=driver.findElement(By.name("lastname"));
        lastName.sendKeys("Ford");

        Thread.sleep(2000);

        WebElement email=driver.findElement(By.name("reg_email__"));
        email.sendKeys("e-mail@email.com");

        Thread.sleep(2000);

        WebElement emailConfirmation=driver.findElement(By.name("reg_email_confirmation__"));
        emailConfirmation.sendKeys("e-mail@email.com");

        Thread.sleep(2000);

        WebElement password=driver.findElement(By.name("reg_passwd__"));
        password.sendKeys("henryford123");

        Thread.sleep(2000);

        WebElement day=driver.findElement(By.id("day"));
        Select selectDay=new Select(day);
        selectDay.selectByVisibleText("29");

        Thread.sleep(2000);

        WebElement month= driver.findElement(By.id("month"));
        Select selectMonth=new Select(month);
        selectMonth.selectByVisibleText("Feb");

        Thread.sleep(2000);

        WebElement year=driver.findElement(By.id("year"));
        Select selectYear=new Select(year);
        selectYear.selectByVisibleText("1910");

        Thread.sleep(2000);

        WebElement gender=driver.findElement(By.xpath("//input[@value='2']"));
        gender.click();

        driver.findElement(By.name("websubmit")).click();

        Thread.sleep(2000);

        driver.quit();






















    }
}