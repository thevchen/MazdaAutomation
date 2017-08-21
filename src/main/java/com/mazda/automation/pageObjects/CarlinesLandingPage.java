package com.mazda.automation.pageObjects;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

import com.mazda.automation.baseClass.BaseClass;

/**
 * @author Theivendran
 * 
 * A page object class containing all the elements and actions 
 * associated to the Mazda 3 landing page.    
 *
 */



public class CarlinesLandingPage extends BaseClass{

	//=======Listing elements interacted on this page==========================

	// Radio buttton Identifications
	@FindBy(how= How.XPATH, using="//label[@data-value='Machine-Grey-Metallic' and @data-test='radio-group-label']")
	public WebElement ColorOption_MachineGreyMetallic;
	
	@FindBy(how= How.XPATH, using="//label[@data-value='Jet-Black-Mica' and @data-test='radio-group-label']")
	public WebElement ColorOption_JetBlackMica;
	
	@FindBy(how= How.XPATH, using="//label[@data-value='Soul-Red-Metallic' and @data-test='radio-group-label']")
	public WebElement ColorOption_SoulRedMetallic;
	
	@FindBy(how= How.XPATH, using="//label[@data-value='Deep-Crystal-Blue-Mica' and @data-test='radio-group-label']")
	public WebElement ColorOption_DeepCrystalBlueMica;
	
	@FindBy(how= How.XPATH, using="//label[@data-value='Sonic-Silver-Metallic' and @data-test='radio-group-label']")
	public WebElement ColorOption_SonicSilverMetallic;
	
	@FindBy(how= How.XPATH, using="//label[@data-value='Titanium-Flash-Mica' and @data-test='radio-group-label']")
	public WebElement ColorOption_TitaniumFlashMica;
	
	@FindBy(how= How.XPATH, using="//label[@data-value='Snowflake-White-Pearl-Mica' and @data-test='radio-group-label']")
	public WebElement ColorOption_SnowflakeWhitePearlMica;
	
	@FindBy(how= How.XPATH, using="//label[@data-value='Eternal-Blue-Mica' and @data-test='radio-group-label']")
	public WebElement ColorOption_EternalBlueMica;
			
	@FindBy(how= How.XPATH, using="//div[@data-test='color-picker' and 'radio-group']/div[2]")
	public WebElement ColorOption_All;


	
	//=======Listing elements interacted on this page==========================
	
	// Method to check colour radio buttons
	public boolean verifyColourRadioButtons ()
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
	
	
	
	// Method to check Model Image Presense
	public boolean verifyModelImagePresense ()
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
	
	

	// Method to check Model Type Presense
	public boolean verifyModelType()
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
	
	
	
	// Method to check Model Tool tips
	public boolean verifyModelToolTips()
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
	
	
	
	// Method to check Number of Model Colour options
	public boolean verifyNumberOfColourRadioButtons()
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
	
	
	
	// Method to check Model Colour switching
	public boolean verifyModelColourSwitching()
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
	
	
	// Method to check Model Image changes with colour selection
		public boolean verifyModelImageChangesWithColourType()
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
		
		
		// Method to check Model body Type can be change
		public boolean verifyBodyTypeswitch()
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
		
		
		// Method to check Model Image changes with Body Type
		public boolean verifyModelImageChangesWithBodyType()
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

}
