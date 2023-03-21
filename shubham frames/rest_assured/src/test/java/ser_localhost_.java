import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ser_localhost_ {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
	ser_localhost obj=new ser_localhost("ty-0012", "shantam", 77, "shirvas", "created", "23/01/2022");

	
	
	//conversion for byte java into byte stream 
	ObjectOutputStream oobj= new ObjectOutputStream(new FileOutputStream("./shubham2.ser"));
	oobj.writeObject(obj);
	System.out.println("done");
	
	//conversion for byte stream into java
	ObjectInputStream obin2= new ObjectInputStream(new FileInputStream("./shubham2.ser"));
	ser_localhost user = (ser_localhost)obin2.readObject();
	
	System.out.println(user.ProjectId);
	System.out.println(user.ProjectName);
	System.out.println(user.ProjectManager);
	System.out.println(user.CreatedOn);
	System.out.println(user.Status);
	}
	
}
