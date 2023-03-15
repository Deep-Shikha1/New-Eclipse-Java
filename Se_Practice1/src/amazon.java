//1.
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
    public static void main(String[]args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");
        Thread.sleep(5000);
        driver.get("https://www.gmail.com/");
        Thread.sleep(5000);
        driver.get("https://www.google.in/");
        Thread.sleep(5000);
        driver.get("https://www.flipkart.com/");
        Thread.sleep(5000);
        driver.get("https://www.outlook.com/");
        Thread.sleep(5000);
        driver.close();
        //driver.navigate().to("https://www.amazon.in/");   //same as .get("url")

        //driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
      //  driver.findElement(By.linkText("Mobiles")).click();


    }
}
