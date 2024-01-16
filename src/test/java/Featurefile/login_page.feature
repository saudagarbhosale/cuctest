Feature: login feature

  Background: 
    Given open application
    When Enter username Admin and password admin123

  @login
  Scenario Outline: test for wrong username
    When Enter username <username> and password <password>
    Then verify user should login or not

    Examples: 
      | username | password |
      | Admin    | Admin123 |

  @useradd
  Scenario: 
    Given Click admin tab
    When User add new user using add button
    And User add the details in user form
      | Employee_Name | Username        | Password   | Confirm_Password |
      | raj s s     | Saudagarbh | Saudagar@1 | Saudagar@1       |
    Then to verify user should be add
@testdataexl
  Scenario Outline: get testdata from excel
    When Enter username "sheetname" and <rowno> and <cellno>
   

    Examples: 
      | sheetname | rowno | cellno |
      | Sheet1    |     0 |      1 |
      
@csvfile      
Scenario: verify employe details
			When get id from info page and valide with csv file
			
			     
      
