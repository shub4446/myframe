package validation;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;


import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class validating_responsetime {

	@Test
	public void chkresponse_time() {
		when().get("http://localhost:8084/projects")
		.then().log().all().assertThat().time(Matchers.lessThan(2000L), TimeUnit.MILLISECONDS);
		
		
	}
	
	
}
