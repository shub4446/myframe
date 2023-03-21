package restassuredw_o_BDD;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class delete_project {

	public void deleteproject() {

		// precondition
		RequestSpecification rest = RestAssured.given();
		// actions
		Response resp = rest.when().delete("http://localhost:8084/projects/TY_PROJ_2002");
		// valid
		resp.then().log().all().assertThat().statusCode(204);

	}
}
