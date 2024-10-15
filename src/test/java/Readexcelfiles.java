import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Field;

public class Readexcelfiles {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        File src=new File("C:\\Users\\HP\\Downloads\\Training Materials\\readdataexcel.xlsx");

        FileInputStream fis=new FileInputStream(src);
        XSSFWorkbook wb= null;
        try {
            wb = new XSSFWorkbook(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        XSSFSheet sh=wb.getSheet("sheet1");
        System.out.println(sh.getSheetName());
        System.out.println(sh.getRow(0).getCell(0).getStringCellValue());
        System.out.println(sh.getRow(1).getCell(2).getNumericCellValue());
        System.out.println("Total rows: " +(sh.getLastRowNum()+1));

        System.out.println("Total columns: " +sh.getRow(1).getLastCellNum());

        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        String abc=sh.getRow(0).getCell(0).getStringCellValue();
        String abc2=sh.getRow(1).getCell(0).getStringCellValue();
        driver.findElement(By.id("email")).sendKeys(abc);
        driver.findElement(By.id("pass")).sendKeys(abc2);
        Thread.sleep(2000);
        driver.close();
    }
}
