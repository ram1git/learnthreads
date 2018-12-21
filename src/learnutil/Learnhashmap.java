package learnutil;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Learnhashmap {
public static String up;
	public static void main(String[] args) {
		Learnhashmap l1 = new Learnhashmap();
		Map k = l1.map1();
		 System.out.println("values are"+k);

		

			Collection<String> c = k.values();

			Iterator<String> iu = c.iterator();
			
			

			while (iu.hasNext()){
          				
       
       up=iu.next();
       
      /* System.out.println(up);
       
       System.out.println(up);*/
       String ar[]=up.split("/");
       System.out.println(ar[0]);
       System.out.println(ar[1]);
			}		
	
			}
		

	
		
	public Map map1(){
		HashMap<String,String> map=new HashMap<String,String>();
		map.put("username password1", "username1/password1");
		map.put("username password2", "username2/password2");
		map.put("username password3", "username3/password3");
		map.put("username password4", "username4/password4");
		map.put("username password5", "username5/password5");
		
	//	System.out.println(map);
		
		return map;	
		
	}

}
