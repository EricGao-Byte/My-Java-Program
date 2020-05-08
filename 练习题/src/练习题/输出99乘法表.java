package 练习题;

public class 输出99乘法表 {
	public static void main(String[] args)
	{
		int i,j;
		for(i=1;i<=9;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.printf("%d ",i*j);
			}
			System.out.printf("\n");
		}
	}
}
