package com.Orangehrm.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class constructor {
	public WebDriver driver;
 public constructor(WebDriver driver) {
	 this.driver = driver;
	 PageFactory.initElements(driver, this);
 }
}
