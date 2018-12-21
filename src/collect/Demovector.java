package collect;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;

public class Demovector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String>al=new ArrayList<String>();
		al.add("ananth");
		al.add("jack");
		al.add("tom");
		al.add("peter");
		al.add("mary");
		al.add("david");
		al.add("joseph");
		al.add("john");
		Vector<String> va=new Vector<String>();
		va.addAll(al);
		System.out.println(va);
Enumeration<String>	en=	va.elements();
for(int i=0;i<va.size();i++){
	
System.out.println(en.nextElement());


HashSet<String>gh=new HashSet<String>();
gh.add("hello");
gh.add("hello2");
gh.add("ananth");
gh.add("peter");
gh.add("mary");
gh.add("joseph");
System.out.println("the output of hashset is ----"+gh);


TreeSet<String>gh1=new TreeSet<String>();
gh1.add("hello");
gh1.add("hello2");
gh1.add("ananth");
gh1.add("peter");
gh1.add("mary");
gh1.add("joseph");
System.out.println("the output of treeset is ----"+gh1);


HashMap<String,String> hj=new HashMap<String,String>();
hj.put("e", "ananth");
hj.put("d", "ananth1");
hj.put("c", "ananth2");
hj.put("b", "ananth3");
hj.put("a", "ananth4");

System.out.println(hj);
hj.put("d" ,"abhiram");
System.out.println(hj);
Set<String>ss=hj.keySet();
Iterator<String>df=ss.iterator();
System.out.println(df.next());
Set<Entry<String,String>>cv=hj.entrySet();
Iterator<Entry<String,String>>d2=cv.iterator();
System.out.println(d2.next());
Collection<String>ui=hj.values();
Iterator<String>fs=ui.iterator();
System.out.println(fs.next());


List<String>g=new Vector<String>();

g.add("hello");
g.add("hello1");
g.add("hello2");
g.add("hello3");
g.add("hello4");
g.add("hello5");

System.out.println(g+"vector is-----");

Vector<String>v=new Vector<String>();
v.add("enhello");
v.add("enhello1");
v.add("enhello3");
Enumeration<String>e=v.elements();

while(e.hasMoreElements())
System.out.println(e.nextElement());

}
	

	}
}

	

