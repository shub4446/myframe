package serilization_deserialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class serilization_delivery_user1 {

	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		nfsgame user1 = new nfsgame("shubham", 2, 200, 3);
		@SuppressWarnings("resource")
		ObjectOutputStream oobject= new ObjectOutputStream(new FileOutputStream("./shubham.ser"));
		oobject.writeObject(user1);
		System.out.println("ok");
	}
	
	
}
