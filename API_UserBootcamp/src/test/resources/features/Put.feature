Feature: PUT request for all User

  Background:User trying to create userdetails with basic auth with username and passsword. 
 
 #Positive
    @Test10   
 Scenario: Verify PUT request to update with valid UserID
 Given User creates PUT Request for the herokuapp API endpoint witha valid data
 When User calls the  PUT HTTP to update user with the valid UserID
 Then User details are updated and the status code should be 200 with the status line ok
 
 # Negative
   @Test11
 Scenario: Verify PUT request to update the user details with the incorrect user id
 Given User creates PUT Request for the herokuapp API endpoint witha invalid data
 When User calls the PUT HTTP to update user with incorrect user in the  request body
 Then User should get an error message along with 400 BAD_REQUEST status 
  @Test12
 Scenario: Verify PUT request with existing email id
 Given User creates PUT Request for the herokuapp API endpoint witha invalid data
 When User calls the PUT HTTP to update user with existing email id along with a request body.
 Then User should get an error message along with 400 BAD_REQUEST status
  @Test13
 Scenario: Verify PUT request with existing phone number
 Given User creates PUT Request for the herokuapp API endpoint witha invalid data
 When User calls the PUT HTTP to update user with existing phone number along with a request body.
 Then User should get an error message along with 400 BAD_REQUEST status
  @Test14
 Scenario: Verify PUT request to update with alpha numeric characters in last name
 Given User creates PUT Request for the herokuapp API endpoint witha invalid data
 When User calls the PUT HTTP to update user with alpha numeric characters in first name along with a request body.
 Then User should get an error message along with 400 BAD_REQUEST status
  @Test15
 Scenario: Verify PUT request to update with alpha numeric characters in last name
 Given User creates PUT Request for the herokuapp API endpoint witha invalid data
 When User calls the PUT HTTP to update user with alpha numeric characters in last name along with a request body.
Then User should get an error message along with 400 BAD_REQUEST status




 
 
 
 





