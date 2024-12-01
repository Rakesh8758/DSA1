public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] ar= {1,2,3,4,5};
		int maxval = Main.Max(ar);
		System.out.print(maxval);
		

	}
	static int Max(int[] ar)
	{
		int max=0;
		for(int i=0;i<ar.length;i++)
		{
			
			if(max<ar[i])
			{
				max=ar[i];
				
			}
			
		}
		return max;
	}

}
