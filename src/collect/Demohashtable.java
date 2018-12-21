package collect;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class Demohashtable {

	public static void main(String[] args) {
		
		Hashtable<String,String>jh=new Hashtable<String,String>();
		jh.put("karanataka", "Bangalore");
		jh.put("Andhra", "amaravathi");
		jh.put("telangana", "hyderabad");
		jh.put("tamilnadu", "chennai");
		jh.put("delhi", "delhi");
		jh.put("pondicherry", "pondicherry");
		
		System.out.println("hashtable is-----"+jh);
		
		
		
	Enumeration<String>	en=jh.keys();
	
	
	for(int i=0;i<jh.size();i++){
		
		System.out.println("enumerated key items are" +en.nextElement());
	}

	
Collection<String>c=jh.values();
Iterator<String>il=c.iterator();
for(int i=0;i<jh.size();i++){
System.out.println(il.next());

}
	
	}

}
