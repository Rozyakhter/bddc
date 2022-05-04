Feature: I want to login orangeHrm page

  @withOutParam
  Scenario: orangeHrm login
    Given I want to logIn orangeHrm page
    And I want to maximize the window
    And I have to put correct Id
    When I have to put correct password
    And click logIn button
    Then close the browser

  @withParam
  Scenario Outline: orangeHrm login
    Given I want to logIn orangeHrm page
    And I want to maximize the window
    And User has to put his correct <Id>
    When User has to put her correct <password>
    And click logIn button
    Then close the browser

    Examples: 
      | Id    |  | password |
      | Admin |  | admin123 |
