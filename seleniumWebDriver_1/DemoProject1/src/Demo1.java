import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		//selenium webDriver sample code
		//chromeDriver is a predefined class of selenium WebDriver library
		//Created an object for ChromeDriver class
		//WebDriver - Is an interfacce in selenium
		//ChromeDriver is the child class of WebDriver interface
		//ChromeDriver  - Chrome browser
		//ChromeDriver() -- constructor -- launch chrome browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deepshikha.1\\Desktop\\Java\\seleniumWebDriver_1\\DemoProject1\\drivers\\chromedriver.exe");
		
		//A blank chrome browser will be launched
		WebDriver driver = new ChromeDriver();
		
		//The provided URL will be open in the above chrome browser
		driver.get("http://omayo.blogspot.com/");
		
		//	Maximizing the browser window
		driver.manage().window().maximize();
		
		/*//Finding the UI elements using id
		driver.findElement(By.id("but2"));
		WebElement element = driver.findElement(By.id("confirm"));   //create object 
		element.click();   //click on confirm button
		*/
		
		//Click on search box and send keys using name
		WebElement element1 = driver.findElement(By.name("q"));
		Thread.sleep(2000);
		element1.sendKeys("Deep Shikha");
		
		
//		//Clear the Selenium WebDriver text
//		WebElement element2 = driver.findElement(By.id("textbox1"));
//		Thread.sleep(2000);
//		element2.clear();
		
		//Click on Locating using class text field and send keys using classname
		WebElement element3 = driver.findElement(By.className("classone"));
		Thread.sleep(2000);
		element3.sendKeys("Deep");
		
		/*//Click on hyperlink  using linkText
		WebElement element4 = driver.findElement(By.linkText("compendiumdev"));
		Thread.sleep(5000);
		element4.click();
		*/
		
//		//Click on hyperlink  using linkText
//		WebElement element5 = driver.findElement(By.partialLinkText("compendiumdev"));
//		Thread.sleep(5000);
//		element5.click();
//		

		
//     //Click on GetConfirmation button using css selector
//			WebElement element6 = driver.findElement(By.cssSelector("#confirm"));
//			Thread.sleep(5000);
//			element6.click();
//				
		
//		//Click on GetConfirmation button using xpath
//		WebElement element7 = driver.findElement(By.xpath("//input[@id='confirm']"));
//		Thread.sleep(5000);
//		element7.click();
//			
		
		//Print PracticeAutomationHere text using getText method
		String text = driver.findElement(By.id("pah")).getText();
		System.out.println(text);
		
		//Retrive the Tittle of the page
		String Tittle = driver.getTitle();
		System.out.println("Tittle of the page is: " + Tittle);
		
		//Print URL of main current page
		String Currenturl1 = driver.getCurrentUrl();
		System.out.println("current url1 of the page: " + Currenturl1);
		
//		//Print URL of current compendiumdev page
//		driver.findElement(By.linkText("compendiumdev")).click();
//		String Currenturl2 = driver.getCurrentUrl();
//		System.out.println("current url2 of compendiumdev page: " + Currenturl2);
//		
		
//		//quit all windows including child windows
//		driver.findElement(By.linkText("Open a popup window")).click();
//		driver.findElement(By.linkText("Blogger")).click();
		
		
		//getText or getAttribute
		String text1 = driver.findElement(By.id("textbox1")).getAttribute("value");
		System.out.println(text1);
		
		//isDisplayed
		boolean displayed = driver.findElement(By.id("but2")).isDisplayed();
		System.out.println("Button2 is displayed on the page: " + displayed);
		
		//is Enabled
		boolean enabled = driver.findElement(By.id("but2")).isEnabled();
		System.out.println("Button2 is enabled on the page: " + enabled);
		
		boolean enabled1 = driver.findElement(By.id("but1")).isEnabled();
		System.out.println("Button1 is enabled on the page: " + enabled1);
		
		//isSelected
		boolean selected1 = driver.findElement(By.id("checkbox1")).isSelected();
		System.out.println("Orange checkbox is selected: " + selected1);
		
		boolean selected2 = driver.findElement(By.id("checkbox2")).isSelected();
		System.out.println("Blue checkbox is selected: " + selected2);
		
		//navigate
		driver.navigate().to("https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/WebDriver.html");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
//		//getpagesource
//		String sourcepage = driver.getPageSource();
//		System.out.println("All pagesource of the page: " + sourcepage );	
		
		//tagname
		String tagname = driver.findElement(By.id("but2")).getTagName();
		System.out.println("Tagname of Button2 is: " + tagname);
		
		//getCSSvalue
		String cssvalue = driver.findElement(By.id("home")).getCssValue("text-align");
		System.out.println("css value of home: " + cssvalue);
		
		//getsize
		Dimension d = driver.findElement(By.id("but2")).getSize();     // Dimention return type used like boolean
		System.out.println("Heigth of the Button2: " + d.height);
		System.out.println("Width of the Button2: " + d.width);
		
		//Find the position -- getLocation
		Point p = driver.findElement(By.id("but2")).getLocation();    // Point return type used like boolean
		System.out.println("X- coordinate of the Button2: " + p.x);
		System.out.println("Y- coordinate of the Button2: " + p.y);
		
		//full Screen mode
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		
		//findElements -- multiple elements/ tagname with a
		 List<WebElement> elements = driver.findElements(By.tagName("a"));     //returnt type of findElents is List of WebElements
		 
		 for(int i=0; i<elements.size(); i++)
		 {
			 if(elements.get(i).getText().length()>0)     //this line remove space b/w text
			  System.out.println(elements.get(i).getText());
		 }
		
		 
		
		//Close browser window
		//driver.close();  //only close main browser
	    driver.quit();   // close all browser including chlid browser
	
		
		
	}

}
