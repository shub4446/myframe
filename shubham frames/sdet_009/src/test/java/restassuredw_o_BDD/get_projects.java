package restassuredw_o_BDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class get_projects {

	@Test
	public void get_projects1() {
		// precondition but not for get methood
		RequestSpecification rest = RestAssured.given();
		// action
		Response uri = rest.get("http://localhost:8084/projects");
		// validation
		ValidatableResponse val = uri.then().log().all();
		// assert
		val.assertThat().statusCode(200).contentType(ContentType.JSON);

	}

}
