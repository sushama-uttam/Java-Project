Feature: Testing actitime application

  Scenario: Testing actitime login functionality for valid user
    Given User is already having application URL
    And also having username and password
    When user enter the username and password
    And clicks on login button
    Then Actitime home page will be displayed
    And close the browser
    
  Scenario Outline: Testing actitime login functionality for <user> <username> <password>
    Given User is already having application URL as <url>
    And also having username as <username> and password as <password> for the application
    When user enter the username and password
    And clicks on login button
    Then Actitime home page will be displayed with the application title as <title>
    And close the browser

    Examples: 
      | user    | url                        | username | password  | title                       |
      | valid   | https://demo.actitime.com/ | admin    | manager   | actiTIME - Enter Time-Track |
      | invalid | https://demo.actitime.com/ | admin12  | manager   | actiTIME - Login            |
      | invalid | https://demo.actitime.com/ | admin    | manager23 | actiTIME - Login            |

   Scenario: Create new task in actitime application and verify that is created or not
   Given User is already having application URL
    And also having username and password
    And user enter the username and password
    And clicks on login button
    When user clicks on task tab
    And click on add new button and select new task option
    And select company from company dropdown
    And select project from project dropdown
    And enter task name, deadline and select type of work
    And click on create task button
    Then verify that newly create task is present in task page or not
    And logout from the application
    And close the browser
   
   Scenario: Delete newly created task in actitime application and verify that task is deleted or not