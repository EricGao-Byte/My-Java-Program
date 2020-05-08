package 练习题;

public class 打印星星 {
	public static void main(String[] args)
	{
		int i,j;
		for(i=1;i<=6;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=1;i<=6;i++)
		{
			for(j=5;j>=i;j--)
			{
				System.out.print(" ");
				
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=1;i<=6;i++)
		{
			for(j=6;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=1;i<=6;i++)
		{
			for(j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(j=6;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=1;i<=6;i++)
		{
			for(j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(j=1;j<=(2*i-1);j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=1;i<=9;i++)
		{
			if(i<=5)
			{
				for(j=1;j<=5-i;j++)
				{
					System.out.print(" ");
				}
				for(j=1;j<=(2*i-1);j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			else
			{
				for(j=1;j<=(i-5);j++)
				{
					System.out.print(" ");
				}
				for(j=1;j<=(19-2*i);j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			
		}
		
	}
}
