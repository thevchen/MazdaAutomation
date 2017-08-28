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



public class CarlinesLandingPage extends BaseClass{
	
	String baseURLL = "https://www.mazda.com.au/";

	//=======Listing elements interacted on this page==========================

	// Radio buttton Identifications
	@FindBy(xpath="//label[@data-value='Machine-Grey-Metallic' and @data-test='radio-group-label']")
	public WebElement colorOption_MachineGreyMetallic;
	
	@FindBy(xpath="//label[@data-value='Machine-Grey-Metallic' and @data-test='radio-group-label']//span[@data-test='bubble-span']")
	public WebElement colorOption_MachineGreyMetallicToolTipText;
	
	
	@FindBy(xpath="//label[@data-value='Jet-Black-Mica' and @data-test='radio-group-label']")
	public WebElement colorOption_JetBlackMica;
	
	@FindBy(xpath="//label[@data-value='Jet-Black-Mica' and @data-test='radio-group-label']//span[@data-test='bubble-span']")
	public WebElement colorOption_JetBlackMicaToolTipText;
	
	@FindBy(xpath="//label[@data-value='Soul-Red-Metallic' and @data-test='radio-group-label']")
	public WebElement colorOption_SoulRedMetallic;
	
	@FindBy(xpath="//label[@data-value='Soul-Red-Metallic' and @data-test='radio-group-label']//span[@data-test='bubble-span']")
	public WebElement colorOption_SoulRedMetallicToolTipText;
	
	@FindBy(xpath="//label[@data-value='Deep-Crystal-Blue-Mica' and @data-test='radio-group-label']")
	public WebElement colorOption_DeepCrystalBlueMica;
	
	@FindBy(xpath="//label[@data-value='Deep-Crystal-Blue-Mica' and @data-test='radio-group-label']//span[@data-test='bubble-span']")
	public WebElement colorOption_DeepCrystalBlueMicaToolTipText;
	
	@FindBy(xpath="//label[@data-value='Sonic-Silver-Metallic' and @data-test='radio-group-label']")
	public WebElement colorOption_SonicSilverMetallic;
	
	@FindBy(xpath="//label[@data-value='Sonic-Silver-Metallic' and @data-test='radio-group-label']//span[@data-test='bubble-span']")
	public WebElement colorOption_SonicSilverMetallicToolTipText;
	
	@FindBy(xpath="//label[@data-value='Titanium-Flash-Mica' and @data-test='radio-group-label']")
	public WebElement colorOption_TitaniumFlashMica;
	
	@FindBy(xpath="//label[@data-value='Titanium-Flash-Mica' and @data-test='radio-group-label']//span[@data-test='bubble-span']")
	public WebElement colorOption_TitaniumFlashMicaToolTipText;
	
	@FindBy(xpath="//label[@data-value='Snowflake-White-Pearl-Mica' and @data-test='radio-group-label']")
	public WebElement colorOption_SnowflakeWhitePearlMica;
	
	@FindBy(xpath="//label[@data-value='Snowflake-White-Pearl-Mica' and @data-test='radio-group-label']//span[@data-test='bubble-span']")
	public WebElement colorOption_SnowflakeWhitePearlMicaToolTipText;
	
	@FindBy(xpath="//label[@data-value='Eternal-Blue-Mica' and @data-test='radio-group-label']")
	public WebElement colorOption_EternalBlueMica;
	
	@FindBy(xpath="//label[@data-value='Eternal-Blue-Mica' and @data-test='radio-group-label']//span[@data-test='bubble-span']")
	public WebElement colorOption_EternalBlueMicaToolTipText;
			
	@FindBy(xpath="//div[@data-test='color-picker' and 'radio-group']/div[2]")
	public WebElement colorOption_All;
	
	@FindBy(xpath="//div[@data-test='color-picker' and 'radio-group']/div[2]/div[2]//label")
	public List<WebElement> colorOption_AllList;

	@FindBy(xpath="//img[@data-reactid='121']")
	public WebElement modelImage;
	
	@FindBy(xpath="//div[@data-reactid='8']//div[@data-test='radio-group']")
	public WebElement modelBodyType;
	
	@FindBy(xpath="//div[@data-test='toast-close']")
	public WebElement locationPopUPCloseButton;
	
	@FindBy(xpath="//div[@data-test='toast-popup']")
	public WebElement locationPopUP;
	
	@FindBy(xpath="//label[@data-reactid=17]")
	public WebElement sedanBodySwitch;
	
	@FindBy(xpath="//a[contains(.,'Compare our range')]")
	public WebElement compareRangeButton;
	
	@FindBy(xpath="//a[contains(.,'Compare our range')]")
	public WebElement TrimPureWhiteLeather;
	
	@FindBy(xpath="//div[contains(.,'Starting from $')]")
	public WebElement TrimPricelabel;
	

	
	
	
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
