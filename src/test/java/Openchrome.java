import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Openchrome {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--incognito");
        WebDriver driver=new ChromeDriver(options);
        driver.get("https://www.facebook.com/");
        try {
            Thread.sleep(5000);  // Sleep for 5 seconds to see the browser
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.manage().window().maximize();
        String url=driver.getCurrentUrl();
        System.out.println(url);
        Thread.sleep(2000);
        driver.navigate().to("https://www.facebook.com/login/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.close();
    }
}
