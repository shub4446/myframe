package restassuredw_o_BDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import generic_utility.javautil;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class post_project {

	@SuppressWarnings("unchecked")
	@Test
	public void post_project1() {

		javautil jutil = new javautil();
		JSONObject jobj = new JSONObject();
		jobj.put("projectId", "ty_9988");
		jobj.put("projectName", "shankeshwar" + jutil.random());
		jobj.put("teamSize", "332");
		jobj.put("createdBy", "shanketa");
		jobj.put("createdOn", "23/12/22");
		jobj.put("status", "complete");

		// precondition

		RequestSpecification rest = RestAssured.given().body(jobj).contentType(ContentType.JSON);

		// actions

		Response resp = rest.when().post("http://localhost:8084/addProject");

		// valid

		ValidatableResponse val = resp.then().log().all();
		val.assertThat().statusCode(201).contentType(ContentType.JSON);
	}
}
