package acess_github;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class path_parameter_dynamic {

	@Test
	public void get_repos_dynamic() {
		RestAssured.given().auth().basic("sbhute89@gmail.com", "harrier@0749")
		.pathParam("owner", "shub4446")
		.pathParam("repos", "shubham_99")
		.when().get("https://api.github.com/repos/{owner}/{repos}")
		.then().log().all();
		
	}
	
	
	
}
