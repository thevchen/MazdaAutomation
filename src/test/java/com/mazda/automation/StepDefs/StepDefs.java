package com.mazda.automation.StepDefs;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.mazda.automation.baseClass.BaseClass;
import com.mazda.automation.commUtils.CommonUtils;

import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefs extends BaseClass{

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
	}

	@Then("^Color radio buttons exists on the page$")
	public void color_radio_buttons_exists_on_the_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Model image is present on the page$")
	public void model_image_is_present_on_the_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Model body type exists on the page$")
	public void model_body_type_exists_on_the_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Tool tip text on the page is \"(.*?)\"$")
	public void tool_tip_text_on_the_page_is(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Total number of color switch radio buttons are (\\d+)$")
	public void total_number_of_color_switch_radio_buttons_are(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click on each color switch radio button$")
	public void i_click_on_each_color_switch_radio_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I see a model image for each color$")
	public void i_see_a_model_image_for_each_color() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click on body switch button \"(.*?)\"$")
	public void i_click_on_body_switch_button(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I see a model image for \"(.*?)\"$")
	public void i_see_a_model_image_for(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
