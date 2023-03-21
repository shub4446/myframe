package acess_github;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class query_param {
	@Test
	public void queryparam() {
	RestAssured.given().auth().basic("sbhute89@gmail.com", "harrier@0749")
	.pathParam("sea", "search")
	.pathParam("repos", "repositories")
	.queryParam("q", "shub4446/shubham_9988 ")
	.queryParam("sort", "updated")
	.queryParam("order", "desc")
	.when().get("https://api.github.com/{sea}/{repos}")
	.then().log().all();
	
}
}

