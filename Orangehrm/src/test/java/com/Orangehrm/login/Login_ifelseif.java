package com.Orangehrm.login;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Login_ifelseif extends base_class{
	
  @Test(priority = 2,description = " Verify login")
  public void Login() throws Exception {
	  
	    WebElement Username =driver.findElement(By.xpath("//input[@id='txtUsername']"));
		Username.sendKeys("Admin");
		Thread.sleep(5000);
		log.info("Username Entered:-"+Username);
		
		
		WebElement Password =driver.findElement(By.xpath("//input[@id='txtPassword']"));
		Password.sendKeys("admin123");
		log.info("Password Entered");
		
		WebElement Login =driver.findElement(By.xpath("//input[@id='btnLogin']"));
		Login.click();
		log.info("clicked on Login Button");
		log.info("User Login Successfully");
		
		Thread.sleep(5000);
		
		String title=driver.getTitle();     
		log.info(title);
		

		String url1 = driver.getCurrentUrl();
		log.info(url1);
		String Actualurl = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		if(url1.equals(Actualurl))
		{
			log.info(url1);
			log.info("User Login Successfully");
		}
		else
		{
			String invalidmassage = driver.findElement(By.xpath("//input[@id='txtPassword']")).getText();
			log.info(invalidmassage);						
		}
  }
//  @Test(priority = 1)
//  public void emptypassword() throws Exception {
//	    WebElement Username =driver.findElement(By.xpath("//input[@id='txtUsername']"));
//		Username.sendKeys("Admin");
//		Thread.sleep(5000);
//		log.info("Username Entered");
//		
//		
//		WebElement Password =driver.findElement(By.xpath("//input[@id='txtPassword']"));
//		Password.sendKeys("");
//		log.info("Password Entered");
//		
//		WebElement Login =driver.findElement(By.xpath("//input[@id='btnLogin']"));
//		Login.click();
//		log.info("clicked on Login Button");
//		
//		
//		String url1 = driver.getCurrentUrl();
//		log.info(url1);
//		String actualurl= "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
//		
//		if(url1.equals(actualurl))
//		{
//			
//			log.info("User Login Successfully");
//			
//		}
//		else {
//			
//			String emptypassword1 = driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
//			log.info(emptypassword1);
//		}
//	  
//  }
//  
//  @Test(priority = 2)
//  public void emptyusername() throws Exception {
//	  WebElement Username =driver.findElement(By.xpath("//input[@id='txtUsername']"));
//		Username.sendKeys("");
//		Thread.sleep(5000);
//		log.info("Username Entered");
//		
//		
//		WebElement Password =driver.findElement(By.xpath("//input[@id='txtPassword']"));
//		Password.sendKeys("");
//		log.info("Password Entered");
//		
//		WebElement Login =driver.findElement(By.xpath("//input[@id='btnLogin']"));
//		Login.click();
//		log.info("clicked on Login Button");
//		
//		
//		String url1 = driver.getCurrentUrl();
//		log.info(url1);
//		String actualurl= "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
//		
//		if(url1.equals(actualurl))
//		{
//			
//			log.info("User Login Successfully");
//			
//		}
//		else {
//			
//			String emptypassword1 = driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
//			log.info(emptypassword1);
//		}
//	  
//}
	  
 
  
 
  @Test(priority = 3)
  public void myinfo() {
	  try {
			WebElement myinfotab = driver.findElement(By.xpath("//a[@href='/index.php/pim/viewMyDetails']"));
			if(myinfotab.isDisplayed()) 
			{
				myinfotab.click();
				String actualurl = driver.getCurrentUrl();
				log.info(actualurl);
			}
//			else {
//				String dashurl = driver.getCurrentUrl();
//				log.info(dashurl);
//			}
		} catch (Exception e) {
			String dashurl = driver.getCurrentUrl();
    		log.info(dashurl);
			
		}
	  
	  
  }
		
//	@Test(priority = 4)
//	
//	public void directory()
//	{
//		try {
//			WebElement directorytab = driver.findElement(By.xpath("//b[normalize-space()='Directo']"));
//			if (directorytab.isDisplayed()) {
//				directorytab.click();
//				String actualurl = driver.getCurrentUrl();
//				log.info(actualurl);	
//			}
//			else {
//				String directoryurl = driver.getCurrentUrl();
//				log.info(directoryurl);
//			}
//		} catch (Exception e) {
//			String directoryurl = driver.getCurrentUrl();
//			log.info(directoryurl);
//		}
//		
//		
//	}
  
//  @Test(priority = 4)
//  public void myinfoform() {
//	  
//	    WebElement Editbutton =driver.findElement(By.xpath("//input[@id='btnSave']"));
//		Editbutton.click();
//		System.out.println("clicked on Edit Button");
//		
//		WebElement Male=driver.findElement(By.xpath("//input[@id='personal_optGender_1']"));
//		//Male.click();
//		
//		if(Male.isDisplayed()) 
//		{
//		Male.click();
//		String male1 = driver.findElement(By.xpath("//label[normalize-space()='Female']")).getText();
//		log.info(male1);
//		}
//		else
//		{
//			 String female = driver.findElement(By.xpath("//label[normalize-space()='Female']")).getText();
//			 log.info(female);
//		}
//		
//  }
  
  @Test(priority = 4)
  public void dropdown() 
  {
	  
	  Select Nationality = new Select(driver.findElement(By.xpath("//select[@id='personal_cmbNation']")));
	 // Nationality.selectByValue("10");
	  List<WebElement> Nationdrpdwn = Nationality.getOptions();
	  int count =Nationdrpdwn.size();
	  log.info(count);
	  for (int i=0; i<count; i++) {
		  log.info(Nationdrpdwn.get(i).getText());
		  
		  
	  }
	  	  
  }
  
  @Test(priority = 5)
  public void marital() {
	  Select MaritalStattus = new Select(driver.findElement(By.xpath("//select[@id='personal_cmbMarital']")));
	  List<WebElement> Maritalsdrpdwn = MaritalStattus.getOptions();
	  int count = Maritalsdrpdwn.size();
	  log.info(count);
//	  for(int i=0; i<count; i++) {
//		  log.info(Maritalsdrpdwn.get(i).getText());
//	  }
	  for(WebElement MTDP: Maritalsdrpdwn) {
		  log.info(MTDP.getText());
	  }
	 MaritalStattus.selectByIndex(2);
	 String gender = MaritalStattus.getFirstSelectedOption().getText();
	  log.info("Marital Status is:- "+ gender);
  }
	
//  @BeforeTest
//  public void beforeTest() throws Exception {
//	  
//	  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
//		driver= new ChromeDriver();
//		log = Logger.getLogger("Login_ifelseif");
//		PropertyConfigurator.configure("log4j.properties");
//		
//		driver.get("https://opensource-demo.orangehrmlive.com/");
//		driver.manage().window().maximize();
//		Thread.sleep(5000);
//			  
//  }
//
//  @AfterTest
//  public void afterTest() throws Exception {
//	  Thread.sleep(5000);
//	  driver.quit();
//  }

}
