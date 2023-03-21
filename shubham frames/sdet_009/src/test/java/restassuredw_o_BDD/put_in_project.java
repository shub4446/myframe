package restassuredw_o_BDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class put_in_project {

	@SuppressWarnings("unchecked")
	@Test
	public void put_project() {

		JSONObject jj = new JSONObject();
		jj.put("createdBy", "darbhanga");
		jj.put("projectName", "devashis");
		jj.put("teamSize", "3425");
		jj.put("status", "created");

		// precondition
		RequestSpecification rest = RestAssured.given().body(jj).contentType(ContentType.JSON);
		// action
		Response yes = rest.when().put("http://localhost:8084/projects/TY_PROJ_2002");
		// validation
		yes.then().log().all().assertThat().statusCode(200).and().contentType(ContentType.JSON);
	}
}
