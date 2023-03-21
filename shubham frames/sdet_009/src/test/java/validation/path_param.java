package validation;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class path_param {
	@Test
	public void path_param() {
		//prerequiste
		
		baseURI="http://localhost:8084";
		RequestSpecification res = given().pathParam("pid2", "TY_PROJ_1403");
		//actions
		Response pos = res.when().get("/projects/{pid2}");
		//validation
		pos.then().log().all();
		
		
		
		
	}
	
}
