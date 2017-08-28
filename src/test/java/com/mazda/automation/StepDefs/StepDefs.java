package com.mazda.automation.StepDefs;

import java.io.IOException;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.mazda.automation.baseClass.BaseClass;
import com.mazda.automation.commUtils.CommonUtils;
import com.mazda.automation.pageObjects.CarlinesLandingPage;
import com.mazda.automation.pageObjects.CompareOurRange;
import com.mazda.automation.pageObjects.HomePage;
import com.mazda.automation.commUtils.CommonUtils;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefs extends BaseClass {

	static WebDriver driver;
	private Scenario scenario;
	
	@Before
	public void before(Scenario scenario) {
		this.scenario = scenario;
	}

	@After()
	public void afterScenario(Scenario scenario) throws IOException, InterruptedException {
		if (scenario.isFailed()) {
			try {
				capturescreenshot(driver, scenario.getName());
			} catch (Exception e) {
				e.printStackTrace();
			}

			// Embedding screenshot in the cucumber report
			if (driver instanceof TakesScreenshot) {
				TakesScreenshot camera = (TakesScreenshot) driver;
				byte[] screenshot = camera.getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot, "image/png");
			}
		}
		if (driver != null) {
		//	driver.close();
		//	driver.quit();
			System.out.println("Browser Closed ++++++++++++++++++++++");

		}
	}

	@Given("^I am on \"(.*?)\" page$")
	public void i_am_on_page(String arg1) throws Throwable {
		CommonUtils page = PageFactory.initElements(driver, CommonUtils.class);
		
		driver = page.launchBrowser(driver, arg1);
		//driver.manage().deleteAllCookies();
		//closing location popup
		CarlinesLandingPage LandingPage = PageFactory.initElements(driver, CarlinesLandingPage.class);
		boolean isDisplayed = waitForElementToBeDisplayed(LandingPage.locationPopUP, 3, driver);
		if (isDisplayed) {
			waitAndClick(LandingPage.locationPopUPCloseButton, 1, driver, "Location popup close button");
		}
	}

	@Then("^Color radio buttons exists on the page$")
	public void color_radio_buttons_exists_on_the_page() throws Throwable {
		CarlinesLandingPage LandingPage = PageFactory.initElements(driver, CarlinesLandingPage.class);
		boolean isDisplayed = waitForElementToBeDisplayed(LandingPage.colorOption_All, 2, driver);
		Assert.assertTrue(
				"Verify Colour Radio Buttons test failed - Color radio buttons are not displaying on the page. URL: "
						+ driver.getCurrentUrl(),
				isDisplayed);
	}

	@Then("^Model image is present on the page$")
	public void model_image_is_present_on_the_page() throws Throwable {
		CarlinesLandingPage LandingPage = PageFactory.initElements(driver, CarlinesLandingPage.class);
		boolean isDisplayed = waitForElementToBeDisplayed(LandingPage.modelImage, 2, driver);
		Assert.assertTrue("Verify Model Image Presense test failed - Model image is not displaying. URL: "
				+ driver.getCurrentUrl(), isDisplayed);
	}

	@Then("^Model body type exists on the page$")
	public void model_body_type_exists_on_the_page() throws Throwable {
		CarlinesLandingPage LandingPage = PageFactory.initElements(driver, CarlinesLandingPage.class);
		boolean isDisplayed = waitForElementToBeDisplayed(LandingPage.modelBodyType, 2, driver);
		Assert.assertTrue("Verify Model Type test failed - Model body type is not displaying on the page. URL: "
				+ driver.getCurrentUrl(), isDisplayed);
	}

	@Then("^Tool tip text on the page is:$")
	public void tool_tip_text_on_the_page_is(DataTable arg1) throws Throwable {
		CarlinesLandingPage LandingPage = PageFactory.initElements(driver, CarlinesLandingPage.class);
		for (Map<String, String> data : arg1.asMaps(String.class, String.class)) {
			boolean isToolTipTextMatching;
			if (data.get("Radio-button").contains("Gray")) {
				String actualToolTipText = LandingPage.colorOption_MachineGreyMetallicToolTipText
						.getAttribute("innerHTML");
				isToolTipTextMatching = actualToolTipText.equalsIgnoreCase(data.get("ToolTip-Text"));
				Assert.assertTrue("Tool Tip text for Gray color is not matching. Actual: " + actualToolTipText
						+ " Expected: " + data.get("ToolTip-Text"), isToolTipTextMatching);
			} else if (data.get("Radio-button").contains("Black")) {
				String actualToolTipText = LandingPage.colorOption_JetBlackMicaToolTipText.getAttribute("innerHTML");
				isToolTipTextMatching = actualToolTipText.equalsIgnoreCase(data.get("ToolTip-Text"));
				Assert.assertTrue("Tool Tip text for Black color is not matching. Actual: " + actualToolTipText
						+ " Expected: " + data.get("ToolTip-Text"), isToolTipTextMatching);
			} else if (data.get("Radio-button").contains("Red")) {
				String actualToolTipText = LandingPage.colorOption_SoulRedMetallicToolTipText.getAttribute("innerHTML");
				isToolTipTextMatching = actualToolTipText.equalsIgnoreCase(data.get("ToolTip-Text"));
				Assert.assertTrue("Tool Tip text for Red color is not matching. Actual: " + actualToolTipText
						+ " Expected: " + data.get("ToolTip-Text"), isToolTipTextMatching);
			} else if (data.get("Radio-button").contains("Crystal-Blue")) {
				String actualToolTipText = LandingPage.colorOption_DeepCrystalBlueMicaToolTipText
						.getAttribute("innerHTML");
				isToolTipTextMatching = actualToolTipText.equalsIgnoreCase(data.get("ToolTip-Text"));
				Assert.assertTrue("Tool Tip text for Crystal-Blue color is not matching. Actual: " + actualToolTipText
						+ " Expected: " + data.get("ToolTip-Text"), isToolTipTextMatching);
			} else if (data.get("Radio-button").contains("Silver")) {
				String actualToolTipText = LandingPage.colorOption_SonicSilverMetallicToolTipText
						.getAttribute("innerHTML");
				isToolTipTextMatching = actualToolTipText.equalsIgnoreCase(data.get("ToolTip-Text"));
				Assert.assertTrue("Tool Tip text for Silver color is not matching. Actual: " + actualToolTipText
						+ " Expected: " + data.get("ToolTip-Text"), isToolTipTextMatching);
			} else if (data.get("Radio-button").contains("Titanium")) {
				String actualToolTipText = LandingPage.colorOption_TitaniumFlashMicaToolTipText
						.getAttribute("innerHTML");
				isToolTipTextMatching = actualToolTipText.equalsIgnoreCase(data.get("ToolTip-Text"));
				Assert.assertTrue("Tool Tip text for Titanium color is not matching. Actual: " + actualToolTipText
						+ " Expected: " + data.get("ToolTip-Text"), isToolTipTextMatching);
			} else if (data.get("Radio-button").contains("White")) {
				String actualToolTipText = LandingPage.colorOption_SnowflakeWhitePearlMicaToolTipText
						.getAttribute("innerHTML");
				isToolTipTextMatching = actualToolTipText.equalsIgnoreCase(data.get("ToolTip-Text"));
				Assert.assertTrue("Tool Tip text for Titanium color is not matching. Actual: " + actualToolTipText
						+ " Expected: " + data.get("ToolTip-Text"), isToolTipTextMatching);
			} else if (data.get("Radio-button").contains("Eternal-Blue")) {
				String actualToolTipText = LandingPage.colorOption_EternalBlueMicaToolTipText.getAttribute("innerHTML");
				isToolTipTextMatching = actualToolTipText.equalsIgnoreCase(data.get("ToolTip-Text"));
				Assert.assertTrue("Tool Tip text for Titanium color is not matching. Actual: " + actualToolTipText
						+ " Expected: " + data.get("ToolTip-Text"), isToolTipTextMatching);
			} else {
				Assert.fail("Invalid color option in feature file: " + data.get("Radio-button"));
			}
		}

	}

	@Then("^Total number of color switch radio buttons are (\\d+)$")
	public void total_number_of_color_switch_radio_buttons_are(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		CarlinesLandingPage LandingPage = PageFactory.initElements(driver, CarlinesLandingPage.class);
		int actualNumber = LandingPage.colorOption_AllList.size();
		System.out.println(" Actual number of colors:  "+actualNumber);
		Assert.assertTrue(
				"Verify Number Of Colour Radio Buttons test failed -Total number of color options displaying on the page not matching with expected. Actual number: "
						+ actualNumber + " Expected: " + arg1 + " On URL: "
						+ driver.getCurrentUrl(),actualNumber==arg1
				);
	}

	@Then("^I see corresponding model image upon clicking each color$")
	public void i_click_on_each_color_switch_radio_button() throws Throwable {
		CarlinesLandingPage LandingPage = PageFactory.initElements(driver, CarlinesLandingPage.class);
		String clickedColor = null;
		String modelImageSrc = null;
		for (int i = 0; i < LandingPage.colorOption_AllList.size(); i++) {
			//JS executor was giving problems hence using simple Selenium click in this case
			LandingPage.colorOption_AllList.get(i).click();
			clickedColor = LandingPage.colorOption_AllList.get(i).getAttribute("data-value");
			modelImageSrc = LandingPage.modelImage.getAttribute("src");
			if (clickedColor.equalsIgnoreCase("Machine-Grey-Metallic")) {
				Assert.assertTrue("Correct model image not showing for color: "+clickedColor+ " On URL: "+driver.getCurrentUrl(), modelImageSrc.contains("machine-grey-mica"));
			} else if (clickedColor.equalsIgnoreCase("Sonic-Silver-Metallic")) {
				Assert.assertTrue("Correct model image not showing for color: "+clickedColor+ " On URL: "+driver.getCurrentUrl(), modelImageSrc.contains("snoic-silver-metallic"));
			}
			
			else {
				Assert.assertTrue("Correct model image not showing for color: "+clickedColor+ " On URL: "+driver.getCurrentUrl(), modelImageSrc.toLowerCase().contains(clickedColor.toLowerCase()));
			}
			Thread.sleep(500);
		}
	}

	@When("^I click on body switch button \"(.*?)\"$")
	public void i_click_on_body_switch_button(String arg1) throws Throwable {
		CarlinesLandingPage LandingPage = PageFactory.initElements(driver, CarlinesLandingPage.class);
		LandingPage.sedanBodySwitch.click();
	}

	@Then("^I see a model image for \"(.*?)\"$")
	public void i_see_a_model_image_for(String arg1) throws Throwable {
		CarlinesLandingPage LandingPage = PageFactory.initElements(driver, CarlinesLandingPage.class);
		String modelImageSrc = LandingPage.modelImage.getAttribute("src");
		Assert.assertTrue("Correct model image for body type is not showing for body type: "+arg1, modelImageSrc.toLowerCase().contains(arg1.toLowerCase()));
		
	}
	
	
//Test case 2
	
	@When("^I click on the compare our range$")
	public void i_click_on_the_compare_our_range() throws Throwable {
		CarlinesLandingPage LandingPage = PageFactory.initElements(driver, CarlinesLandingPage.class);
		LandingPage.compareRangeButton.click();
	 
	}

	@Then("^Model ranges Page loads$")
	public void model_ranges_Page_loads() throws Throwable {
	   	CompareOurRange CompareRangePage = PageFactory.initElements(driver, CompareOurRange.class);
	    Assert.assertTrue("Model ranges Page is not loading properly : ", driver.getTitle().toLowerCase().contains("Mazda".toLowerCase()));
	}

	@When("^I select models \"(.*?)\" and \"(.*?)\" to compare$")
	public void i_select_models_and_to_compare(String arg1, String arg2) throws Throwable {
		CompareOurRange CompareRangePage = PageFactory.initElements(driver, CompareOurRange.class);
		CommonUtils page = PageFactory.initElements(driver, CommonUtils.class);
		// Using this to avoid react ID in model selection
		//driver.navigate().to(page.GetbaseURL()+"compare/?cars="+arg1+","+arg2);
		
		Assert.assertTrue("Model range   "+arg1+"  Page is not loading properly : ", BaseClass.waitAndClick(CompareRangePage.compareOurRangeModelMazda2, 10, driver, arg1));
		Assert.assertTrue("Model range   "+arg2+"  Page is not loading properly : ", BaseClass.waitAndClick(CompareRangePage.compareOurRangeModelMazda3, 10, driver, arg1));
		
	}

	
	@When("^I click on the Compare Cars button$")
	public void i_click_on_the_Compare_Cars_button() throws Throwable {
		CompareOurRange CompareRangePage = PageFactory.initElements(driver, CompareOurRange.class);
		Assert.assertTrue("Model range compare care button is not loading properly : ", BaseClass.waitAndClick(CompareRangePage.compareCarButton, 10, driver, "Compare Car Button"));
	}
	
	
	@When("^select any options from drop down$")
	public void select_any_options_from_drop_down() throws Throwable {
		CompareOurRange CompareRangePage = PageFactory.initElements(driver, CompareOurRange.class);
		Assert.assertTrue("Model Grade Selection Left Dropdown is not loading properly : ", BaseClass.waitAndClick(CompareRangePage.modelGradeSelectionLeft, 10, driver, "Model Grade Selection Left Dropdown"));
		// React Component re load the new DOM and object changes, thus using Key press event
		CompareRangePage.enterKey();
		Assert.assertTrue("Model Grade Selection Right Dropdown is not loading properly : ", BaseClass.waitAndClick(CompareRangePage.modelGradeSelectionRight, 10, driver, "Model Grade Selection Right Dropdown"));
		CompareRangePage.enterKey();
		
	}

	@Then("^I see message \"(.*?)\"$")
	public void i_see_message(String arg1) throws Throwable {
	  	CompareOurRange CompareRangePage = PageFactory.initElements(driver, CompareOurRange.class);
		Assert.assertTrue("Model ranges Page Your price is on its way Verification failed : ", CompareRangePage.modelPricelabel.getText().toLowerCase().contains(arg1.toLowerCase()));

	}
	
	
	// Tc3
	
	@When("^I am on same page$")
	public void i_am_on_same_page() throws Throwable {
	    // Do nothing
		CompareOurRange CompareRangePage = PageFactory.initElements(driver, CompareOurRange.class);
		Assert.assertTrue("Model Grade Selection Compare Range Page model Restart Button is not loading properly : ", BaseClass.waitAndClick(CompareRangePage.modelRestart, 10, driver, "Compare Range Page model Restart Button"));
	  
	}

	@Then("^Gallery grid exists on the page$")
	public void CompareRangePage() throws Throwable {
		CompareOurRange CompareRangePage = PageFactory.initElements(driver, CompareOurRange.class);
		Assert.assertTrue("Model Ranges Page models Grid images are not loading properly : ", CompareRangePage.GalleryGridTxt.isDisplayed());
	}

	@When("^I click on the any image$")
	public void i_click_on_the_any_image() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //Need to used ID
		CompareOurRange CompareRangePage = PageFactory.initElements(driver, CompareOurRange.class);
	}

	@Then("^image overlay is dsplyed$")
	public void image_overlay_is_dsplyed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		CompareOurRange CompareRangePage = PageFactory.initElements(driver, CompareOurRange.class);
	}

	@Then("^I navigate back to Home page$")
	public void i_navigate_back_to_Home_page() throws Throwable {
	    HomePage HomePageLanding = PageFactory.initElements(driver, HomePage.class);
	    driver.manage().deleteAllCookies();
	    HomePageLanding.MazdaLogoImg.click();
		CommonUtils page = PageFactory.initElements(driver, CommonUtils.class);
		driver.manage().deleteAllCookies();
		driver.close();
		driver = page.launchBrowser(driver, "");
		
	}

	
		
	//Tc4
	@When("^I am at Home Page$")
	public void i_am_at_Home_Page() throws Throwable {
	 
		HomePage HomePageLanding = PageFactory.initElements(driver, HomePage.class);
		//CommonUtils page = PageFactory.initElements(driver, CommonUtils.class);
		//driver.manage().deleteAllCookies();
		//driver = page.launchBrowser(driver, "");
		boolean isDisplayed = waitForElementToBeDisplayed(HomePageLanding.locationPopUP, 3, driver);
		//closing location popup
				if (isDisplayed) {
		//	waitAndClick(HomePageLanding.locationPopUPCloseButton, 1, driver, "Location popup close button");
		}
	}
	
	

	@Then("^I navigates too Home page and request for cookie$")
	public void i_navigates_too_Home_page_and_request_for_cookie() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^I submit post code as \"(.*?)\"$")
	public void i_submit_post_code_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		HomePage HomePageLanding = PageFactory.initElements(driver, HomePage.class);
		HomePageLanding.locationPopUPPostCodeText.sendKeys(arg1);
		Assert.assertTrue("Home page Location PopUp Submit button is not working properly : ", BaseClass.waitAndClick(HomePageLanding.locationPopUPPostSubmitButton, 10, driver, "Submit Button"));
	   
	}

	@When("^retrieve postcode from cookie$")
	public void retrieve_postcode_from_cookie() throws Throwable {
	    // Get Cookie value from Browser
	    Cookie t = driver.manage().getCookieNamed("postcode");
	    if(t!=null){
	    String s1 = t.getValue();
	    System.out.println("The Cookie value is : " + s1);
	               }
		
	}

	@Then("^I see input postcode is same as \"(.*?)\"$")
	public void i_see_input_postcode_is_same_as(String arg1) throws Throwable {
		Assert.assertTrue("Home page stored postcode Cookie Verification failed : ", driver.manage().getCookieNamed("postcode").getValue().equalsIgnoreCase(arg1));
	  
	}
	
	
	//TC5
	
	@Given("^I am navigate back \"(.*?)\" page$")
	public void i_am_navigate_back_page(String arg1) throws Throwable {
	 	CommonUtils page = PageFactory.initElements(driver, CommonUtils.class);
		driver.navigate().to(page.GetbaseURL()+arg1);
	}

	@When("^Select from trim \"(.*?)\"$")
	public void select_from_trim(String arg1) throws Throwable {
		CarlinesLandingPage LandingPage = PageFactory.initElements(driver, CarlinesLandingPage.class);
		Assert.assertTrue("Model mazda 3 page Trim :"+arg1+" is not loading properly : ", BaseClass.waitAndClick(LandingPage.TrimPureWhiteLeather, 10, driver, arg1));
		
	}

	@Then("^I see the Price$")
	public void i_see_the_Price() throws Throwable {
		CarlinesLandingPage LandingPage = PageFactory.initElements(driver, CarlinesLandingPage.class);
		System.out.println("Trim Price is displayed"+LandingPage.TrimPricelabel.isDisplayed());
	}

		

}
