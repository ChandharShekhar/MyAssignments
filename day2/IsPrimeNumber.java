package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 16129;
		
		for(int i=2; i<=n; i++) {
			
			if (i==n) {
				System.out.println("prime");
			}
			else if (n%i==0) {
				System.out.println("non-prime");
				break;
			}
		}

	}

}
