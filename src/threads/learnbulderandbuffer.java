package threads;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class learnbulderandbuffer {

	public static void main(String[] args) {

		Hashtable<String, String> ht1 = new Hashtable<String, String>();

		ht1.put("karnataka1", "bangalore");
		ht1.put("andhra0", "hyd");
		ht1.put("karnataka2", "chennai");

		// System.out.println(ht1);

		HashMap<String, String> hm = new HashMap<String, String>();
		// for(int i=0;i<ht1.size();i++)
		//for (int i4 = 0; i4 < ht1.size(); i4++) {
			hm.putAll(ht1);
			System.out.println("hashmap is---" + ht1);

		ht1.putAll(hm);

		 System.out.println("ht ---is"+ ht1);
		 
	Set<Entry<String,String>>lj=	 hm.entrySet();
Iterator<Entry<String,String>>ih=	lj.iterator();
for(int i=0;i<hm.size();i++){
System.out.println("the value are "+ih.next());
	
}


	}

}
