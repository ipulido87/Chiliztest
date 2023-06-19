$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/SearchBooks.feature");
formatter.feature({
  "name": "Search for Books on Maltapark",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Search for a specific book on Maltapark",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am on the Maltapark website",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.SearchBooks.i_am_on_the_maltapark_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the \"All Classifieds\" dropdown",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.SearchBooks.i_click_on_the_dropdown(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select \"Books\" from the dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.SearchBooks.i_select_from_the_dropdown(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter \"Computer\" in the search area",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.SearchBooks.i_enter_in_the_search_area(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click the search button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.SearchBooks.i_click_the_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see the description and price of the first item in the list",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.SearchBooks.i_should_see_the_description_and_price_of_the_first_item_in_the_list()"
});
formatter.result({
  "status": "passed"
});
});