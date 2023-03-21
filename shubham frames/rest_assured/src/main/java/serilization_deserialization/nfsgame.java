package serilization_deserialization;

import java.io.Serializable;

public class nfsgame  implements Serializable{
	
	public String  Name ;
	public int level ;
	public long Score ;
	public int life ;
	
	public nfsgame(String name, int level, long score, int life) {
		super();
		this.Name = name;
		this.level = level;
		this.Score = score;
		this.life = life;
	}
}
