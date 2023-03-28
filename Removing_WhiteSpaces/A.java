package Removing_WhiteSpaces;

public class A {
	public static void main(String[] args) {
		String x="Have a good day sir";
		String r=x.replaceAll(" ", "");
		System.out.println(r);
		
		String x2="I am going to school";
		String e=x2.replaceAll("I", "we");
	System.out.println(e);
	}

}
