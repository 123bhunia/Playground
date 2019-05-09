import java.util.Scanner;
class Main
{
	public static void main(String[] args) 
	{
       Scanner sc= new Scanner(System.in);
      int n=sc.nextInt();
      int a[]= new int[n];
      
      for(int j=0; j<n; j++)
      {
        a[j]=sc.nextInt();
      }
      

		int max = a[0];
		int index = 0;

		for (int i = 0; i < a.length; i++) 
		{
			if (max < a[i]) 
			{
				max = a[i];
				index = i;
			}
		}

		System.out.println(index);
} 
}