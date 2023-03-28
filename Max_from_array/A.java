package Max_from_array;

public class A {
	public static void main(String[] args) {
		
		int[]x= {10,20,30,40,50,60,70};
		int max=x[0];
		for (int i = 0; i < x.length; i++) {
			if(x[i]>max) {
				max=x[i];
				
			}
		}
		System.out.println(max);
	}

}
