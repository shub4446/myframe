import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;



public class jackson_responding_objmapper {
	
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		ser_localhost oobj = new ser_localhost("TY_0099", "sambhu", 99, "dashing", "completed", "23/11/12");
		org.codehaus.jackson.map.ObjectMapper mapper = new org.codehaus.jackson.map.ObjectMapper();
		mapper.writeValue(new File("./project.ser"), oobj);
		System.out.println("done conversion");

		
	}
}
