package stepdefinitions;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import userrequest.Request;
import utilities.RestUtils;

public class DeleteUser {
	
	Response response;
	
	static String asString;
	
	@Given("User creates DELETE Request for the herokuapp API endpoint witha valid data")
	public void user_creates_delete_request_for_the_herokuapp_api_endpoint_witha_valid_data() {
	   
	}

	@When("User calls DELETE HTTP request with username")
	public void user_calls_delete_http_request_with_username() {
		
		response = Request.deleteUserbyname(RestUtils.UserPayload.getUser_id());
	}

	@Then("User will get status code {int} ok")
	public void user_will_get_status_code_ok(Integer int1) {
		
		response.then().assertThat().statusCode(200).statusLine("user deleted successfully").log().all().extract().asString();
		Assert.assertEquals(response.getStatusCode(),200);
	}

	@When("User calls DELETE HTTP request with a userId")
	public void user_calls_delete_http_request_with_a_user_id() {
		
		response = Request.deleteUserbyId(RestUtils.UserPayload.getUser_id());
	}

	@Given("User creates DELETE Request for the herokuapp API endpoint witha invalid data")
	public void user_creates_delete_request_for_the_herokuapp_api_endpoint_witha_invalid_data() {
	   
		
	}

	@Then("User will get Status code {int} Error found")
	public void user_will_get_status_code_error_found(Integer int1) {
		response.then().assertThat().statusCode(400).statusLine("user not found").log().all().extract().asString();
		Assert.assertEquals(response.getStatusCode(),400);
	}

}
