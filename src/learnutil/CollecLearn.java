package learnutil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollecLearn {
	public static String path1="/or.properties";
	public static void main(String[] args) {
		List<String>l=new ArrayList<String>();
		
	System.out.println(	System.getProperty("user.dir")+path1);
		
		l.add("Ananth");
		l.add("kavitha");
		l.add("abhi");
		l.add("ram");
		
		System.out.println(l);
		
		
	Iterator<String> it	=l.iterator();
	while(it.hasNext()){
		
		System.out.println(it.next());
		
		
		ArrayList<String>al2=new ArrayList<String>();
		
		al2.add("Ananth");
		al2.add("kavitha");
		al2.add("abhi");
		al2.add("ram");
		
		al2.addAll(l);
		
		System.out.println(al2);
		
		
		
		
		
	}

	Map<String,String> map1=new Hashtable<String,String>();
	
	map1.put("name1", "ananth");
	map1.put("name2", "ram");
	map1.put("name3", "bill");
	map1.put("name4", "gates");
	
	System.out.println(map1);
	
Set<String>im=map1.keySet();
Iterator<String>ig=im.iterator();
System.out.println("hastable key is "+ig.next());
Collection<String> c=map1.values();
Iterator <String>il=c.iterator();
System.out.println("hastable value is"+il.next());

	
	
Set<Entry<String,String>>se=map1.entrySet();
System.out.println(se);
Iterator<Entry<String,String>>is=se.iterator();
System.out.println(is);
System.out.println(is.next());


Map<String,String> map2=new HashMap<String,String>();
map2.put("name1", "ananth");
map2.put("name2", "ram");
map2.put("name3", "bill");
map2.put("name4", "gates");

Set<String>io=map2.keySet();
Iterator<String>ik=io.iterator();
System.out.println(ik.next());

Collection<String>iu=map2.values();
Iterator<String>po=iu.iterator();
System.out.println(po.next());


	
	}
	
	

}
