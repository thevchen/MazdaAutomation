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
  "duration": 18606760,
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
  "duration": 20359030232,
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
  "name": "Tool tip text on the page is:",
  "rows": [
    {
      "cells": [
        "Radio-button",
        "ToolTip-Text"
      ],
      "line": 12
    },
    {
      "cells": [
        "Gray",
        "Machine Grey Metallic"
      ],
      "line": 13
    },
    {
      "cells": [
        "Black",
        "Jet Black Mica"
      ],
      "line": 14
    },
    {
      "cells": [
        "Red",
        "Soul Red Metallic"
      ],
      "line": 15
    },
    {
      "cells": [
        "Crystal-Blue",
        "Deep Crystal Blue Mica"
      ],
      "line": 16
    },
    {
      "cells": [
        "Silver",
        "Sonic Silver Metallic"
      ],
      "line": 17
    },
    {
      "cells": [
        "Titanium",
        "Titanium Flash Mica"
      ],
      "line": 18
    },
    {
      "cells": [
        "White",
        "Snowflake White Pearl Mica"
      ],
      "line": 19
    },
    {
      "cells": [
        "Eternal-Blue",
        "Eternal Blue Mica"
      ],
      "line": 20
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Total number of color switch radio buttons are 8",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I see corresponding model image upon clicking each color",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I click on body switch button \"sedan\"",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "I see a model image for \"sedan\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefs.color_radio_buttons_exists_on_the_page()"
});
formatter.result({
  "duration": 94389502,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs.model_image_is_present_on_the_page()"
});
formatter.result({
  "duration": 77127733,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs.model_body_type_exists_on_the_page()"
});
formatter.result({
  "duration": 97160256,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs.tool_tip_text_on_the_page_is(DataTable)"
});
formatter.result({
  "duration": 383898745,
  "status": "passed"
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
  "duration": 49050696,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs.i_click_on_each_color_switch_radio_button()"
});
formatter.result({
  "duration": 6671023684,
  "status": "passed"
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
  "duration": 197668710,
  "status": "passed"
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
  "duration": 32135663,
  "status": "passed"
});
formatter.after({
  "duration": 1071408172,
  "status": "passed"
});
});