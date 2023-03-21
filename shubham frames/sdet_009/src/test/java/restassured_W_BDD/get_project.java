package restassured_W_BDD;

import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

public class get_project {
	@Test
	public void getproject() {

		// actions
		when().get("http://localhost:8084/projects/TY_PROJ_406")
				// validation
				.then().log().all().assertThat().statusCode(200);

	}

}
