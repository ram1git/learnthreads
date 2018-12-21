package collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class Demolinkedlist  {

	public static void main(String[] args) {
		
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("hello");
		ll.add("hello1");
		ll.add("hello2");
		ll.add("hello3");
		ll.add("hello4");
		ll.add("hello5");
		
		System.out.println(ll);
		
		ll.add("hello31");
		
		System.out.println(ll);
		
		ll.addFirst("ananth");
		
		
		System.out.println(ll);
		
		ll.addAll(ll);
		
		System.out.println(ll);
		
		ll.addAll(3, ll);
		
		System.out.println(ll);
		
		ll.addLast("kavitha");
		
		System.out.println(ll);
		
	System.out.println(ll.contains(ll.get(0)));
	
Iterator <String>	iy=ll.descendingIterator();
for(int i=0;i<ll.size();i++){
	System.out.println(iy.next());
	
	
	
}
	
System.out.println(ll.element());

System.out.println(ll.indexOf(ll)+3);
System.out.println(ll.lastIndexOf(ll));
ListIterator<String> ilt=ll.listIterator();

System.out.println(ll.offer("kavitha"));

System.out.println(ll.peek());
System.out.println(ll.peekFirst());
System.out.println(ll.peekLast());
System.out.println(ll.poll());
System.out.println(ll.pop());
ll.push("kavitha23");
System.out.println(ll);
System.out.println(ll.remove());
System.out.println(ll);
ll.removeFirstOccurrence(ll);
System.out.println(ll);
ll.removeLastOccurrence(ll);
System.out.println(ll);



	}

	
	

}
