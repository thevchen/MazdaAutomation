@tag
Feature: Mazda 3 page feature

@Test1	
Scenario: Mazda3 page UI tests
    Given I am on "cars/mazda3" page
   	Then Color radio buttons exists on the page
	And Model image is present on the page
	And Model body type exists on the page
	And Tool tip text on the page is:
	|	Radio-button | ToolTip-Text	|
	|	Gray	|	Machine Grey Metallic	|
	| Black	|	Jet Black Mica	|
	| Red	|	Soul Red Metallic	|
	|	Crystal-Blue	|	Deep Crystal Blue Mica	|
	|	Silver	|	Sonic Silver Metallic	|
	|	Titanium	|	Titanium Flash Mica	|
	|	White	|	Snowflake White Pearl Mica	|
	|	Eternal-Blue	|	Eternal Blue Mica	|
	And Total number of color switch radio buttons are 8
	And I see corresponding model image upon clicking each color
	When I click on body switch button "sedan"
	Then I see a model image for "sedan"

@Test2	
Scenario: Mazda3 page UI tests Compare models
    When I click on the compare our range 
	Then Model ranges Page loads
	When I select models "Mazda2" and "Mazda3" to compare
	When I click on the Compare Cars button
	And  select any options from drop down
	Then I see message "your price is on its way."
	
@Test3	
Scenario: Verify Gallery Grid and Image Overlay
    When I am on same page 
	Then Gallery grid exists on the page
	When I click on the any image
	Then image overlay is dsplyed
	Then I navigate back to Home page	
	
	
@Test4	
Scenario: Mazda3 page Cookie test
    When I am at Home Page 
	Then I navigates too Home page and request for cookie
	When I submit post code as "3145"
	And  retrieve postcode from cookie
	Then I see input postcode is same as "3145"

@Test5	
Scenario: Verify Price with reguler Expression
    Given I am navigate back "cars/mazda3#design" page
    When Select from trim "pure white leather"
	Then I see the Price 	
	
	