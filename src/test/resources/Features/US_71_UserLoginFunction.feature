Feature: User login functionality

  Background:
    Given User is in Pergamo application Homepage
    When User click on Einloggen Icon in the Pergamo homepage.

  Scenario: User can log in by entering the correct information
    And User enters valid email and password as "TestAccount@gmail.com" and "Test@1234"
    And User click on ANMELDUNG button.
    Then "ORDER HISTORY" page should be displayed.

  Scenario Outline: Error message is displayed when the user incorrectly fills in or does not fill in the required field.
    And  User enter invalid or empty data in "<email>" and "<password>"
    And User click on ANMELDUNG button.
    Then The user should be able to see "<error>" message

    Examples:
      | email                 | password    | error                                                                 |
      | TestAccount@          | Test@1234   | Please enter a part following '@'. 'TestAccount@' is incomplete.      |
      |                       |             | Please fill out this field.                                           |
      | Test                  | userone1234 | Please include an '@' in the email address. 'Test' is missing an '@'. |
      | TestAccount@gmail.com | Test@       | Please fill out this field.                                           |

