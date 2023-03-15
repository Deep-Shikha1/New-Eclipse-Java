import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class switch1 {
    public static void main(String[]args)
    {
        WebDriver driver = new ChromeDriver();

        String url = "https://www.amazon.in/";
        driver.get(url);

        driver.findElement(By.linkText("Mobiles")).click();

        Set<String> handles = driver.getWindowHandles();

        String handle1 =driver.getWindowHandle();
        System.out.println("Handle of window1: " + handle1);

        handles.remove(handle1);

        String winhandle = handles.iterator().next();

        String handle2 = winhandle;


        driver.switchTo().window(handle2);
        System.out.println(handle2);

        driver.close();




    }
}
