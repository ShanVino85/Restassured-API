@tag1
 Feature: GET request for all User

  Background:User trying to create userdetails with basic auth with username and passsword.
  
  #Positive
  @Test7
  Scenario: Verify GET User  with all user
  Given User is on GET method with  all user endpoint 
   When User call GET HTTP request 
  Then User wil get status with 200 ok
  
   @Test8  
  Scenario: Verify GET User  with valid userID
  Given User is on GET method with userId endpoint  
  When User call GET HTTP request with valid userID
  Then User wil get status with 200 ok
  
  @Test9
   Scenario: Verify GET User  with valid user firstname
    Given  User is on GET method with username endpoint  
    When User call GET HTTP request with valid username
    Then User wil get status with 200 ok