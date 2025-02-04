package week1.day2;

public class GenerateFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=3;
		int[] j= new int[a];
		
		for(int i=0; i<a; i++) {
			if (i<2) {
				j[i] = i;
			}
			else {
				j[i]=j[i-1]+j[i-2];
			}
			System.out.print(j[i]);
			if(i<a-1) {
				System.out.print(", ");
			}
		}
	}

}
