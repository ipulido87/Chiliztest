Feature: Search for Books on Maltapark

Scenario: Search for a specific book on Maltapark

  Given I am on the Maltapark website
  When I click on the "All Classifieds" dropdown
  And I select "Books" from the dropdown
  And I enter "Computer" in the search area
  And I click the search button
  Then I should see the description and price of the first item in the list

