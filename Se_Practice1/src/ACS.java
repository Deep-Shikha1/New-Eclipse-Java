import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ACS {
    public static void main(String []args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        String ACS_url = "https://alfresco.testrail.net/index.php?/projects/overview/1";
        driver.get(ACS_url);

        driver.findElement(By.id("name")).sendKeys("deepshikha.1@globallogic.com");
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("Deep@1997");
        Thread.sleep(2000);
        driver.findElement(By.id("button_primary")).submit();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Alfresco Mobile Workspace -1.3 M2- Tilehurst")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("AMW IOS 1.3 M2")).click();


    }
}
