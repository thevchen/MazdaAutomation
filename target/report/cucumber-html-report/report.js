$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Mazda3Page.feature");
formatter.feature({
  "line": 2,
  "name": "Mazda 3 page feature",
  "description": "",
  "id": "mazda-3-page-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.before({
  "duration": 16470570,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I am on \"cars/mazda3\" page",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "cars/mazda3",
      "offset": 9
    }
  ],
  "location": "StepDefs.i_am_on_page(String)"
});
formatter.result({
  "duration": 33232802268,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Mazda3 page UI tests",
  "description": "",
  "id": "mazda-3-page-feature;mazda3-page-ui-tests",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@Test1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Color radio buttons exists on the page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Model image is present on the page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Model body type exists on the page",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Tool tip text on the page is \"Sample text\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Total number of color switch radio buttons are 8",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on each color switch radio button",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I see a model image for each color",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I click on body switch button \"sedan\"",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I see a model image for \"sedan\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefs.color_radio_buttons_exists_on_the_page()"
});
formatter.result({
  "duration": 2193310,
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat com.mazda.automation.StepDefs.StepDefs.color_radio_buttons_exists_on_the_page(StepDefs.java:64)\r\n\tat ✽.Then Color radio buttons exists on the page(Mazda3Page.feature:8)\r\n",
  "status": "pending"
});
formatter.match({
  "location": "StepDefs.model_image_is_present_on_the_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefs.model_body_type_exists_on_the_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Sample text",
      "offset": 30
    }
  ],
  "location": "StepDefs.tool_tip_text_on_the_page_is(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "8",
      "offset": 47
    }
  ],
  "location": "StepDefs.total_number_of_color_switch_radio_buttons_are(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefs.i_click_on_each_color_switch_radio_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefs.i_see_a_model_image_for_each_color()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "sedan",
      "offset": 31
    }
  ],
  "location": "StepDefs.i_click_on_body_switch_button(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "sedan",
      "offset": 25
    }
  ],
  "location": "StepDefs.i_see_a_model_image_for(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1890066339,
  "status": "passed"
});
});