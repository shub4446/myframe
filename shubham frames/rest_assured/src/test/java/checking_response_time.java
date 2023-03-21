import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import io.restassured.RestAssured;


public class checking_response_time {
	
	
	@Test
	public void chk_resp_time() {
	
		RestAssured.given().get("http://localhost:8084/projects").then().assertThat().time(Matchers.lessThan(5L),TimeUnit.SECONDS)
		;
	}
}
