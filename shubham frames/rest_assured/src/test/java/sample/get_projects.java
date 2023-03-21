package sample;

import org.testng.annotations.Test;

import io.restassured.RestAssured;


public class get_projects {

	@Test
	public void getallprojects(){
		
	RestAssured.get("http://localhost:8084/projects").then().log().all();
				
	/*
	 * // System.out.println("----------------------------------------"); //
	 * Response respo =
	 * RestAssured.get("http://localhost:8084/projects/TY_PROJ_602"); //
	 * //System.out.println(respo.asString()); // respo.prettyPrint();
	 */	}
	
}
