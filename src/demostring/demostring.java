package demostring;

public class demostring {
	
	public static String s="Ananth ram1";
	public static String s2="Ananth ram";

	
	public static void main(String[] args) {
	System.out.println(	s.equals(s2));
	System.out.println(	s==s2);
	String s3=new String("ram");
	String s4=new String("ram");
	System.out.println(s3);
	System.out.println(s4);
	System.out.println("object comparision----"+s3.equals(s4));
	System.out.println("string compariosion----"+s==s2);
	
	while(s==s2){
	
		System.out.println("string values");
		
		break;
		
	}

	System.out.println("string values");
	
	s.replace('a', 'b');
	
	System.out.println(s);
	
	s.replaceAll("ram1", "ram2");
	
	System.out.println(s);
	
String[] g=	s.split(" ");

System.out.println(g[1]);

s.trim();

System.out.println(s);


StringBuffer s=new StringBuffer("hello i am great");
s.append('a');
System.out.println(s);

char[]a={'a','b','d'};

System.out.println(a);

s.append(a[2]);
System.out.println(s);

s.append("wonderful");

System.out.println(s);


s.append(a, 1, 2);

System.out.println(s);

s.insert(3, a);

System.out.println(s);
s.insert(4, "world");
System.out.println(s);

s.subSequence(4, 8);
System.out.println(s);

s.setLength(4);

System.out.println(s);

s.reverse();
System.out.println(s);




	}

}
