package restassured_using_diffrentclasses;

import java.util.HashMap;
import org.testng.annotations.Test;
import generic_utility.javautil;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class using_hashmap {

	@Test
	public void usinghashmap() {
		javautil jutil = new javautil();
		HashMap<String, Object> hm = new HashMap<String, Object>();
		hm.put("projectId", "ty_9988");
		hm.put("projectName", "shankeshwar" + jutil.random());
		hm.put("teamSize", "332");
		hm.put("createdBy", "shanketa");
		hm.put("createdOn", "23/12/22");
		hm.put("status", "complete");

		// precondition

		RequestSpecification rest = RestAssured.given().body(hm).contentType(ContentType.JSON);

		// actions

		Response resp = rest.when().post("http://localhost:8084/addProject");

		// valid

		ValidatableResponse val = resp.then().log().all();
		val.assertThat().statusCode(201).contentType(ContentType.JSON);
	}
}
