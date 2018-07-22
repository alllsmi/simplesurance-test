Feature: login positive

Scenario: login positive
    Given user opens login page
    When user login as 'allsmi@gmail.com', '1234qwer'
    Then user is successfully logged in