package String_programme;

import java.util.LinkedHashSet;

public class toprrintpositionofcharwithoutdup {
 
	public static void main(String[]args){
String str="Tester";
String s=str.toLowerCase();
System.out.println(s);
LinkedHashSet<Character> set=new LinkedHashSet<>();
for(int i=0;i<s.length();i++) {
	set.add(s.charAt(i));
}
for(Character ch:set) {
	
	for(int i=0;i<s.length();i++) {
		if(ch==s.charAt(i)) {
			System.out.println(ch+" is present in "+(i+1)+"position");
			break;
		}
	}
	
}


 
	}
	
}
