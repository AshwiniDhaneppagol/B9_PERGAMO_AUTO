Feature: User login functionality

  Background:
    Given User is in Pergamo application Homepage
    When User click on Einloggen Icon in the Pergamo homepage.

  Scenario: User can log in by entering the correct information
    And User enters valid email and password as "TestAccount@gmail.com" and "Test@1234"
    And User click on ANMELDUNG button.
    Then "ORDER HISTORY" page should be displayed.

  Scenario Outline: Error message is displayed when the user incorrectly fills in or does not fill in the required field.
    When  User enter invalid or empty data in "<email>" and "<password>"
    And User click on ANMELDUNG button.
    Then "ORDER HISTORY" page should not be displayed.
    Examples:
      | email                 | password    |
      | TestAccount@gmail.com | Test@       |
      | TestAccount@gmail     | Test@1234   |
      | TestAccount@          | Test@1234   |
      | TestAccount@gmail.com |             |
      |                       | Test@1234   |

