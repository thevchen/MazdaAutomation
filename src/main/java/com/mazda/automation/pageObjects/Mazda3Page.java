package com.mazda.automation.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.mazda.automation.baseClass.BaseClass;

public class Mazda3Page extends BaseClass{

	public WebDriver driver;
	
	@FindBy(xpath = "//a[text()='AngularJS']")
	public WebElement angularJSLink;
	
	
}
