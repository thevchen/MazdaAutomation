package com.mazda.automation.pageObjects;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.mazda.automation.baseClass.BaseClass;

/**
 * @author Theivendran
 * 
 * A page object class containing all the elements and actions 
 * associated to the Mazda 3 landing page.    
 *
 */



public class CompareOurRange extends BaseClass{

	//=======Listing elements interacted on this page==========================

	// Radio buttton Identifications
	@FindBy(xpath="//h2[contains(.,'Compare our range')]")
	public WebElement compareOurRangeTitle;
	
	@FindBy(xpath="//img[@alt='Mazda2']")
	public WebElement compareOurRangeModelMazda2;

	@FindBy(xpath="//img[@alt='Mazda3']")
	public WebElement compareOurRangeModelMazda3;
	
	
	
	//img[contains(@alt,'Mazda2')]
	
	//=======Listing elements interacted on this page==========================
	
	//No need of this method
//	// Method to check colour radio buttons
//	public boolean verifyColourRadioButtons ()
//	{
//		try{
//			// need to write code to check Colour radio buttons exists
//			
//			return true;
//		}
//		catch (Exception e)
//		{
//			System.out.println("!!!!Unable to find !!!!");
//			e.printStackTrace();
//			return false;
//		}
//	}
		

}
