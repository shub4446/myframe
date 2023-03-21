package authentication;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;
import static io.restassured.response.Response.*;
import io.restassured.response.Response;


public class auth20 {
	@Test
	public void authentication20(){

		baseURI="http://coop.apps.symfonycasts.com";
		Response resp = given()
				.formParam("client_id", "shubh@4446")
				.formParam("client_secret", "52556463b5a6770f811beaa244bd4c22")
				.formParam("grant_type", "client_credentials")
				.formParam("redirect_uri", "https://bhute667@gmail.com")
				.formParam("code", "authorization_code")
				.when().post("/token");
		String token = resp.jsonPath().get("access_token");
		System.out.println(token);
		
		
		given().auth().oauth2(token).pathParam("USER_ID", 4137).when().post("/api/{USER_ID}/eggs-count")
		.then().log().all();
		
	}
}