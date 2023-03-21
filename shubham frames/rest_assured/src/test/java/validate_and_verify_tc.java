
import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class validate_and_verify_tc {

	@Test
	public void verify_validate_tc() {

		String expecprojectname="chivas";
		boolean flag = false;
		Response resp = RestAssured.given().get("http://localhost:8084/projects");
		ArrayList<String> list1=resp.jsonPath().get("projectName");

		for(int i=0 ; i<list1.size() ; i++) {
			System.out.println("ProjectName=====>"+list1.get(i));
			if(list1.get(i).equals(expecprojectname)) {
				flag=true;
				break;
			}

		}
		if(flag==true) {
			System.out.println("then test case pass and project is matching ");
		}
		else {
			System.out.println("name is not matching and test case failed ");
			Assert.assertTrue(flag);
		}
	}
}