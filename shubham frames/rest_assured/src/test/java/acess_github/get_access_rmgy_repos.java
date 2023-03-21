package acess_github;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class get_access_rmgy_repos {

	@Test
	public void get_all_data() {
		RestAssured.given().auth().basic("rmgyantra", "rmg@9999").when().get("http://localhost:8084/projects").then()
		.log().all();
	}
	
	
}
