Feature: Is it Friday yet?
  Everybody wants to know when it's Friday

  Scenario: Sunday isn't Friday
    Given today is Sunday
    When I ask whether it's Friday yet
    Then I should be told "Nope"

 
  Scenario Outline:  
    Given Running code example
    When Enter parameter "<data>" 
    Then It returns Hello "<name>"
    
  Examples:
		 | data     | name         |
		 | Prince   | Hello Prince |         
		 | Vikram   | Hello Vikram |         
		 | Nupur    | Hi Nupur     |         
		 
