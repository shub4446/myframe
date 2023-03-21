package acess_github;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class search_user {
	
	@Test
	public void search_users() {
	RestAssured.given().auth().basic("sbhute89@gmail.com", "harrier@0749")
	.queryParam("q", "shub4446")
	.queryParam("sort", "updated")
	.queryParam("order", "desc")
	.when().get("https://api.github.com/search/users")
	.then().log().all();
}
}