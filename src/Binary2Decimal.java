
public class Binary2Decimal {

	public void binary2Decimal(int n)
	{
		int remainder=0;
		double res=0;
		int i=0;
		int count=0;
		double out=0;
		
		for(int j=0;;j++)
		{
			int a = n%2;
			if(a==1)
			{
				count++;
				 out = out + Math.pow(2, j);
			}
			n=n/10;
			if(n==0)
			{
				break;
			}
			
		System.out.println(out);		
			
		}
			 while(n>0)
			 {
				  
				 remainder = n%2;
				 if(remainder==1)
				 {
					 res= res+Math.pow(2, i);
				 }
				 	i++;
				 n=n/10;
			 }
			 System.out.println(res);
		}
	}

