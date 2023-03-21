import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import serilization_deserialization.nfsgame;

public class nfs_game_d1 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		nfsgame user1= new nfsgame("subhas", 3, 3000, 99);
		//in order to convert java to byte stream use this 
		ObjectOutputStream objout= new ObjectOutputStream(new FileOutputStream("./shubham.ser"));
		objout.writeObject(user1);
		System.out.println("done");
		
		
		//in order to convert byte stream to java use this f
		ObjectInputStream objin= new ObjectInputStream(new FileInputStream("./shubham.ser"));
		nfsgame user=(nfsgame)objin.readObject();
		
		System.out.println(user.level);
		System.out.println(user.Score);
		System.out.println(user.Name);
		System.out.println(user.life);

	}

}
