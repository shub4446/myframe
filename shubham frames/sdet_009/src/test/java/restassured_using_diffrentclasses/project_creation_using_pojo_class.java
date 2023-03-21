package restassured_using_diffrentclasses;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class project_creation_using_pojo_class {

	@Test
	public void pojo_post_proj() {
	
		String baseurl = "http://localhost:";
		String portnum = "8084/";
				
		
		variable_constructors_gt_st_forprojcreation vj= new variable_constructors_gt_st_forprojcreation("oldmonk", "morpheus", "ty_8887", "23/12/2022", "pending");
		//precondition
		given().body(vj).contentType(ContentType.JSON)
		//action
		.when().get(baseurl+portnum+"/addProject")
		.then().log().all().assertThat().statusCode(200);
		
		
	}
	
	
}
