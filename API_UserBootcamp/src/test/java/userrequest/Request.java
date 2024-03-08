package userrequest;

import static io.restassured.RestAssured.given;


import io.restassured.http.ContentType;
import io.restassured.response.Response;
import payload.Userpayload;
import utilities.RestUtils;

public class Request extends RestUtils {

	
	public static Response createuser(Userpayload payload)
	//RestAssured.given().auth().preemptive().basic("user@google.com", "password123")
	{
		Response response = given().auth().basic("Numpy@gmail.com", "userAPI")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(payload)
		.when().post(routes.getString("Post_userurl"));
		return response ;
	}

public static Response readAllUser( )

	{
		Response response = given().auth().basic("Numpy@gmail.com", "userAPI")
		           
		            .when().get(routes.getString("get_Alluserurl"));
		return response ;
	}

public static Response readUserbyId(String user_id )

{
	Response response = given().auth().basic("Numpy@gmail.com", "userAPI").pathParam("UserId", user_id)
	           
	            .when().get(routes.getString("get_userbyuserId"));
	return response ;
}

public static Response readUserbyusername(String UserName )

{
	Response response = given().auth().basic("Numpy@gmail.com", "userAPI").pathParam("UserName", UserName)
	           
	            .when().get(routes.getString("get_userbyusername"));
	return response ;
}
 public static Response updateUser(String  user_id)

{
	Response response = given().auth().basic("Numpy@gmail.com", "userAPI").pathParam(" user_id",  user_id)
	           
	            .when().get(routes.getString("update_userurl"));
	return response ;
}
 
 public static Response deleteUserbyname(String username)
	
	{
		Response response = given().auth().basic("Numpy@gmail.com", "userAPI").pathParam("username",username)
		                .when().delete(routes.getString("delete_userbyFN"));
		return response ;
	}
 
 public static Response deleteUserbyId(String user_id)
	
	{
		Response response = given().auth().basic("Numpy@gmail.com", "userAPI").pathParam("user_id",user_id)
		                .when().delete(routes.getString("delete_userbyuserId"));
		return response ;
	}


		
}
