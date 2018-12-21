package threads;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public  class LearnabtThre  {
	
	
	
	

	public static void main(String[] args) {
		
		
		
				
		ArrayList<String> al=new ArrayList<String>();
		al.add("hello");
		al.add("hello1");
		al.add("hello2");
		al.add("hello3");
		al.add("hello4");
		
				
	Iterator<String>it=	al.iterator();
	System.out.println(it);
	
	
		
	System.out.println(	it.next());
	
	al.add("hello5");
	
	System.out.println(al);
	
	System.out.println(al.lastIndexOf("String"));
	
	al.add(3, "ananth");
	
	System.out.println(al);
	
	System.out.println(al.indexOf("ananth"));
	
	
System.out.println(	al.addAll(3, al));


System.out.println(al.contains("hello"));



LinkedList<String> ll=new LinkedList<String>();

ll.add(0, "one");
ll.add(1, "3one");
ll.add(2, "fone");
ll.add(3, "rone");
ll.add(4, "gone");
ll.add(5, "hone");

System.out.println(ll);

ll.addLast("two");

System.out.println(ll);
System.out.println(ll.element());
ListIterator<String> li=ll.listIterator();
System.out.println(li.nextIndex());
ll.remove();
System.out.println(ll);

ll.set(3, "ananth");
System.out.println(ll);
//System.out.println(ll.element());

al.clear();


ArrayList<String>as=new ArrayList<String>(20);

as.add("hello");
as.add("hello1");
as.add("hello2");
as.add("hello3");
as.add("hello4");
as.add("hello5");
as.add("hello6");
System.out.println(as);

as.set(3, "ananth");
System.out.println(as);

ListIterator<String> it1=as.listIterator(3);
it1.next();
System.out.println(it1.next());
System.out.println(it1.next());

ll.clear();
ll.add("afirst1");
ll.add("mfirst2");
ll.add("gfirst3");
ll.add("bfirst4");
ll.add("gjirst");
ll.add("efirst");

System.out.println(ll);

System.out.println(ll.element());

ll.add(3, "hello");
System.out.println(ll);
System.out.println(ll.get(4));
System.out.println(ll.peek());
Iterator <String>dt=ll.descendingIterator();
System.out.println(dt.next());


StringBuffer buf=new StringBuffer("ananth ram");
System.out.println(buf.reverse());
buf.insert(3, "d");
System.out.println(buf);
List<String>a=new ArrayList<String>();
a.add("a");
a.add("n");
a.add("a");
a.add("n");
a.add("t");
a.add("h");
System.out.println(a);

String a2[] ={"a","n","a","n","t","h"};
System.out.println(a2[0]);

Set<String> s=new HashSet<String>();
for(int i=0;i<a.size();i++){
	System.out.println(s.add(a.get(i)));
	System.out.println(s);
	
		
	}
	
Map<String,String>m=new Hashtable<String,String>();
m.put("parama21", "Ananth");
m.put("pudu", "kavitha");
m.put("parama", "abhiram");
m.put("parama", "abhiram1");
m.put("parama21", "abhiram");

System.out.println(m);
Set<Entry<String,String>>is=m.entrySet();
Iterator<Entry<String,String>>in=is.iterator();
for(int i=0;i<m.size();i++ ){
Entry<String,String>iu=in.next();
System.out.println(iu);

Hashtable<String,String>ht1=new Hashtable<String,String>();
ht1.put("karnataka", "bangalore");
ht1.put("andhra", "hyd");
ht1.put("tamilnadu", "chennai");

//System.out.println(ht1);


HashMap<String,String>hm=new HashMap<String,String>();
//for(int i=0;i<ht1.size();i++)
for(int i4=0;i4<ht1.size();i4++){
	hm.putAll(ht1);
System.out.println("hashmap is---"+ht1);

}
}
	}	}

	


