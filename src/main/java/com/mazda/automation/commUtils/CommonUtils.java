/**
 * 
 */
package com.mazda.automation.commUtils;

import org.apache.commons.lang.StringUtils;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.mazda.automation.baseClass.BaseClass;



public class CommonUtils extends BaseClass{
	
	//String baseURL = System.getProperty("webdriver.base.url");
	String browserName = System.getProperty("webdriver.browser.name");
	
	String baseURL = "https://www.mazda.com.au/";
//	String browserName = "chrome";
	
	
	/**
	 * @param driver
	 * @return
	 */
	public WebDriver launchBrowser(WebDriver driver, String pageName) {
		
		//setting default values for baseURL and browserName
		if (StringUtils.isEmpty(baseURL)) {
			baseURL = "https://www.mazda.com.au/".concat(pageName);
		}else {
			baseURL = baseURL.concat(pageName);
		}
		if (StringUtils.isEmpty(browserName)) {
			browserName = "chrome";
		}

		System.out.println("Launching base url: "+baseURL);
		System.out.println("Launhing browser in: "+browserName);
		
		driver = BrowserSetup(browserName);
		if (!GetURL(baseURL)) {
			System.out.println("Unable to get URL:" + driver.getCurrentUrl() + ", Environment may be unavailable. Aborting Test");
			Assert.fail("Error on page. Check URL: " + driver.getCurrentUrl());
		}
		return driver;
	}

}
