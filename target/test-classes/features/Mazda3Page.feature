@tag
Feature: Mazda 3 page feature
	Background:
	Given I am on "cars/mazda3" page

@Test1	
Scenario: Mazda3 page UI tests
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
Scenario: Mazda3 page UI tests Compare Ranges
	When I click on the compare our range
	Then Model ranges Page loads
	When I select models "Mazda2" and "Mazda3" to compare
	And  select any options from drop down
	Then I see message "YOUR PRICE IS ON ITS WAY."