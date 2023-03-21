package acess_github;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class new_application_git {
	@Test
	public void new_app() {
		
		String accessstoken = RestAssured.given().formParam("clientid", "813bbb50d3d0ad765dc1")
		.formParam("clientsecid", "ba90875697c9bf455b2883eed7cd32cd0a61dd97")
		.formParam("granttype","" )
		.when().post("https://api.github.com/tokens").jsonPath().get("accesstoken");
		System.out.println(accessstoken);
	}

}
