package Reverse_String;

public class A {   //Reserve a string
	public static void main(String[] args) {
		
		String str="saurabh kakde";
		
		for (int i = str.length()-1; i >=0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println(" ");
		String str1="Swami vivekanand";
		for (int i = str1.length()-1; i >=0; i--) {
			System.out.print(str1.charAt(i));
		}
	}

}
