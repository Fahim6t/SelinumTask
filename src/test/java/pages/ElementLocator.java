package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ElementLocator {
	
  WebDriver driver;
 
    By firstname = By.id("vfb-5");
	By lastname = By.id("vfb-7");
	By gendr = By.xpath("//input[@name=\"vfb-31\"]");
	By crse = By.id("vfb-20-1");
	By country = By.id("vfb-13-country");
	By email = By.id("vfb-14");
	By verify = By.id("vfb-3");
	By submit = By.xpath("//input[@type='submit']");
	
	@Test
  public void enterFirstName(String fname) throws InterruptedException {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		WebElement firstName = driver.findElement(firstname);
		firstName.sendKeys(fname);
		System.out.println("FirstName: "+firstName.getAttribute("value"));
		
	}
  
  public void enterLastName(String lname) throws InterruptedException {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  WebElement lastName = driver.findElement(lastname);
	  lastName.sendKeys(lname);
	  System.out.println("LastName: "+lastName.getAttribute("value"));
	  
  }

  public void selectGender() throws InterruptedException {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  WebElement gender = driver.findElement(gendr);
	  gender.click();
	 System.out.println("Gender "+gender.getAttribute("value"));
  }
  
  public void selectCourse() {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  WebElement course = driver.findElement(crse);
	  course.click();
	  System.out.println("Course: "+course.getAttribute("value"));	  
  }
  
  
  	public void selectCountry(String ctry) throws InterruptedException {
  		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
  		WebElement c = driver.findElement(country);
  		Select dropdown = new Select(c);
  		dropdown.selectByVisibleText(ctry);
  		System.out.println("Country: "+c.getAttribute("value"));
  		
  		
  	}
  
  public void enterEmail(String mail) throws InterruptedException {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  WebElement cntry = driver.findElement(email);
	  cntry.sendKeys(mail);
	  System.out.println(cntry.getAttribute("value"));
	  System.out.println("Email: "+cntry.getAttribute("value"));
  }
  
  public void enterVerification(String num) throws InterruptedException {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.findElement(verify).sendKeys(num);
  } 
  

  public void clickSubmit() throws Exception{
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.findElement(submit).click();
	  
  }
    
  public ElementLocator(WebDriver driver) {
		this.driver = driver;
	}
 
  
}
