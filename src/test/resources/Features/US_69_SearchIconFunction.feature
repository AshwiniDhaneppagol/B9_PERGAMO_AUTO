@B9PR-69 @B9PR-3
Feature: Search Icon function

  Background:
    Given User is in Pergamo application Homepage
    When User click on Einloggen Icon in the Pergamo homepage.
    And User enters valid email and password as "TestAccount@gmail.com" and "Test@1234"
    And User click on ANMELDUNG button.

  @B9PR-60
  Scenario: Verify that the product is displayed when the user searches for the item on the website
    When User enter product name in search box
    And User click on search button
    Then User should see search "results found" for the product.

  @B9PR-61
  Scenario: Verify that the message "0 Results found " is displayed when the user searches for the item that is not on the website.
    When User enter product name in search box which is not their in website
    And User click on search button
    Then User should see search "0 results found" for the product.

  @B9PR-62
  Scenario: Verify that the user should not be able to confirm or search when search engine is blank.
    When User keep search box empty
    And User click on search button
    Then User should be in the homepage of the application "https://pergamo.eu/"