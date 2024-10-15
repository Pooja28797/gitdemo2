
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.testng.ITestResult;

import java.io.File;
import java.lang.reflect.Field;

public class TakeScreenshotonfailure1 {

    public void capturescreenshot(ITestResult result) throws Exception {
        WebDriver driver;
        if (ITestResult.FAILURE == result.getStatus()) {
         //   TakesScreenshot ts = (TakesScreenshot)driver;
            //File sourceFile = ts.getScreenshotAs(OutputType.FILE);
            File destfolder = new File("./screenshots/" + result.getName() + ".png");
            // .copyFile(sourceFile, destfolder);
            System.out.println(result.getName() + "method() failed, screenshot captured");
        }
    }
}

