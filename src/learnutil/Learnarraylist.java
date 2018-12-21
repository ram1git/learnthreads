package learnutil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Learnarraylist {

	public static void main(String[] args) {
		List<String> li = new ArrayList<String>();
		li.add(0, "hello");
		li.add(1, "hello2");
		li.add(2, "hello3");
		li.add(3, "hello4");
		System.out.println(li);

		System.out.println(li.get(3));

		ArrayList<String> lh = new ArrayList<String>();
		lh.add(0, "hello6");
		lh.add(1, "hello5");
		lh.add(2, "hello4");
		lh.add(3, "hello3");
		lh.add(4, "hello2");
		lh.add(5, "hello1");

		System.out.println(lh);

		lh.add("hello6");
		lh.add("hello5");
		lh.add("hello4");

		System.out.println(lh);

		LinkedList<String> ll = new LinkedList<String>();
		ll.add("dilip");
		ll.add("ananth");
		ll.add("charan");
		ll.add("pranav");
		ll.add("chiruananth");

		System.out.println("linkedlist---is " + ll);
		LinkedList<String> l2 = new LinkedList<String>();
		l2.add("dilip1");
		l2.add("ananth1");
		l2.add("charan1");
		l2.add("pranav1");
		l2.add("chiruananth1");

		System.out.println(l2.pollFirst());

		LinkedList<String> l3 = new LinkedList<String>();
		l3.add("dilip1");
		l3.add("ananth1");
		l3.add("charan1");
		l3.add("pranav1");
		l3.add("chiruananth1");
		System.out.println(l3.pollLast());

		LinkedList<String> l4 = new LinkedList<String>();
		l4.add("dilip1");
		l4.add("ananth1");
		l4.add("charan1");
		l4.add("pranav1");
		l4.add("chiruananth1");
		System.out.println(l4.poll());
		LinkedList<String> l5 = new LinkedList<String>();
		l5.add("dilip1");
		l5.add("ananth1");
		l5.add("charan1");
		l5.add("pranav1");
		l5.add("chiruananth1");

		System.out.println(l5.peek());

		LinkedList<String> l6 = new LinkedList<String>();
		l6.add("dilip1");
		l6.add("ananth1");
		l6.add("charan1");
		l6.add("pranav1");
		l6.add("chiruananth1");
		System.out.println(l6.peekFirst());

		LinkedList<String> l7 = new LinkedList<String>();
		l7.add("dilip1");
		l7.add("ananth1");
		l7.add("charan1");
		l7.add("pranav1");
		l7.add("chiruananth1");
		System.out.println(l7.peekLast());

		LinkedList<String> l8 = new LinkedList<String>();
		l8.add("dilip1");
		l8.add("ananth1");
		l8.add("charan1");
		l8.add("pranav1");
		l8.add("chiruananth1");
		System.out.println(l8.pollLast());

		LinkedList<String> l9 = new LinkedList<String>();
		l9.add("dilip1");
		l9.add("ananth1");
		l9.add("charan1");
		l9.add("pranav1");
		l9.add("chiruananth1");
		System.out.println(l9.pollLast());

		LinkedList<String> l10 = new LinkedList<String>();
		l10.add("dilip1");
		l10.add("ananth1");
		l10.add("charan1");
		l10.add("pranav1");
		l10.add("chiruananth1");
		System.out.println(l10.pop());

		LinkedList<String> l11 = new LinkedList<String>();
		l11.add("dilip1");
		l11.add("ananth1");
		l11.add("charan1");
		l11.add("pranav1");
		l11.add("chiruananth1");
		ll.push("");
		System.out.println(l11);

		List<String> lv = new Vector<String>();
		lv.add("dilip1");
		lv.add("dilip2");
		lv.add("dilip3");
		lv.add("dilip4");
		lv.add("dilip5");
		lv.add("dilip6");

		System.out.println(lv);

		Map<String, String> m = new HashMap<String, String>();
		m.put("key1", "ram");
		m.put("key2", "ananth");
		m.put("key3", "kavitha");
		m.put("key4", "abhiram");
		m.put("key5", "pudupakam");

		System.out.println(m);

		System.out.println(m.get("key3"));
		Set<Entry<String, String>> se = m.entrySet();
		Iterator<Entry<String, String>> it = se.iterator();
		for (int i = 0; i < se.size(); i++) {

			System.out.println("printing1" + it.next());
		}

		Set<String> j = m.keySet();
		Iterator<String> io = j.iterator();

		for (int i = 0; i < j.size(); i++) {

			System.out.println("printing2" + io.next());
		}

		Collection<String> c = m.values();

		Iterator<String> hg = c.iterator();
		for (int i = 0; i < c.size(); i++) {

			System.out.println("printing3" + hg.next());
		}

		Map<String, String> ht = new Hashtable<String, String>();
		ht.put("key1", "ram");
		ht.put("key2", "ananth");
		ht.put("key3", "kavitha");
		ht.put("key4", "abhiram");
		ht.put("key5", "pudupakam");

		System.out.println(ht);

		System.out.println(ht.get("key3"));

		Hashtable<String, String> jt = new Hashtable<String, String>();
		jt.put("t1", "t2");
		jt.put("t2", "t3");
		jt.put("t2", "t4");
		jt.put("t4", "t5");
		jt.put("t5", "t6");
		jt.put("t6", "t7");

		// System.out.println(jt);
		System.out.println(ht.get("key5"));

		Enumeration<String> er = jt.keys();
		// System.out.println(er.nextElement());

		Set<String> st = new HashSet<String>();
		st.add("chiruananth1");
		st.add("dilip1");
		st.add("ananth1");
		st.add("charan1");
		st.add("pranav1");
		st.add("chiruananth1");

		System.out.println(st);

		Iterator<String> iu = st.iterator();
		for (int i = 0; i < st.size(); i++)
			System.out.println(iu.next());

		Set<String> st1 = new TreeSet<String>();
		st1.add("chiruananth1");
		st1.add("dilip1");
		st1.add("ananth1");
		st1.add("charan1");
		st1.add("pranav1");
		st1.add("chiruananth1");

		System.out.println(st1);

		Iterator<String> iu1 = st1.iterator();
		for (int i = 0; i < st1.size(); i++)
			System.out.println(iu1.next());

	}

}
