//HANDALLING ALERTS

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo4 {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deepshikha.1\\Desktop\\Java\\seleniumWebDriver_1\\DemoProject1\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		   //The provided URL will be open in the above chrome browser
		    driver.get("http://omayo.blogspot.com/");    
		    driver.manage().window().maximize();
		    
		    
		    //selenium implicit wait - Global wait
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
			
			
			//Handaling Alerts
			driver.findElement(By.id("alert1")).click();
			Thread.sleep(3000);
			
			//switch to alert tab
			Alert alert = driver.switchTo().alert();
			
			
			//get text value in alert tab-- Hello
			String textDisplayeOnAlert = alert.getText();
			System.out.println(textDisplayeOnAlert);
			
			//click on OK button on alert tab
			alert.accept();
			Thread.sleep(3000);
			
			
			
			
			//Handling Drop-down and Multi-selection box fields(use select command)
			
			//driver.findElement(By.id("drop1")).sendKeys("doc 3");   //This is not a exact way to selection
			
			WebElement dropdownfield = driver.findElement(By.id("drop1"));
			Select select = new Select(dropdownfield);
			select.selectByVisibleText("doc 3");
			Thread.sleep(3000);
			select.selectByIndex(4);      //alternate way
			
			
			//Multiselection option
			WebElement multiSelectionBoxField = driver.findElement(By.id("multiselect1"));
			Select select1 = new Select(multiSelectionBoxField);
			
			select1.selectByVisibleText("Volvo");
			select1.selectByVisibleText("Audi");
			select1.selectByVisibleText("Hyundai");
			
			
			Thread.sleep(3000);
			select1.deselectByVisibleText("Hyundai");
			
			
			
			
			
			
			
		   // driver.quit();
			
			
			
			
			
 
			

	}

}
