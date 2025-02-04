package week1.day2;

public class IsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input = 12421;
		int n = input;
		int output=0;
		
		for(int i=n; i>=1; i=n) {			
			output = output*10 + n%10;
			n = n/10;			
		}
		
		
		if(output==input) {
			System.out.println("It is a Palindrome");
		} 
		else {
			System.out.println("It is not a Palindrome");
		}

	}

}
