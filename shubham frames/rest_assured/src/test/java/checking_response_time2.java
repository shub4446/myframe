import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class checking_response_time2 {

	@Test
	public void resptime2() {
	
		long time = RestAssured.given().get("http://localhost:8084/projects")
					.timeIn(TimeUnit.SECONDS);
					System.out.println(time);	
	}	
}
