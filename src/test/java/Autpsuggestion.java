import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Autpsuggestion {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement wb1= driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
        wb1.sendKeys("virat kohli");
        wb1.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='Zrbbw']")).sendKeys("virat kohli age");
        List <WebElement> autosuggest=driver.findElements(By.xpath("driver.findElements(By.xpath(\"//div[@aria-label='virat kohli best photos']\"))"));
        int count= autosuggest.size();
        for(int i=0;i<count;i++)
        {
            String expresult="virat kohli best photos";
            if(autosuggest.get(i).getText().equalsIgnoreCase(expresult))
            {
                autosuggest.get(i).click();
                break;
            }
        }

        Thread.sleep(2000);
        driver.close();
    }
}
