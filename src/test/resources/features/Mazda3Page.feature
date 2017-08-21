@tag
Feature: Mazda 3 page feature
	Background:
	Given I am on "cars/mazda3" page

@Test1	
Scenario: Mazda3 page UI tests
	Then Color radio buttons exists on the page
	And Model image is present on the page
	And Model body type exists on the page
	And Tool tip text on the page is "Sample text"
	And Total number of color switch radio buttons are 8
	When I click on each color switch radio button
	Then I see a model image for each color
	When I click on body switch button "sedan"
	Then I see a model image for "sedan"
