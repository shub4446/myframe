package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class Array_list_01 {

	public static void main(String[] args) {
		ArrayList<Object> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(20);
		list.add(10.5);
		list.add("hi");
		list.add(null);
		list.add(null);
		System.out.println(list);
		list.add(2,"hw");
		System.out.println(list);
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(30);
		list1.add(10);
		list1.add(20);
		list1.add(50);
		list1.add(40);
		java.util.Collections.sort(list1);
		Collections.sort(list1);
		list.addAll(list1);//it will add list one and list1
		System.out.println(list);
		if (list.contains("hi")) {			
			System.out.println("hi is present_____");
		}
		else {
			System.out.println("hi is absent ________");
		}
		System.out.println(list.remove(1));
		for(Object obj : list) {
			System.out.println(obj);
		}
		System.out.println("+++++++++++"+list.size());

		Stack<Object> st = new Stack<>();
		st.push(10);
		st.push(20);
		System.out.println(st.pop());
		System.out.println(st.pop());

		//arraylist
		ArrayList<Object> list2=new ArrayList<>();
		list2.add(10);
		list2.add(20);
		list2.add(30);


		System.out.println("++++++++++++++++linked list ++++++++++++++++++++++++++++");
		LinkedList<Object> list11 = new LinkedList<>();
		list11.add(10);
		list11.add(20);
		list11.add("hello");
		list11.add(null);
		list11.add(null);
		System.out.println(list11);
		list11.add(2,"hi");
		System.out.println(list11);
		list11.addFirst("hola");
		list11.addLast("dasvidaniya");
		System.out.println(list11);
		list11.remove(1);
		list11.removeFirst();
		System.out.println(list11);
		System.out.println(list11.getFirst());
		System.out.println(list11.getLast());
		System.out.println(list11.get(0));

		System.out.println("-----------------------linked list-----------------------");

		System.out.println("++++++++++++++++priorty list ++++++++++++++++++++++++++++");

		PriorityQueue<Character> q= new PriorityQueue<>();
		q.add('a');
		q.add('b');
		q.add('b');
		q.add('c');
		q.add('c');
		q.add('e');
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q.peek());
		System.out.println(q);
		System.out.println("-----------------------priorty  list-----------------------");

		System.out.println("++++++++++++++++hash set ++++++++++++++++++++++++++++");

		HashSet<Object> set = new HashSet<>();
		set.add(10);
		set.add(10);
		set.add("hi");
		set.add(null);
		set.add(20);
		System.out.println(set.contains("hi"));
		System.out.println(set.isEmpty());
		System.out.println(set.remove("hi"));
		System.out.println(set);
		System.out.println("end");
		Iterator<Object> i= set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

		System.out.println("-----------------------hash  list-----------------------");

		System.out.println("++++++++++++++++array list++++++++++++++++++++++++++++");

		ArrayList<Object> list22=new ArrayList<>(set);
		System.out.println(list22.get(2));
		System.out.println(list22);
		set.clear();
		System.out.println(set);
		for(Object o : list) {

			System.out.println(o);
		}	
		//tree set 
		TreeSet<Integer> set33 = new TreeSet<>();
		set33.add(90);
		set33.add(20);
		set33.add(30);
		set33.add(30);
		set33.add(50);
		set33.add(60);
		set33.add(70);
		System.out.println(set33);
		System.out.println(set33.descendingSet());
		Iterator<Integer> ib = set33.iterator();
		while(ib.hasNext()) {
			System.out.println(ib .next());
		}
		System.out.println("++++++++++++++++++hashtable ++++++++++++++++++++++");
		Hashtable<Integer, String> map = new Hashtable<>();
		map.put(1, "hi");
		map.put(1, "shubham");//dup keys are not allowed but values are allowed 
		map.put(2, "namaste");
		map.put(3, "privet");
		map.put(4, "hi");
		map.put(1, "hi");
		map.put(6, "hi");
		System.out.println(map);
		map.remove(2);
		System.out.println(map);
		map.replace(1, "hema");
		System.out.println(map);
		System.out.println("================hashtable =====================");
		
		System.out.println("++++++++++++++++++hashmap ++++++++++++++++++++++++++++++++++++++++++");
		
		HashMap<Integer, String> map2 = new HashMap<>();
		map2.put(1, "hi");
		map2.put(1, "shubham");//dup keys are not allowed but values are allowed 
		map2.put(2, "namaste");
		map2.put(3, "privet");
		map2.put(5, null);
		map2.put(4, "hi");
		map2.put(1, "hi");
		map2.put(6, "hi");
		System.out.println(map2);
		map2.remove(2);
		System.out.println(map2);
		map2.replace(1, "hema");
		System.out.println(map2);
		System.out.println("_____________________hashmap ___________________");
		
		TreeMap<Integer, String> tmap2 = new TreeMap<>();
		tmap2.put(1, "hi");
		tmap2.put(1, "shubham");//dup keys are not allowed but values are allowed 
		tmap2.put(2, "namaste");
		tmap2.put(3, "privet");
		tmap2.put(5, null);
		tmap2.put(7, null);
		tmap2.put(4, "hi");
		tmap2.put(1, "hi");
		tmap2.put(6, "hi");
		System.out.println(tmap2);
		tmap2.remove(2);
		System.out.println(tmap2);
		tmap2.replace(1, "hema");
		System.out.println(tmap2);
	}

}
