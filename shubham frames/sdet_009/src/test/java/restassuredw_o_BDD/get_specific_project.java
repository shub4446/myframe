package restassuredw_o_BDD;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class get_specific_project {

	public void get_specific_projeCt() {

		// precondition
		RequestSpecification rest = RestAssured.given();
		// actions
		Response resp = rest.when().get("http://localhost:8084/projects/TY_PROJ_2002");
		// valid
		resp.then().log().all().assertThat().statusCode(200);
		System.out.println(resp.prettyPeek());

	}
}
