import org.example.Main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
    public static void main(String[] args) {
        int [][]arr = {{1,4,8},{3,6,2},{9,5,7}};
        int max= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j< arr.length;j++){
                if (arr[i][j]>max) {
                    max=arr[i][j];
                }
            }
        }
        System.out.println("max value is "+max);
    }
}
