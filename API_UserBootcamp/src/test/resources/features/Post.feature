Feature: POST request Create Program

  Background: User trying to create userdetails with basic auth with username and passsword.
  
     #Positive
    @Test1 
   Scenario: Check the new User is created with the valid data and verify the status code
   
    Given User creates POST Request for the herokuapp API endpoint witha valid data
   When User sends HTTPS Request and request Body for user with mandatory ,additional fields
    Then A valid response is received and new program is created with status code 201 Created.
 
   # Negative
   
   @Test2
  Scenario: Check  the new User is not created forstreet name having special character
    
    Given User creates POST Request for the herokuapp API endpoint witha invalid data
   When User sends HTTPS Request and request Body for user with mandatory ,additional fields
    Then No user is created and the status code should be 400 Bad Request with error message User street Name is mandatory and should contains alphabets only
   
    @Test3
  Scenario: Check  the new User is not created for Missing valid mandatory data 
    
    Given User creates POST Request for the herokuapp API endpoint witha invalid data
   When User sends HTTPS Request and request Body for  user with mandatory ,additional fields
    Then No new user is created and User will recieve below status code 400 Bad Request.

    @Test4
  Scenario: Check  the new User is not created for Numeric Firstname and lastname entry 
    
    Given User creates POST Request for the herokuapp API endpoint witha invalid data
   When User sends HTTPS Request and request Body for  user with mandatory ,additional fields
    Then No new user is created and User will recieve below status code 400 Bad Request.
    
     @Test5
  Scenario: Check  the new User is not created for Sprecial character in Firstname and lastname entry 
    
    Given User creates POST Request for the herokuapp API endpoint witha invalid data
   When User sends HTTPS Request and request Body for  user with mandatory ,additional fields
    Then No new user is created and User will recieve below status code 400 Bad Request.
    
     @Test6
  Scenario: Check  the new User is not created for existing email and contact number
    
    Given User creates POST Request for the herokuapp API endpoint witha invalid data
   When User sends HTTPS Request and request Body for  user with mandatory ,additional fields
    Then No new user is created and User will recieve below status code 409 Conflict