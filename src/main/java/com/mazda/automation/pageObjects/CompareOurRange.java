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
	
	@FindBy(xpath="//img[@data-reactid='20']")
	public WebElement compareOurRangeModelMazda2;
	
	
	@FindBy(xpath="//img[@data-reactid='28']")
	public WebElement compareOurRangeModelMazda3;
	
		
	@FindBy(xpath="//a[contains(.,'Compare Cars')]")
	public WebElement compareCarButton;
	
	@FindBy(xpath="//div[(@data-test='selection-left' and 'select-grade')]")
	public WebElement modelGradeSelectionLeft;
			
	@FindBy(xpath="//div[(@data-test='selection-right' and 'select-grade')]")
	public WebElement modelGradeSelectionRight;
	
	@FindBy(xpath="//div[contains(.,'Your price is on its way.')]")
	public WebElement modelPricelabel;
	
	@FindBy(xpath="//a[contains(.,'Restart')]")
	public WebElement modelRestart;
	
	@FindBy(xpath="//p[contains(.,'Find the right Mazda for you')]")
	public WebElement GalleryGridTxt;
	
;
	
	
	//img[contains(@alt,'Mazda2')]
	
	//=======Listing elements interacted on this page==========================
	
	//No need of this method
//	// Method to check colour radio buttons
	/*public boolean navigateURLs (String subURL)
	{
		try{
			// need to write code to check Colour radio buttons exists
			
		
			return true;
		}
		catch (Exception e)
		{
			System.out.println("!!!!Unable to find !!!!");
			e.printStackTrace();
			return false;
		}
	}
		*/

}
