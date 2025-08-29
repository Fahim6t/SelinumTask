package task;

import java.io.FileReader;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.LocateElements;



public class VinothReg {
	WebDriver driver = null;
	@Test
	public void run() throws Exception {
		
		
		   
			driver = new ChromeDriver();
			FileReader fr = new FileReader("C:\\Users\\fahim.i\\eclipse-mavendemo\\VinothTest\\inputdata\\data.properties");
			Properties p = new Properties();
			p.load(fr);
			
			String first = driver.getWindowHandle();
			driver.get(p.getProperty("url1"));
			
			driver.switchTo().newWindow(WindowType.TAB);
			
			driver.getWindowHandle();
			driver.get(p.getProperty("url2"));  
			driver.switchTo().window(first);
			
		
			
			 
			String title = driver.getTitle();
			System.out.println("Title: "+title);
			LocateElements element = new LocateElements(driver);
			
			
			
			element.enterFirstName(p.getProperty("firstname"));
			element.enterLastName(p.getProperty("lastname"));
			
			
			element.selectGender();
			
			
			element.selectCountry(p.getProperty("country"));

			element.enterEmail(p.getProperty("email"));
			
			element.enterVerification(p.getProperty("verificationNumber"));
		
			element.clickSubmit();
		
	}
	
	
	
}
