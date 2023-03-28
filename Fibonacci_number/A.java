package Fibonacci_number;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value:");
		int no = sc.nextInt();
	
	int a=0;
	int b=1;
	int c=0;
	
	System.out.println(a);
	System.out.println(b);
	
	for (int i = 0; i < no; i++) {
		c=a+b;
		
		if(c<=no) {
			System.out.println(c);
			a=b;
			b=c;
		}
	}
	
	}

}
