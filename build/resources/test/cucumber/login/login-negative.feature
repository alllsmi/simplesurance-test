Feature: login negative

Scenario: login negative
    Given user opens login page
    When user login as 'qwe@qwe.qwe', '1234qwer'
    Then user gets error 'Benutzername oder Passwort ungültig'