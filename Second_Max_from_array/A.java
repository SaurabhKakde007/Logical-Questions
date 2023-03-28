package Second_Max_from_array;

public class A { //second max from array
	public static void main(String[] args) {
		
		int[]x= {23,34,45,56,67,78,89};
		int temp=0;
		for (int j = 0; j < x.length-1; j++) {
			
		for (int i = 0; i < x.length-1; i++) {

			if(x[i]< x[i+1]) {
				temp=x[i];
				x[i]=x[i+1];
				x[i+1]=temp;
				
			}
		}
	}
		System.out.println(x[2]);
	}
}
