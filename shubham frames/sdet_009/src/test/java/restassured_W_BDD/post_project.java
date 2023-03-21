package restassured_W_BDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import generic_utility.javautil;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class post_project {

	@SuppressWarnings("unchecked")
	@Test
	public void postproject() {

		// precondition
		javautil jutil = new javautil();
		JSONObject jobj = new JSONObject();
		jobj.put("projectId", "ty_99838");
		jobj.put("projectName", "shankeshwar" + jutil.random());
		jobj.put("teamSize", "332");
		jobj.put("createdBy", "shanketa");
		jobj.put("createdOn", "23/12/22");
		jobj.put("status", "complete");

		given().body(jobj).contentType(ContentType.JSON)
				// actions
				.when().post("http://localhost:8084/addProject")
				// validation
				.then().log().all().assertThat().statusCode(201);

	}
}
