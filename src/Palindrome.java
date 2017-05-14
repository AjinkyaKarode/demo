
public class Palindrome {

	public void listPalindrome(int n)
	{
		int a=1,b=1;
		System.out.println(a);
		System.out.println(b);
		for(int i=1;i<=n-2;i++)
		{
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
		}
	}
}
