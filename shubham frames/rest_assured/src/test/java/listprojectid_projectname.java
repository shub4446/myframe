import java.util.ArrayList;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;



public class listprojectid_projectname {

	
	@Test
	public void list() {
		Response resp = RestAssured.given().get("http://localhost:8084/projects");
		ArrayList<String> list1 = resp.jsonPath().get("projectId");
		ArrayList<String> list2 = resp.jsonPath().get("projectName");
		ArrayList<String> list3 = resp.jsonPath().get("status");
		ArrayList<String> list4 = resp.jsonPath().get("createdBy");
		
		
		for(int i=0 ; i<list1.size() ; i++) {
			
			System.out.println(list1.get(i)+"<=========project id"+"  project name =====>"+ list2.get(i)+"  created by====>"+list4.get(i)+"   status===>"+list3.get(i));
		}
		
	}

}
