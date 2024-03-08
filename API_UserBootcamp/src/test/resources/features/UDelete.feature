Feature: DELETE request for all User

  Background: User trying to create userdetails with basic auth with username and passsword.
 
  #Positive
    @Test16  
 Scenario: Verify DELETE user using firstname
 Given User creates DELETE Request for the herokuapp API endpoint witha valid data
 When User calls DELETE HTTP request with username
 Then User will get status code 200 ok
 
  @Test18  
 Scenario: Verify DELETE user using userID
 Given User creates DELETE Request for the herokuapp API endpoint witha valid data
When User calls DELETE HTTP request with a userId
Then User will get status code 200 ok
 
  # Negative
 @Test17  
Scenario: Verify DELETE user using invalid firstname
Given  User creates DELETE Request for the herokuapp API endpoint witha invalid data
When User calls DELETE HTTP request with username
Then User will get Status code 404 Error found


 @Test19  
Scenario: Verify DELETE user using  invalid userID
Given User creates DELETE Request for the herokuapp API endpoint witha invalid data
When  User calls DELETE HTTP request with a userId
Then User will get Status code 404 Error found
 
 
 
 
 
 






