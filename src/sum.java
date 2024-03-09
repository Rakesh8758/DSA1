import java.util.Scanner;

public class sum 
{
	public static void main(String[] args)
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter digits ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			sum=sum+n%10;
			n=n/10;
		}
		System.out.println("sum "+sum);

	}

}
