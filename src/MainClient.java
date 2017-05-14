import java.util.Scanner;

public class MainClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner src = new Scanner(System.in);
		System.out.println("Enter no");
		int n = src.nextInt();
		
		//Palindrome p=new Palindrome();
		//p.listPalindrome(n);
		
		//Decimal2Binary db= new Decimal2Binary();
		//db.decimal2Binary(n);
		
		//Binary2Decimal bd= new Binary2Decimal();
		//bd.binary2Decimal(n);
		
		//PrimeNumberSeries pns = new PrimeNumberSeries();
		//pns.displayPrimeSeries();
		
		Floyd f = new Floyd();
		f.floyd();
		src.close();
		
		

	}

}
