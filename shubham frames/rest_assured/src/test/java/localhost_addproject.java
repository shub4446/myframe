import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class localhost_addproject {
	@SuppressWarnings("unchecked")
	@Test
	public void create_project_BDD() {
	 
		JSONObject json= new JSONObject();
		json.put("projectId", "Ty_007777");
		json.put("projectName", "shasha_act687");
		json.put("teamSize","89");
		json.put("createdBy","aanchal");
		json.put("status","created");
		json.put("createdOn","23/22/11");

		RestAssured.given().contentType(ContentType.JSON)
		.body(JSONObject.toJSONString(json))
		.when().post("http://localhost:8084/addProject")
		.then().log().all().assertThat().statusCode(201);
		
		
		
	}
}
