package Removing_duplicate_elements;

public class A {
	public static void main(String[] args) {
		int[]x= {1,2,3,3,4,5,6,6,7,7,8,8,9};
		int[]temp=new int[x.length];
		int j=0;
		
		
		for (int i = 0; i < temp.length-1; i++) {
                if(x[i]!=x[i+1]) {
                	temp[j]=x[i];
                	j++;
                }
		
		}
		temp[j]=x[x.length-1];
		for (int i = 0; i < j+1; i++) {
			System.out.println(temp[i]);
		}
	}

}
