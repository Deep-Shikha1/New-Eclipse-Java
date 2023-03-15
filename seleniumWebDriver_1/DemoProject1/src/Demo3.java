//WAITING MECHANISM

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

//Waiting mechanism

public class Demo3 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deepshikha.1\\Desktop\\Java\\seleniumWebDriver_1\\DemoProject1\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		   //The provided URL will be open in the above chrome browser
		    driver.get("http://omayo.blogspot.com/");    
		    driver.manage().window().maximize();
		    
		    
		    //selenium implicit wait - Global wait
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//0 seconds -- immediately click
		    driver.findElement(By.className("dropbtn")).click();   //click on green Dropdown button
		    
//		    //3 seconds -- 3 seconds only it will wait
	        driver.findElement(By.linkText("Facebook")).click();
	    
		    
		    
		    //30 seconds of wait time -- Explicit wait
//		   WebDriverWait wait = new WebDriverWait(driver, 30);
//		   WebElement facebookElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Facebook")));
//		   facebookElement.click();
	        
	        
	        
	        // Waiting 30 seconds for an element to be present on the page, checking
	        // for its presence once every 5 seconds.
	        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	            .withTimeout(Duration.ofSeconds(30L))
	            .pollingEvery(Duration.ofSeconds(5L))
	            .ignoring(NoSuchElementException.class);

	        WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
	          public WebElement apply(WebDriver driver) {
	            return driver.findElement(By.linkText("Facebook"));
	          }
	        });
//		   
//		   driver.quit();
//		   
		   
		   
	}

}
