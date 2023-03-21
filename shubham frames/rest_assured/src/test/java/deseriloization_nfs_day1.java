import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import serilization_deserialization.nfsgame;

public class deseriloization_nfs_day1 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		
		//in order to create the data from byte stream to  java 
		
		ObjectInputStream objin= new ObjectInputStream(new FileInputStream("./shubham.ser"));
		nfsgame user = (nfsgame)objin.readObject();
		
		System.out.println("the data of game is ");
		System.out.println("level==="+user.level);
		System.out.println("score==="+user.Score);
		System.out.println("name==="+user.Name);
		System.out.println("life==="+user.life);
	}

}
