import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class localhost_using_hasmap {
	
	public static void main(String[] args) {
	
		Map<String , Object> map = new HashMap<String, Object>();
		map.put("projectName", "divakar");
		map.put("projectId", "TY-00189");
		map.put("status","created");
		RestAssured.given().contentType(ContentType.JSON).body(map)
		.when().post("http://localhost:8084/addProject").then().log().all().assertThat().statusCode(201);
	}
}
