import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements1 {
    public static void main (String []args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        String url = "https://www.facebook.com/";   //open facebook page
        driver.get(url);

        //click on email name element
        WebElement element = driver.findElement(By.id("email"));
        element.click();
        Thread.sleep(2000);

        //add text in  email name textbox field
        WebElement textbox = driver.findElement((By.id("email")));
        textbox.sendKeys("deepshikha123");
        Thread.sleep(2000);

        //clear text in email name textbox field
        textbox.clear();
        Thread.sleep(2000);

        //type text(deepshikha@123.gmail.com) in email input text field
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("deepshikha@123.gmail.com");
        Thread.sleep(2000);

        //type password(deep@123) in password input text field
        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("deep@123");
        Thread.sleep(2000);

        //submit this form or click on login button
        WebElement login = driver.findElement(By.name("login"));
        login.submit();
        //login.click();
        //email.submit();
        //password.submit();

    }
}
