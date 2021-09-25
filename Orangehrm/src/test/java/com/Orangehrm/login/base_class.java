package com.Orangehrm.login;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class base_class  {
	public static WebDriver driver;
	public static Logger log;
 
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	    System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		log = Logger.getLogger("Login_ifelseif");
		PropertyConfigurator.configure("log4j.properties");
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
  }
  
  

  @AfterTest
  public void afterTest() throws Exception {
	  Thread.sleep(5000);
	  driver.quit();
  }

}
