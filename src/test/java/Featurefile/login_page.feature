Feature: login feature
	@login
  Scenario: test for wrong username
    Given open application
    When Enter username "tomsmith" and password "Su"
    Then verify user should login or not
