import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a {
    public static void main (String[]args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
       // Thread.sleep(2000);
        driver.get("https://www.gmail.com/");

    }
}
