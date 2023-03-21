package validation;



import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
public class static_response_validation {

	@Test
	public void get_projects() {
		
		
		// when you know the location then we have to use the static response validation
		
		
		String expecteddata = "TY_PROJ_1405";
		String baseuri="http://localhost:8084";
		
		//actions
		 Response a = when().get(baseuri+"/projects");
		//validation
		 String actdata = a.jsonPath().get("[5].projectId");
		 a.then().log().all();
		 Assert.assertEquals(actdata,expecteddata);
		 System.out.println("data verfied");
		


	}

}

