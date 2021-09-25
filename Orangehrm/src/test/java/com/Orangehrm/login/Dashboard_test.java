package com.Orangehrm.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Dashboard_test{
	public WebDriver driver;
	 public Dashboard_test(WebDriver driver)
		// TODO Auto-generated constructor stub
	 {
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	 }
}
