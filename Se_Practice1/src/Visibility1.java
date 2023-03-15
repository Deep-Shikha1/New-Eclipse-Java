import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Visibility1 {
    public static void main(String[]args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        /*String url = "https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804791%7Ce%7Cfacebook%7C&placement=&creative=550525804791&keyword=facebook&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1001394929%26loc_physical_ms%3D9299460%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwkYGVBhArEiwA4sZLuH8pWXivOQXJ56a8p9ka2z6uWs2kjVssG9-9F1vHNERc6_Cg_S9sKBoC3aUQAvD_BwE";
        driver .get(url);
        Thread.sleep(2000);

        WebElement checkbox = driver.findElement(By.name("sex"));
        //checkbox.click();

        boolean result;

        //check female radio button is selected or not - false(not selected)
        result = checkbox.isSelected();
        System.out.println(result);

        checkbox.click();  //click on female radio button

        //check female radio button is selected or not - true(selected)
        result = checkbox.isSelected();
        System.out.println(result);
        Thread.sleep(2000);
        */


        //.isEnabled     --check button is enables or not
        String url1= "http://omayo.blogspot.com/";
        driver.get(url1);

        WebElement Button1 = driver.findElement(By.id("but1"));
        Button1.click();
        WebElement Button2 = driver.findElement(By.id("but2"));
        Button2.click();
        WebElement textbox = driver.findElement(By.id("tb2"));
        textbox.click();

        boolean status;

        status = Button1.isEnabled();
        System.out.println("Is Button1 is enabled? : " +  status);

       status = Button2.isEnabled();
        System.out.println("Is Button2 is enabled? :" +  status);

        status = textbox.isEnabled();
        System.out.println("Is textfield is enabled? : " + status);


        //.isDisplayed   -- check hidden button is displayed or not
        WebElement hidden_button = driver.findElement(By.id("hbutton"));
        status = hidden_button.isDisplayed();
        System.out.println("Is hidden button is displayed? : " + status);

        //check hidden button is present in DOM or not
        System.out.println(driver.findElements(By.id("hbutton")).size() > 0);

        System.out.println(driver.findElement(By.id("hbutton")).getSize());


        //Get list of all links on the page by tagName
        List<WebElement> links = driver.findElements(By.tagName("a"));

        //size of list
        System.out.println(links.size());

        //print out list of links
        for (int i = 0; i<links.size(); i++)
        {
            System.out.println(i + " " + links.get(i).getText());
        }


        //.getText();
        WebElement element = driver.findElement(By.id("post-body-9023929218208337252"));
        String text = element.getText();   //Create string variable to hold text of the element
        System.out.println(text);     //print out the text of element

        //.getTagName();
        WebElement element1 = driver.findElement(By.id("but2"));
        String tagname = element1.getTagName();   //create String variable to hold tagName of the element
        System.out.println(tagname);   //print out the tagName of element


        //.getCssValue
        String  cssValue = element1.getCssValue("background-color");
        System.out.println(cssValue);

        element1.click();
        cssValue = element1.getCssValue("border-image-width");
        System.out.println(cssValue);


        //.getAttribute
        WebElement element2 = driver.findElement(By.id("radio2"));
        String attributeValue = element2.getAttribute("name");   //Create String variable to hold Value of the attribute
        String attributeValue1 = element2.getAttribute("value");  //Create String variable to hold Value of the attribute
        System.out.println(attributeValue);   //print out the text of element
        System.out.println(attributeValue1);  //print out the text of element

        //.getsize();
        WebElement element3 = driver.findElement(By.id("but2"));
        Dimension size = element3.getSize();

        System.out.println("Size of the Button2 : "  + size);
        System.out.println("Width of the Button2 : "  + size.width);
        System.out.println("Height of the Button2 : "  + size.height);
        System.out.println("Width of the Button2 with method : "  + size.getWidth());
        System.out.println("Height of the Button2 with method : "  + size.getHeight());


        //.getLocation
        WebElement element4 = driver.findElement(By.id("but2"));

        Point location = element4.getLocation();

        System.out.println("Location of an element :" + location);
        System.out.println("Location of an element X-axis :" + location.x);
        System.out.println("Location of an element Y-axis :" + location.y);


        //.selectByVisibleText
        WebElement dropdown = driver.findElement(By.id("drop1"));

        //Create object of select class
        Select abc = new Select(dropdown);
        abc.selectByVisibleText("doc 1");    //select element which text is doc 1
        Thread.sleep(5000);

        //.selectByIndex
        abc.selectByIndex(4);   //select element which index is 4 i.e.,doc 4
        Thread.sleep(5000);

        //.selectByValue
        abc.selectByValue("ghi");    //select that element which value is ghi
        Thread.sleep(5000);

        //.getOptions    --count all the options
        List<WebElement> option = abc.getOptions();  //get all the options and store them to the list
        System.out.println(option.size());     //5

        for(int i = 0; i< option.size(); i++)
         {
            System.out.println(option.get(i).getText());   //print all options(Older Newsletters, doc 1, doc 2, doc 3, doc 4)

         }

      /*  //.deselectByVisibleText
        abc.deselectByVisibleText("doc 2");
        Thread.sleep(5000);

        //.deselectByIndex
        abc.deselectByIndex(2);
        Thread.sleep(5000);

        //.deselectByValue
        abc.deselectByValue("ghi");    //deselect that element which value is ghi
        Thread.sleep(5000);
*/

        //close browser
        driver.quit();
    }
}
