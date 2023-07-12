
public class Palindrome {

	public static void main(String[] args) {

		//Integre values
		int sum=0;
		int n=454;
		int temp=n;
		while(n>0)
		{
	  int remainder=n%10;
	  sum=(sum*10)+remainder;
	  n=n/10;
		}
		if(sum==temp)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}

}
