package HomeWorkProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ParaBankTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");

        WebElement firstName= driver.findElement(By.id("customer.firstName"));
        firstName.sendKeys("John");

        WebElement lastName=driver.findElement(By.id("customer.lastName"));
        lastName.sendKeys("Doe");

        WebElement address=driver.findElement(By.id("customer.address.street"));
        address.sendKeys("123 Main Street");

        WebElement city= driver.findElement(By.id("customer.address.city"));
        city.sendKeys("Lincoln");

        WebElement state=driver.findElement(By.id("customer.address.state"));
        state.sendKeys("Nebraska");

        WebElement zipCode=driver.findElement(By.id("customer.address.zipCode"));
        zipCode.sendKeys("68501");

        WebElement phoneNumber=driver.findElement(By.id("customer.phoneNumber"));
        phoneNumber.sendKeys("402-255-3648");

        WebElement socialSecNum=driver.findElement(By.id("customer.ssn"));
        socialSecNum.sendKeys("123-123-1234");

        WebElement userName=driver.findElement(By.id("customer.username"));
        userName.sendKeys("johndoe");

        WebElement password=driver.findElement(By.id("customer.password"));
        password.sendKeys("123987546");

        WebElement confirmPassword=driver.findElement(By.id("repeatedPassword"));
        confirmPassword.sendKeys("123987546");

        Thread.sleep(6000);
        WebElement loginButton=driver.findElement(By.className("button"));
        loginButton.click();



        Thread.sleep(6000);
        driver.quit();




    }
}
