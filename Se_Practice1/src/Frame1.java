import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {
    public static void main(String []args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        String url = "http://omayo.blogspot.com/";
        driver.get(url);

       // driver.findElement(By.linkText())



        //driver.switchTo().defaultContent();   //switch from frame to default content
        driver.findElement(By.id("ta1")).sendKeys("Add some text");

        driver.findElement(By.id("alert2")).click();    //click on ClickAfterTextDiappears box
        Thread.sleep(2000);

        driver.switchTo().alert().accept();    //click Ok button on pop-up
        Thread.sleep(2000);


        driver.findElement(By.id("alert2")).click();    //Again click on ClickAfterTextDiappears box
        Thread.sleep(2000);

        driver.switchTo().alert().dismiss();    //click cancel button on pop-up
        Thread.sleep(2000);

        //Get dimension of current window and print it
        Dimension d = driver.manage().window().getSize();
        System.out.println("dimension of the page:  "+ d);
        Thread.sleep(2000);


        //Resize current window to the set dimension
        Dimension d1 = new Dimension(300, 200);    //small size window
        driver.manage().window().setSize(d1);
        Thread.sleep(2000);


        //Maximize the current window
        driver.manage().window().maximize();   //large maximize size window
        Thread.sleep(2000);

        Point p = new Point(400, 500);
        driver.manage().window().setPosition(p);
        Thread.sleep(2000);

        driver.quit();


    }
    }

