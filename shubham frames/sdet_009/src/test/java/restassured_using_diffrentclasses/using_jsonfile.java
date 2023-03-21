package restassured_using_diffrentclasses;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class using_jsonfile {

	@Test
	public void jsonfile() {
		File ff= new File("./jsondata.json");
		//preconditions
		given().body(ff).contentType(ContentType.JSON)
		//actions
		.when().post("http://localhost:8084/addProject")
		//validations
		.then().log().all().assertThat().statusCode(201);
		
		
	}
}
