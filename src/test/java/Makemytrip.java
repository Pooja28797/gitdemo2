import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Makemytrip {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("Fashion");
        driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@title=\"Jegging For Girls\"]")).click();
        Thread.sleep(2000);

       //driver.findElement(By.xpath("//li[@id='swatch-3-size']")).click();
        Thread.sleep(2000);
        JavascriptExecutor executor=(JavascriptExecutor) driver;
        executor.executeScript("window.scrollBy(0,500)");


        Thread.sleep(2000);
        driver.quit();
    }
}
