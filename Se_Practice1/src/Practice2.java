import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {
    public static void main(String[]args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://en.wikipedia.org/");
        Thread.sleep(5000);

        driver.findElement(By.linkText("Help")).click();   //click on Help
        Thread.sleep(5000);

        driver.navigate().back();   // come back to home page
        Thread.sleep(5000);

        driver.navigate().forward();   //again go to help
        Thread.sleep(5000);

        driver.navigate().back();     //come back to home page
        Thread.sleep(5000);

        driver.navigate().refresh();    //refresh the browser
        Thread.sleep(5000);

        driver.quit();



    }
}
