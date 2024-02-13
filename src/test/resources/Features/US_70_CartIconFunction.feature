@B9PR-70
Feature: Cart Icon function
  Background:
    Given User is in Pergamo application Homepage
    When User enter product name in search box
    And User click on search button
    And User hover over on product
    And User click on IN DEN WARENKORB button
    And User closes WARENKORB page
    And User click on cart icon in the homepage
    # Uncomment line no 7,8,9 to execute test cas after user login
#    When User click on Einloggen Icon in the Pergamo homepage.
#    And User enters valid email and password as "TestAccount@gmail.com" and "Test@1234"
#    And User click on ANMELDUNG button.

  @B9PR-95 @B9PR-70
  Scenario: Verify that the user can see product details in the Cart
    Then User should see product description

  @B9PR-97 @B9PR-70
  Scenario: Verify that the user can see product photos in the Cart
    Then User should see product photo

  @B9PR-98 @B9PR-70
  Scenario: Verify that the user can select product quantity in the cart
    And User can increase product quantity in cart
    Then product Quantity should be increased by one
    And User can decrease product quantity in cart
    Then product Quantity should be decreased by one

  @B9PR-99 @B9PR-70
  Scenario: Verify that the user can remove product from the cart
    And User click on remove product button

  @B9PR-100 @B9PR-70
  Scenario: Verify that the user should be able to see Total price of products in the cart
    Then Product total price should be displayed

  @B9PR-101 @B9PR-70
  Scenario: Verify that the user should be able to go to "KASSE" from cart function
    And User check the Ich stimme den checkbox
    And User click on the KASSE button
    Then Express checkout page should be displayed