Feature: Acitime Login functinality

  Scenario: Validate actitime login functionality using valid username and password
    Given User is already in actitime login page
    When user enters username
    And enter password
    And click on login button
    Then verify actitime home page opened or not
    And close the browser

  Scenario: Validate actitime login functionality using valid credential
    Given User is already having valid url for actitime login page 'https://demo.actitime.com/login.do'
    When user enters username as 'admin'
    And enter password as 'manager'
    And click on login button
    Then verify that actitime page opened with title 'actiTIME - Enter Time-Track'
    And close the browser

  Scenario: Validate actitime login functionality using invalid credential
    Given User is already having valid url for actitime login page 'https://demo.actitime.com/login.do'
    When user enters username as 'admin'
    And enter password as 'manager123'
    And click on login button
    Then verify that actitime page opened with title 'actiTIME - Login'
    And close the browser

  Scenario Outline: Validate login functionality using <type> credential for actitime application
    Given User is already having valid url for actitime login page <url> for actitime application
    When user enters username as <username> in actitime application
    And enter password as <password> in actitime application
    And click on login button
    Then verify that actitime page opened with title <pagetitle> in actitime application
    And close the browser

    Examples: 
      | type    | url                                | username | password   | pagetitle                   |
      | valid   | https://demo.actitime.com/login.do | admin    | manager    | actiTIME - Enter Time-Track |
      | invalid | https://demo.actitime.com/login.do | admin    | manager123 | actiTIME - Login            |
      | invalid | https://demo.actitime.com/login.do | ""       | manager123 | actiTIME - Login            |
