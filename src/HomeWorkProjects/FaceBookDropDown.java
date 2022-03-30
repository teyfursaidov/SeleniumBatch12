package HomeWorkProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import sun.awt.windows.ThemeReader;

import java.util.List;

public class FaceBookDropDown {

    public static String url="http://fb.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.findElement(By.partialLinkText("Create New Account")).click();

        Thread.sleep(2000);
        WebElement months=driver.findElement(By.name("birthday_month"));
        Select selectMonths=new Select(months);
        List<WebElement> allMonths =selectMonths.getOptions();
        int monthsSize=allMonths.size();
        if(monthsSize==12) {
            System.out.println("Months Drop Down has "+monthsSize+" 12 months.");
        }
        WebElement days=driver.findElement(By.id("day"));
        Select selectDays=new Select(days);
        List<WebElement> allDays= selectDays.getOptions();
        int daysSize=allDays.size();
        if(daysSize==31){
            System.out.println("Days Drop Down has "+daysSize+" days.");
        }
        WebElement years=driver.findElement(By.id("year"));
        Select selectYear=new Select(years);
        List<WebElement> allYears=selectYear.getOptions();
        int yearsSize=allYears.size();
        if(yearsSize==115){
            System.out.println("Years Drop Down has "+yearsSize+" years selection.");
        }else {
            System.out.println("Year Drop Down has "+yearsSize+" years.");
        }

        selectDays.selectByVisibleText("29");
        Thread.sleep(1000);
        selectMonths.selectByVisibleText("Feb");
        Thread.sleep(1000);
        selectYear.selectByVisibleText("1910");

        Thread.sleep(2000);
        driver.quit();









    }
}
