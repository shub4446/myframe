package acess_github;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class get_repos_repos {

	@Test
	public void getrepos() {
	
		RestAssured.given().auth().basic("sbhute89@gmail.com","harrier@0749")
		.when().get("https://api.github.com/repos/shub4446/rty").then().log().all();
		
	}
	
}
