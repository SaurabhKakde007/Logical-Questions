package Amstrong_number;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int no = sc.nextInt();
              
		int temp=0,rem,rev=0;
		temp=no;
		
		while(temp>0) {
			rem=temp%10;
			rev=(rem*rem*rem)+rev;
			temp=temp/10;
			
		}if(no==rev) {
			System.out.println(no+"is a amstrong number:");
		}else {
			System.out.println(no+"is not a amstrong number:");
		}
	}

}
