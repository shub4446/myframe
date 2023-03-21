package restassured_W_BDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class put_in_project {

	@SuppressWarnings("unchecked")
	@Test
	public void put_in_projeCt() {

		JSONObject jobj = new JSONObject();
		jobj.put("projectId", "ty_998");
		jobj.put("projectName", "shankesh");
		jobj.put("teamSize", "332");
		jobj.put("createdBy", "shancheta");
		jobj.put("createdOn", "23/12/22");
		jobj.put("status", "pending");

		given().body(jobj).contentType(ContentType.JSON)
				// step:2 action
				.when().put("http://localhost:8084/projects/TY_PROJ_406")
				// valid
				.then().log().all().assertThat().statusCode(200);

	}
}
