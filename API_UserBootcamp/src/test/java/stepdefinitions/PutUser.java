package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import requestbody.POSTbody;
import requestbody.PUTbody;
import userrequest.Request;
import utilities.RestUtils;

public class PutUser {
	
	Response response;
	
	static String asString;
	
	@Given("User creates PUT Request for the herokuapp API endpoint witha valid data")
	public void user_creates_put_request_for_the_herokuapp_api_endpoint_witha_valid_data() {
	    
	}

	@When("User calls the  PUT HTTP to update user with the valid UserID")
	public void user_calls_the_put_http_to_update_user_with_the_valid_user_id() {
		
		response = Request.updateUser(RestUtils.UserPayload.getUser_id());
		
	}

	@Then("User details are updated and the status code should be {int} with the status line ok")
	public void user_details_are_updated_and_the_status_code_should_be_with_the_status_line_ok(Integer int1) {
	    
		asString = response.then().assertThat().statusCode(200).statusLine("updated").log().all().extract().asString();
	}

	@Given("User creates PUT Request for the herokuapp API endpoint witha invalid data")
	public void user_creates_put_request_for_the_herokuapp_api_endpoint_witha_invalid_data() {
	    
	}

	@When("User calls the PUT HTTP to update user with incorrect user in the  request body")
	public void user_calls_the_put_http_to_update_user_with_incorrect_user_in_the_request_body() {
	    
		response = Request.updateUser(RestUtils.UserPayload.getUser_id());
	}

	@Then("User should get an error message along with {int} BAD_REQUEST status")
	public void user_should_get_an_error_message_along_with_bad_request_status(Integer int1) {
		
		asString = response.then().assertThat().statusCode(400).statusLine("Bad Request").log().all().extract().asString();
	}

	@When("User calls the PUT HTTP to update user with existing email id along with a request body.")
	public void user_calls_the_put_http_to_update_user_with_existing_email_id_along_with_a_request_body() {
	   
	}

	@When("User calls the PUT HTTP to update user with existing phone number along with a request body.")
	public void user_calls_the_put_http_to_update_user_with_existing_phone_number_along_with_a_request_body() {
	    
	}

	@When("User calls the PUT HTTP to update user with alpha numeric characters in first name along with a request body.")
	public void user_calls_the_put_http_to_update_user_with_alpha_numeric_characters_in_first_name_along_with_a_request_body() {
	    
	}

	@When("User calls the PUT HTTP to update user with alpha numeric characters in last name along with a request body.")
	public void user_calls_the_put_http_to_update_user_with_alpha_numeric_characters_in_last_name_along_with_a_request_body() {
	   
	}


}
