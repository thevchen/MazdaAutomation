package com.mazda.automation.StepDefs;

import java.io.IOException;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.mazda.automation.baseClass.BaseClass;
import com.mazda.automation.commUtils.CommonUtils;
import com.mazda.automation.pageObjects.CarlinesLandingPage;
import com.mazda.automation.pageObjects.CompareOurRange;

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
			driver.close();
			driver.quit();
			System.out.println("Browser Closed ++++++++++++++++++++++");

		}
	}

	@Given("^I am on \"(.*?)\" page$")
	public void i_am_on_page(String arg1) throws Throwable {
		CommonUtils page = PageFactory.initElements(driver, CommonUtils.class);
		
		driver = page.launchBrowser(driver, arg1);
		
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
	 //   throw new PendingException();
	}

	@Then("^Model ranges Page loads$")
	public void model_ranges_Page_loads() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//CompareOurRange CompareRangePage = PageFactory.initElements(driver, CompareOurRange.class);
		//    throw new PendingException();
	}

	@When("^I select any two models to compare$")
	public void i_select_any_two_models_to_compare() throws Throwable {
		CompareOurRange CompareRangePage = PageFactory.initElements(driver, CompareOurRange.class);
		
	  //  throw new PendingException();
	}

	@When("^select any options from drop down$")
	public void select_any_options_from_drop_down() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new PendingException();
	}

	@Then("^I see message \"(.*?)\"$")
	public void i_see_message(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new PendingException();
	}
	//==================
	

}
