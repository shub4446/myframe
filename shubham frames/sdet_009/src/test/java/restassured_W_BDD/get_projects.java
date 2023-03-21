package restassured_W_BDD;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class get_projects {

	@Test
	public void getprojects() {

		// actions
		when().get("http://localhost:8084/projects")
				// validation
				.then().log().all().assertThat().statusCode(200);
	}
}
