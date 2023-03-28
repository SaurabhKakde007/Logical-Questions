package Sorting_of_Array;

public class A {
	public static void main(String[] args) {
		
		int[]x= {3,1,6,4,11,20,12,9,0};
		int temp;
		
		for (int j = 0; j < x.length-1; j++) {
			
		for (int i = 0; i < x.length-1; i++) {
			if(x[i]>x[i+1]) {
				temp=x[i];
				x[i]=x[i+1];
				x[i+1]=temp;
			}
		}
	}

		
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}
}
