import java.util.*;
class Factors
{
	public static void main(String args[])
	{
		int i,j,n,count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the nmber: ");
		n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		System.out.println("no.of factors are: "+count);
	}
}
