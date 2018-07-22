Feature: login positive

Scenario: login positive
    Given user opens login page
    #Here should be set valid account data
    When user login as 'testuser1907@sisu.com', '1q2w3e4r'
    Then user is successfully logged in