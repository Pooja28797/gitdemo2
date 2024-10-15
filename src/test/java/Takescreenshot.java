import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class Takescreenshot {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        try {
            // Navigate to the URL
            driver.get("https://www.google.co.in/");
            driver.manage().window().maximize();

            // Take screenshot
            takeScreenshot(driver, "screenshot.png");
        }finally {
            // Clean up and close the browser
            driver.quit();
        }
    }
    public static void takeScreenshot(WebDriver driver, String filePath) {
        // Convert WebDriver instance to TakesScreenshot
        TakesScreenshot ts = (TakesScreenshot) driver;

        // Capture screenshot
        File source = ts.getScreenshotAs(OutputType.FILE);

        // Save screenshot to desired location
        File destination = new File(filePath);
        try {
            FileHandler.copy(source, destination);
            System.out.println("Screenshot taken and saved as " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

