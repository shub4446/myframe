import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class verificatioan_validation {

	
	@Test
	public void verify_statuscodeandothers() {
	RestAssured.given().get("http://localhost:8084/projects")
	.then().log().all().assertThat().statusCode(200).and().contentType(ContentType.JSON)
	.and().header("Transfer-Encoding", "chunked").and().header("Pragma", "no-cache")
	.and().header("X-Frame-Options", "DENY").and().header("Connection", "keep-alive").and().header("Content-Type", "application/json")
	;
	}
}
