package com.Orangehrm.login;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Login_Test {
	public WebDriver driver;
	public JavascriptExecutor js;
	public WebElement logoutX;
  @Test(priority = 1,description = "Login with valid Credential")
  public void logout() throws Exception {
	  WebElement Username =driver.findElement(By.xpath("//input[@id='txtUsername']"));
		Username.sendKeys("Admin");
		Thread.sleep(5000);
		String Name =Username.getAttribute("value");
		Thread.sleep(5000);
		System.out.println("Entered Username is: "+Name);
		//System.out.println("Username Entered"+ Name);
		
		WebElement Password =driver.findElement(By.xpath("//input[@id='txtPassword']"));
		Password.sendKeys("admin123");
		System.out.println("Entered Password is: "+Password.getAttribute("value"));
		
		WebElement Login =driver.findElement(By.xpath("//input[@id='btnLogin']"));
		Login.click();
		System.out.println("clicked on Login Button");
		System.out.println("User Login Successfully");
  }
  @Test(priority = 2,description = "Click on My Info")
  public void ClickonMyInfo() throws Exception {
	  String title=driver.getTitle();     
		System.out.println(title);
		Thread.sleep(5000);
		WebElement MyInfo=driver.findElement(By.xpath("//b[normalize-space()='My Info']"));
		MyInfo.click();
		System.out.println("clicked on Myinfro tab");
  }
  @Test(priority = 3,description = "Filled My Info Form")
  public void Myinfoform() throws Exception
  {
	  js.executeScript("scroll(0,800)");
		js.executeScript("scroll(0,-800)");
		//get Heading
		String Heading =driver.findElement(By.xpath("//h1[contains(.,'Personal Details')]")).getText();
		System.out.println(Heading);
		
		
		WebElement Editbutton =driver.findElement(By.xpath("//input[@id='btnSave']"));
		Editbutton.click();
		System.out.println("clicked on Edit Button");
		
		WebElement Firstname=driver.findElement(By.xpath("//input[@id='personal_txtEmpFirstName']"));
		Firstname.clear();
		System.out.println("Cleared first Name");
		Firstname.sendKeys("Vashim");
		String Fname= Firstname.getAttribute("value");
		System.out.println("Entered first Name: "+Fname);
		
		System.out.println("Entered First Name");
		
		WebElement MiddleName=driver.findElement(By.xpath("//input[@id='personal_txtEmpMiddleName']"));
		MiddleName.sendKeys("N");
		System.out.println("Entered Middale Name");
		
		WebElement LastName=driver.findElement(By.xpath("//input[@id='personal_txtEmpLastName']"));
		LastName.clear();
		System.out.println("Cleared LastName");
		LastName.sendKeys("Sheikh");
		System.out.println("Entered Last Name");
		
		WebElement EmployeeID=driver.findElement(By.xpath("//input[@id='personal_txtEmployeeId']"));
		EmployeeID.clear();
		System.out.println("Cleared EmployeeID");
		EmployeeID.sendKeys("1919");
		System.out.println("Entered EmployeeID");
		
		WebElement OtherText=driver.findElement(By.xpath("//input[@id='personal_txtOtherID']"));
		OtherText.sendKeys("2020");
		System.out.println("Entered OtherID");
		
		WebElement LicenNo=driver.findElement(By.xpath("//input[@id='personal_txtLicenNo']"));
		LicenNo.clear();
		System.out.println("Cleared Licence No ");
		LicenNo.sendKeys("VAS1919");
		System.out.println("Entered Licence No");
		
		WebElement ExpDate=driver.findElement(By.xpath("//input[@id='personal_txtLicExpDate']"));
		ExpDate.click();
		System.out.println("Clicked on Expired Date ");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[normalize-space()='17']")).click();
		System.out.println("Select Expired Date");
		
//		WebElement SINNo=driver.findElement(By.xpath("//input[@id='personal_txtSINNo']"));
//		SINNo.sendKeys("1234567");
//		System.out.println("Entered SINNO");
		
		WebElement Male=driver.findElement(By.xpath("//input[@id='personal_optGender_1']"));
		Male.click();
		
		
	    Select MaritalS = new Select(driver.findElement(By.xpath("//select[@id='personal_cmbMarital']")));
	    MaritalS.selectByValue("Single");
	 	Thread.sleep(5000);
	 	MaritalS.selectByVisibleText("Married");
	 	Thread.sleep(5000);
	 	MaritalS.selectByIndex(1);
	 	String Matritalstatus = MaritalS.getFirstSelectedOption().getText();
	 	System.out.println("Marital Status is: "+Matritalstatus);
	 	//System.out.println("Selected Marital Status is:"+ MaritalS.getFirstSelectedOption().getText());
	 	
	 	
		Select Nationality = new Select(driver.findElement(By.xpath("//select[@id='personal_cmbNation']")));
		Nationality.selectByValue("10");
		Thread.sleep(5000);
		Nationality.selectByVisibleText("Armenian");
		Thread.sleep(5000);
		Nationality.selectByIndex(1);
		System.out.println("Selected Nationality is:"+ Nationality.getFirstSelectedOption().getText());
		
//		driver.findElement(By.xpath("//input[@id='personal_DOB']")).click();
//		System.out.println("Clicked On DOB");
		
//		Thread.sleep(5000);
		
//		driver.findElement(By.xpath("//a[normalize-space()='31']")).click();
//		System.out.println("DOB Selected");
		
		WebElement EditButton2 = driver.findElement(By.xpath("//input[@id='btnEditCustom']"));
		EditButton2.click();
		System.out.println("Clicked on Edit Button");
		
		Select BloodG = new Select(driver.findElement(By.xpath("//select[@name='custom1']")));
		BloodG.selectByIndex(5);
		System.out.println("Blood Type is:"+ BloodG.getFirstSelectedOption().getText());
		
		Thread.sleep(5000);
		logoutX =driver.findElement(By.xpath("//a[@class='panelTrigger']"));
		logoutX.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[normalize-space()='About']")).click();
	    Thread.sleep(5000);
		String About =driver.findElement(By.xpath("//div[@id='companyInfo']")).getText();
		System.out.println(About);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='displayAbout']//a[@class='close'][normalize-space()='×']")).click();
		Thread.sleep(5000);
		logoutX.click();
		Thread.sleep(5000);
		logoutX.click();
		
		
  }
  @Test(priority = 4,description = "Logout user")
  public void Logout() throws Exception {
	  Thread.sleep(5000);
	  logoutX.click();
	  driver.findElement(By.xpath("//a[contains(.,'Logout')]")).click();
	   System.out.println("User Logout Successfully");
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
	   driver= new ChromeDriver();
	   js =(JavascriptExecutor)driver;
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
