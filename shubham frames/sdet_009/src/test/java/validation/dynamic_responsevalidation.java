package validation;

import org.testng.annotations.Test;
import io.restassured.response.Response;
import junit.framework.Assert;
import static io.restassured.RestAssured.*;
import java.util.List;

public class dynamic_responsevalidation {

	
	@Test
	public void get_project() {
	
		//when we dont know the location(index) of data located 
		String expectedproj = "TY_PROJ_1403";
		//action
		Response get = when().get("http://localhost:8084/projects");
		boolean flag= false;
		List<String> pd = get.jsonPath().get("projectId");
		System.out.println(pd);
		//validation
		get.then().log().all();
		
		
		
		
		
		for(String projectid:pd) {
			
			if(projectid.equalsIgnoreCase(expectedproj)) {
				flag=true;
			}
			Assert.assertTrue(true);
		}	
	}
}
