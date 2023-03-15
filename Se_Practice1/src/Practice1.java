import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {
    public static void main(String[]args)
    {
        WebDriver driver = new ChromeDriver();  //launches chrome browser

        String url = "https://www.economist.com/";
        driver.get(url); // open economist page

       String title = driver.getTitle();   //.getTitle() command
       System.out.println("title of page " +  title);     //print title of economist page --The Economist - World News, Politics, Economics, Business & Finance

       int length = driver.getTitle().length();
        System.out.println("length of the page " + length);   //print length of title

        //driver.getTitle("https://www.economist.com/");


        String currenturl = driver.getCurrentUrl();   //.getCurrentUrl command
        System.out.println("current page url " + currenturl);      //print current url

        if(currenturl.equals(url))
        {
            System.out.println("Verifictaion successful- Correct url is opened");
        }
        else {
            System.out.println("Verifictaion failed- Incorrect url is opened");
        }


        String pagesource = driver.getPageSource();   //.getPageSource command
          //System.out.println("all link of the page" +pagesource);

        int pagelength = driver.getPageSource().length();     //length of the pagesource
           System.out.println("length of the pagesource "  +  pagelength);

           //driver.close();    // close the chrome browser



    }
}
