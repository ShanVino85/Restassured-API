package stepdefinitions;



import static io.restassured.RestAssured.baseURI;

import java.io.IOException;

import org.junit.Assert;



//import com.github.javafaker.Faker;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import requestbody.POSTbody;
import userrequest.Request;
import utilities.RestUtils;

public class PostUser extends RestUtils {
	
	Response response;
	//public Object Userpayload;
	static String asString;
	
	
	@Given("User creates POST Request for the herokuapp API endpoint witha valid data")
	public void user_creates_post_request_for_the_herokuapp_api_endpoint_witha_valid_data() {
		
		//String BaseURI = routes.getString("BaseUrl");
		//baseURI = BaseURI;

	}


	@When("User sends HTTPS Request and request Body for user with mandatory ,additional fields")
	public void user_sends_https_request_and_request_body_for_program_with_mandatory_additional_fields() throws IOException {
		
		 UserPayload=POSTbody.PostBody();
		 response = Request.createuser(UserPayload);      
		//asString = response.then().assertThat().statusCode(201).statusLine("created").log().all().extract().asString();
		
		 
			 
	    
	}

	
	
	@Then("A valid response is received and new program is created with status code {int} Created.")
	public void a_valid_response_is_received_and_new_program_is_created_with_status_code_created(Integer int1) {
		asString = response.then().assertThat().statusCode(201).statusLine("created").log().all().extract().asString();
		 System.out.println(asString);	
		 JsonPath js=new JsonPath(asString);
		 String user_id=js.getString("user_id");
		 System.out.println("user_id :" +user_id);
	}

	
	
	
	@Given("User creates POST Request for the herokuapp API endpoint witha invalid data")
	public void user_creates_post_request_for_the_herokuapp_api_endpoint_witha_invalid_data() {
	    
	}

	
	
	
	@Then("No new program is created and User will recieve below status code {int} Bad Request.")
	public void no_new_program_is_created_and_user_will_recieve_below_status_code_bad_request(Integer int1) {
		asString = response.then().assertThat().statusCode(201).statusLine("created").log().all().extract().asString();
	}

	
	
	

	@Then("No user is created and the status code should be {int} Bad Request with error message User street Name is mandatory and should contains alphabets only")
	public void no_user_is_created_and_the_status_code_should_be_bad_request_with_error_message_user_street_name_is_mandatory_and_should_contains_alphabets_only(Integer int1) {
		
		asString = response.then().assertThat().statusCode(400).statusLine("User street Name is mandatory and should contains alphabets only").log().all().extract().asString();
	}

	@When("User sends HTTPS Request and request Body for  user with mandatory ,additional fields")
	public void user_sends_https_request_and_request_body_for_user_with_mandatory_additional_fields() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("No new user is created and User will recieve below status code {int} Bad Request.")
	public void no_new_user_is_created_and_user_will_recieve_below_status_code_bad_request(Integer int1) {
		
		asString = response.then().assertThat().statusCode(400).statusLine("Bad Request").log().all().extract().asString();
	}

	

	@Then("No new user is created and User will recieve below status code {int} Conflict")
	public void no_new_user_is_created_and_user_will_recieve_below_status_code_conflict(Integer int1) {
		
		asString = response.then().assertThat().statusCode(409).statusLine("Conflict").log().all().extract().asString();
	}

	




}
