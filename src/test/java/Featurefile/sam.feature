
Feature: Parallal execution with all possible way
 

  @first
  Scenario Outline: test parallal
    Given open url entername <name> a
    

    Examples: 
      | name  | 
      | "1"| 
      | "2" |
      | "3" |
      | "4" |
            
