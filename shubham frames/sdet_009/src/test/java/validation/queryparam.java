package validation;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class queryparam {

	@Test
	public void queryparam() {
		
		baseURI="https://reqres.in/";
		//preconditions or requiste
		given().queryParam("page", 13)
		
		//actions
		.when().get("/api/users")
		//validation
		.then().log().all();
	}
	
}
