import java.util.Scanner;

public class PrimeNumberSeries {
	
	public void displayPrimeSeries()
	{
		String primeseries="";
		int counter=0;
		System.out.println("Enter threshold no");
		Scanner src = new Scanner(System.in);
		int n = src.nextInt();
		int arr[]=null;
		for(int i=2;i<n;i++)          // increment counter when no is not prime 
		{
			for(int j=2;j<i;j++)
			{
				counter=0;
				if(i%j==0)
				{
					counter++;
					break;
				}
			}
			if(counter==0)
			{
				System.out.println(i);
			}
		}
		
		for(int i=2;i<=n;i++)        ///increment counter when no is prime 
		{
			counter=0;
			for(int j=i;j>=1;j--)
			{
				if(i%j==0)
				{
					counter++;
				}
			}
			if(counter==2)           //1-divide by itself 2- divide by 1
			{
				 primeseries= primeseries+ i+"   ";
				
			}
		}
		System.out.println(primeseries);
		
	}
	
	

}
