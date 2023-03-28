package Even_and_Odd;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int x = sc.nextInt();
		
		if(x%2==0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
	}

}
