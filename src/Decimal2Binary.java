
public class Decimal2Binary {

	public void decimal2Binary(int n)
	{
		int binary[]  =new int[30];
		int index=0;
		while(n>0)
		{
			int c = n%2;
			binary[index]=c;
			n=n/2;
			index++;
		}
		System.out.println(index);
		
		for(int i=index-1;i>=0;i--)
		{
			System.out.print(binary[i]);
		}
		
		
	}
}
