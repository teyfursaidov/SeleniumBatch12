package HomeWorkProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class EbayAllCategories {

    public static String url="http://ebay.com";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);

        WebElement categoryDD=driver.findElement(By.cssSelector("select[id='gh-cat']"));
        Select select=new Select(categoryDD);
        List<WebElement> options=select.getOptions();

        for(WebElement option:options){
            String optionTxt=option.getText();
            System.out.println(optionTxt);
        }

        select.selectByVisibleText("Computers/Tablets & Networking");
        WebElement search=driver.findElement(By.cssSelector("input[type='submit']"));
        search.click();

        String title=driver.getTitle();
        if(title.equals("Computers, Tablets & Network Hardware")){
            System.out.println("Title is correct.");
        }else{
            System.out.println("Title incorrect.");
        }


    }
}
