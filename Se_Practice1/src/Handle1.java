import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Handle1 {
    public static void main(String []args)
    {
        WebDriver driver = new ChromeDriver();

        String url = "https://www.amazon.in/";
        driver.get(url);

        String handle1 =driver.getWindowHandle();
        System.out.println("Hnandle of window1: " + handle1);

        driver.findElement(By.linkText("Mobiles")).click();

        Set<String> handleALL =driver.getWindowHandles();
        System.out.println("Handle of windowALL: " + handleALL);

        driver.quit();


    }
}
