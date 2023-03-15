//SWITCHING WINDOWS


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deepshikha.1\\Desktop\\Java\\seleniumWebDriver_1\\DemoProject1\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
	   //The provided URL will be open in the above chrome browser
	    driver.get("http://omayo.blogspot.com/");      // Main window//
				
		 
	    	
	 //	Maximizing the browser window
	   driver.manage().window().maximize();
			
	   driver.findElement(By.linkText("Open a popup window")).click();      //First Child window//
	   driver.findElement(By.linkText("Blogger")).click();                 //Second Child window//
			
			
	 //doing operation on child window (paragraph)
		Set<String> windowids = driver.getWindowHandles();    //get windows ids
		Iterator<String> itr = windowids.iterator();
		String ParaTextOnPopupWindow = null;
		
		while(itr.hasNext())
		{
			String windowid = itr.next();    //which windowid return don't know / assign windowid
			driver.switchTo().window(windowid);  //switching the window to check maching title
			
			if(driver.getTitle().equals("Basic Web Page Title"))
			{
				ParaTextOnPopupWindow = driver.findElement(By.id("para1")).getText();
			}
		}
		System.out.println(ParaTextOnPopupWindow );
		
		
		
		
			
//		String mainwindowids = itr.next();   //get main window ids
//		String childwindowids = itr.next();  //get child windows ids
//			
//	//for switching the window - switchTo (make selenium to see child window)
//		driver.switchTo().window(childwindowids);
//			  	 
//			 
////			while(itr.hasNext()) {
////				String windowid = itr.next();
////				System.out.println(windowid);
////			}
//			
//	   //Print 1st line of paragraph in child window
//		String FirstlineNewWindow = driver.findElement(By.id("para1")).getText();
//    	System.out.println("Firstline of paragraph: " + FirstlineNewWindow);
//    	
//    	//close only child window bcoz right now selenium focus on child window 
//    	driver.close();
//    	
//    	 //for switching the window - switchTo (make selenium to see main window)
//    		driver.switchTo().window(mainwindowids);
//    		driver.close();    //now close the main window bcoz right now selenium focus on main window
//    				  	 
//    	
    	
		
		

	}

}
