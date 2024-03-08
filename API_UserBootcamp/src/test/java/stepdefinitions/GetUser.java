package stepdefinitions;



import org.junit.Assert;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import userrequest.Request;
import utilities.RestUtils;

public class GetUser extends RestUtils{

Response response;
//public Object Userpayload;

	
	@Given("User is on GET method with  all user endpoint")
	public void user_is_on_get_method_with_all_user_endpoint() {
		
		//String BaseURI = routes.getString("BaseUrl");
		//baseURI = BaseURI;
		
			
	}

	@When("User call GET HTTP request")
	public void user_call_get_http_request() {
		
		response =Request.readAllUser();
	}

	@Then("User wil get status with {int} ok")
	public void user_wil_get_status_with_ok(Integer int1) {
		
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(),200);
	}
	
	@Given("User is on GET method with userId endpoint")
	public void user_is_on_get_method_with_user_id_endpoint() {
		
		 response = Request.readUserbyId(RestUtils.UserPayload.getUser_id());
       
		
	}

	@When("User call GET HTTP request with valid userID")
	public void user_call_get_http_request_with_valid_user_id() {
		
		String UserdetailsbyId = response.then().assertThat().statusCode(201).log().all().extract().asString();
		 System.out.println(UserdetailsbyId);
		Assert.assertEquals(response.getStatusCode(),200); 
	    
	}

	@Given("User is on GET method with username endpoint")
	public void user_is_on_get_method_with_username_endpoint() {
		
		 response = Request.readUserbyusername(RestUtils.UserPayload.getUser_first_name()) ; 
		
	    
	}

	@When("User call GET HTTP request with valid username")
	public void user_call_get_http_request_with_valid_username() {
		
		String UserdetailsbyId = response.then().assertThat().statusCode(201).log().all().extract().asString();
		 System.out.println(UserdetailsbyId);
		Assert.assertEquals(response.getStatusCode(),200); 
		


    }
	
}
