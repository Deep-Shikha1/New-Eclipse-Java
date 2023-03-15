//2.
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class SeleniumChrome {

    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\deepshikha.1\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver Driver = new ChromeDriver();   //launch Chrome browser
        //Driver.get("https://www.facebook.com/");

        //Driver.findElement(By.id("u_0_d_qM")).click();
        //Driver.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy")).click();
        //Driver.get("https://en.wikipedia.org/wiki/Main_Page");  //navigate to website//Driver.findElement(By.id("searchButton")).click();   //locate an element and click on it
        //Driver.findElement(By.id("email")).click(); //click on email box
        // Driver.findElement(By.id("pass")).click();  //click on password box
        //Driver.findElement(By.name("login")).click();   //click on login button
        //Driver.findElement(By.linkText("Create a Page")).click();  //click on create a Page link
        //Driver.findElement(By.partialLinkText("Forgotten")).click();  //click on forgotten password


        //List<WebElement> link = Driver.findElements(By.tagName("a")); //take all links on that page

        //System.out.println(link.size());    //print no.of links present on that page

        //for(WebElement l : link)             //loop to calculate all links
        // {
        // //System.out.println(l.getText());   //print all links name
       // }
       // Driver.findElement(By.cssSelector("u_0_d_FM")).click();


        ///DRIVER COMMAND

        //launch facebook website
        String fbUrl = "https://www.facebook.com/";   /// .get() command
        Driver.get(fbUrl);    //launch facebook page

        //get title of current page
        String title = Driver.getTitle();      ///.getTitle() command
        System.out.println(title);    //print tittle of page currently which we are working--Facebook – log in or sign up

        //get current url
        String currenturl = Driver.getCurrentUrl();   ///.getCurrentUrl() command
        System.out.println(currenturl);     //print current url which we are working on --https://www.facebook.com/

        //get pagesource link
        String pagesource = Driver.getPageSource();    ///.getPageSource() command
        System.out.println(pagesource);   //print <link rel="preload" href="https://static.xx.fbcdn.net/rsrc.php/v3/yq/l/0,cross/L0VTH1UsUXD.css?_nc_x=Ij3Wp8lg5Kz" as="style" crossorigin="anonymous">


        //close the  window
        //Driver.close();   ///.close() command          //open chrome after operation close chrome browser automatically


        //close all related windows and kill the session
       Driver.quit();    ///.quit() command
    }

}