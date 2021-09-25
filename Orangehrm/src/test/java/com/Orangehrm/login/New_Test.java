package com.Orangehrm.login;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class New_Test {
	public WebDriver driver;
	 @Test(priority = 1)
	  public void Newwindows() throws Exception {
		 String title=driver.getTitle();     
		System.out.println(title);
		WebElement wiki= driver.findElement(By.xpath("//img[@class='wikipedia-icon']"));
	    wiki.click();
	    
	    Robot Newtab = new Robot();
	    Newtab.keyPress(KeyEvent.VK_CONTROL);
	    Newtab.keyPress(KeyEvent.VK_W);
	    Newtab.keyRelease(KeyEvent.VK_W);
	    Newtab.keyRelease(KeyEvent.VK_CONTROL);
	    
	    
//	    driver.navigate().to("http://testautomationpractice.blogspot.com/");
//		  driver.switchTo().frame(wiki);
//		 driver.close();	
		 WebElement search = driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']"));
		 search.sendKeys("google");
		 WebElement searchbtn = driver.findElement(By.xpath("//input[@type='submit']"));
		 searchbtn.click();
		 
//		 String searchresult = driver.findElement(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results-header']")).getText();
//		 System.out.println(searchresult);
//		 WebElement clickresult = driver.findElement(By.xpath("//a[.='Google']"));
//		 clickresult.click();
//		 System.out.println(clickresult);
		 
		
	  }
  @Test(priority = 2)
  public void alert() throws Exception {
	  
	  WebElement alert=driver.findElement(By.xpath("//button[normalize-space()='Click Me']"));
	  alert.click();
	  driver.switchTo().alert().accept();
	  String oktext = driver.findElement(By.xpath("//p[@id='demo']")).getText();
	  System.out.println(oktext);
	  Thread.sleep(5000);
	  alert.click();
	  driver.switchTo().alert().dismiss();
	  String canceltext = driver.findElement(By.xpath("//p[@id='demo']")).getText();
	  System.out.println(canceltext);	  
  }
  @Test(priority = 3)
 public void datepicker() {
	  WebElement date =driver.findElement(By.xpath("//input[@id='datepicke']"));
	  date.sendKeys("09/30/2021");
  }
 @Test(priority = 4)
 public void selectmenu() {
	 Select speed = new Select(driver.findElement(By.xpath("//select[@id='speed']")));
	 speed.selectByIndex(3);
	 
	 Select file = new Select(driver.findElement(By.xpath("//select[@id='files']")));
	 file.selectByValue("2");
	 
	 Select number = new Select(driver.findElement(By.xpath("//select[@id='number']")));
	 number.selectByVisibleText("3"); 
	 
	 Select product = new Select(driver.findElement(By.xpath("//select[@id='number']")));
	 product.selectByIndex(4);
	 
	 Select animal = new Select(driver.findElement(By.xpath("//select[@id='number']")));
	 animal.selectByIndex(3);
 }
 @Test(priority = 5)
 public void textlabel() {
	 String labeltext = driver.findElement(By.xpath("//div[@id='Text1']")).getText();
	 System.out.println(labeltext);	 
 }
 @Test(priority = 6)
 public void xpathaxes() {
	 String axesxpath = driver.findElement(By.xpath("//div[@id='HTML14']")).getText();
	 System.out.println(axesxpath);	
 }
 @Test(priority = 7)
 public void Volunteersignup() throws Exception {
//	 String heading = driver.findElement(By.xpath("//h1[normalize-space()='Volunteer Sign Up']")).getText();
//	 System.out.println(heading);
	 Thread.sleep(5000);
	 driver.switchTo().frame("frame-one1434677811");
	 WebElement Name=driver.findElement(By.xpath("//input[@id='RESULT_TextField-1']"));
	 Name.click();
	 Name.sendKeys("Virat");
     
//	 WebElement lastname= driver.findElement(By.xpath("//input[@id='RESULT_TextField-2']"));
//	 lastname.sendKeys("Shahare");
//	  
//	 WebElement phone= driver.findElement(By.xpath("//input[@id='RESULT_TextField-3']"));
//	 phone.sendKeys("0987654321");
//	 
//	 WebElement country= driver.findElement(By.xpath("//input[@id='RESULT_TextField-4']"));
//	 country.sendKeys("INDIA");
//	 
//	 WebElement city= driver.findElement(By.xpath("//input[@id='RESULT_TextField-5']"));
//	 city.sendKeys("Nagpur");
//	 
//	 WebElement email= driver.findElement(By.xpath("//input[@id='RESULT_TextField-6']"));
//	 email.sendKeys("virat@tech.co.in");
//	 
//	 WebElement gender=driver.findElement(By.xpath("//label[normalize-space()='Male']"));
//	 gender.click();
//	 
//	 WebElement sunday=driver.findElement(By.xpath("//label[normalize-space()='Sunday']"));
//	 sunday.click();
//	 WebElement monday=driver.findElement(By.xpath("//label[normalize-space()='Monday']"));
//	 monday.click();
//	 WebElement Tuesday=driver.findElement(By.xpath("//label[normalize-space()='Tuesday']"));
//	 Tuesday.click();
//	 WebElement Wednesday=driver.findElement(By.xpath("//label[normalize-space()='Wednesday']"));
//	 Wednesday.click();	
//	 WebElement Thursday=driver.findElement(By.xpath("//label[normalize-space()='Thursday']"));
//	 Thursday.click();	
//	 WebElement Friday=driver.findElement(By.xpath("//label[normalize-space()='Friday']"));
//	 Friday.click();	
//	 WebElement Saturday=driver.findElement(By.xpath("//label[normalize-space()='Saturday']"));
//	 Saturday.click();	
//	 
//	 Select btc = new Select(driver.findElement(By.xpath("//select[@id='RESULT_RadioButton-9']")));
//	 btc.selectByIndex(2);
//	 
//	 WebElement uploadfile = driver.findElement(By.xpath("//input[@id='RESULT_FileUpload-10']"));
//	 uploadfile.sendKeys("C:\\Users\\anynomous\\Pictures\\download1233.jpg");
//	 
 }
 @Test(priority = 8)
 public void doubleclick() {
	 WebElement field1 = driver.findElement(By.xpath("//input[@id='field1']"));
	 field1.clear();
	 field1.sendKeys("Virat");
	 WebElement copytextbtn = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
	 copytextbtn.click();
	 WebElement field2 =driver.findElement(By.xpath("//input[@id='field2']"));
	 field2.getText();
	 
 }
 
  @BeforeTest
  public void beforeTest() throws Exception {
	  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  Logger log = Logger.getLogger("");
	  driver.get("http://testautomationpractice.blogspot.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
  }

  @AfterTest
  public void afterTest() throws Exception {
	  Thread.sleep(5000);
	  driver.quit();
  }

}
