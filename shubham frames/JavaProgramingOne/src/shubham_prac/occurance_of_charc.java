package shubham_prac;

import java.util.HashMap;

public class occurance_of_charc {

	public static void main(String[] args) {

		String str = "aabbhhggjjjjjjj";
		// using for loop

		
		
		  HashMap<Character, Integer> hmap =new HashMap<>(); 
		  for(int i=str.length()-1;i>=0;i--) { if(hmap.containsKey(str.charAt(i))) { int count
		  = hmap.get(str.charAt(i)); hmap.put(str.charAt(i), ++count); } else {
		  hmap.put(str.charAt(i),1); } } System.out.println(hmap); }
		  
		// using for each loop

/*		HashMap<Character, Integer> hmap = new HashMap<>();
for(Character c:str.toCharArray()){
	if(hmap.containsKey(c)) {
		hmap.put(c, hmap.get(c+1));
		
				
	}
	else {
		hmap.put(c, 1);
	}
	
}
System.out.println(hmap);
	}*/
}
