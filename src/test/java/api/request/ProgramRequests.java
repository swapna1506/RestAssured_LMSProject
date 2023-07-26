package api.request;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import api.payload.ProgramPayload;
import api.utilities.RestUtils;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ProgramRequests extends RestUtils{

	//Post Request
	public static Response PostRequest(ProgramPayload payload){

		try {
			
			response = given().
					contentType(ContentType.JSON).
					accept(ContentType.JSON).
					body(payload).
					when().post(routes.getString("Program_Post_URL"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

		return response;
	}

	//Delete Request
	public static Response DeletRequest(){

		response =when().
				delete(routes.getString("Program_Delete_URL")+ProgramPayload.getProgramName());

		return response;
	}

	//Delete Request
	public static Response PutRequest() {

		response = when().
				put(routes.getString("Program_Put_URL")+ProgramPayload.getProgramName());

		return response;
	}
}