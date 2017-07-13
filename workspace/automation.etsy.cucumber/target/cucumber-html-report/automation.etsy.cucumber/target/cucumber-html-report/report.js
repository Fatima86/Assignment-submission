$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("MySearch.feature");
formatter.feature({
  "line": 1,
  "name": "Test etsy.com",
  "description": "",
  "id": "test-etsy.com",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Test to search for a product from the drop-down menu",
  "description": "",
  "id": "test-etsy.com;test-to-search-for-a-product-from-the-drop-down-menu",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "John is viewing the Etsy landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "he searches for a product from the drop-down menu",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the result should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Dropdown_steps.John_is_viewing_the_Etsy_landing_page()"
});
formatter.result({
  "duration": 35257751997,
  "status": "passed"
});
formatter.match({
  "location": "Dropdown_steps.he_searches_for_a_product_from_the_drop_down_menu()"
});
formatter.result({
  "duration": 31652315002,
  "status": "passed"
});
formatter.match({
  "location": "Dropdown_steps.the_result_should_be_displayed()"
});
formatter.result({
  "duration": 51774104188,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Test to search for an product Icon",
  "description": "",
  "id": "test-etsy.com;test-to-search-for-an-product-icon",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "John is viewing the Etsy landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "he searches for a product icon",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "the result product should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Dropdown_steps.John_is_viewing_the_Etsy_landing_page()"
});
formatter.result({
  "duration": 22664233614,
  "status": "passed"
});
formatter.match({
  "location": "Click_Icon.he_searches_for_a_product_icon()"
});
formatter.result({
  "duration": 25078649253,
  "status": "passed"
});
formatter.match({
  "location": "Click_Icon.the_result_product_should_be_displayed()"
});
formatter.result({
  "duration": 20979143119,
  "status": "passed"
});
});