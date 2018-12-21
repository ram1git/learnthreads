package collect;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

public class Demoarraylist {
	
	LinkedList<String> ll=null;
	
	
	public static void main(String[] args) {
		int a[]=new int[2];
		a[0]=2;
		
System.out.println("list is---"+a[0]);
		
		ArrayList<String>al=new ArrayList<String>();
		al.add("ananth");
		al.add("jack");
		al.add("tom");
		al.add("peter");
		al.add("mary");
		al.add("david");
		al.add("joseph");
		al.add("john");
		
		
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("hello");
		ll.add("hello1");
		ll.add("hello2");
		ll.add("hello3");
		ll.add("hello4");
		ll.add("hello5");
		
		System.out.println(al);
		
		al.add(8, "suhas");
		
		System.out.println(al);
		
		al.addAll(ll);
		
		System.out.println(al);
		
		al.addAll(3, ll);
		
		System.out.println(al);
		
		al.add("prabhas");
		System.out.println(al);
	Object sd=(al.clone());
	System.out.println("object is ----is"+sd);
	
	System.out.println(al.contains(ll.get(5)));
	
	System.out.println(al.containsAll(ll));
	
	
	ListIterator<String>ij=al.listIterator();
System.out.println(ij.next());

List<String>lk=al.subList(4, 8);
System.out.println(al);
System.out.println(lk);

al.trimToSize();


	
			}

}
