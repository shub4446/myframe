import org.testng.annotations.Test;

import io.restassured.RestAssured;
import org.hamcrest.Matchers;

public class verify_pro_name {

	
	@Test
	public void verify_pro_name1() {
		RestAssured.given().get("http://localhost:8084/projects").then().log().all()
	.assertThat().body("[0].projectName",Matchers.equalTo("chivas"))
	.and().body("[0].projectId", Matchers.is("TY_PROJ_1002"))
	.and().body("projectName",Matchers.hasItems("chivas","shubham","stonner","viking"))
	.and().body("projectId",Matchers.hasItems("TY_PROJ_1002","TY_PROJ_1202","TY_PROJ_204","TY_PROJ_40"));
	
	
	
	}
}
