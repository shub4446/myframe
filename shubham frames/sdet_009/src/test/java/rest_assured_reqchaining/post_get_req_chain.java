package rest_assured_reqchaining;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class post_get_req_chain {

	@Test
	public void post_get() {
		baseURI="http://localhost";
		port=8084;	
		
	datato_post dpot= new datato_post("morpheus", "22", "kunal", "23/12/2022", "complete");
	//precondition
	RequestSpecification res = given().body(dpot).contentType(ContentType.JSON);
	//action
	Response rep = res.when().post("/addProject");
	
	String proid = rep.jsonPath().get("projectId");
	System.out.println(proid);
	rep.then().log().all();
	
	given().pathParam("pid", proid)
	.when().get("/projects/{pid}").then().log().all().assertThat().statusCode(200);
	
	}
	
}
