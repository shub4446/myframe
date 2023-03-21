package restassured_W_BDD;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class delete_project {

	@Test
	public void delete_projeCt() {
		// actions
		when().delete("http://localhost:8084/projects/TY_PROJ_1802")
				// validation
				.then().log().all().assertThat().statusCode(204);

	}
}
