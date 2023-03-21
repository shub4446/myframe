import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class demarshalling_data {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper map =new ObjectMapper();
		ser_localhost obob = map.readValue(new File("./project.json"), ser_localhost.class);
		System.out.println(obob.ProjectId);
		System.out.println(obob.ProjectName);
		System.out.println(obob.ProjectManager);
		System.out.println(obob.NoOfEmp);
		System.out.println(obob.CreatedOn);
		System.out.println(obob.Status);
	}

}
