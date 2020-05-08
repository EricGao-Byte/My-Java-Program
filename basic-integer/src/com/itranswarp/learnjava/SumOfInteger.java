package com.itranswarp.learnjava;

/**
 * Sum of integers.
 */
public class SumOfInteger {

	public static void main(String[] args) {
		int n = 100;
		int i = 1,j;
		// TODO: sum = 1 + 2 + ... + n
		int sum = 0;
		for (j=1;j<=n;j++)
		{
			sum+=i;
			i++;
		}
		System.out.println(sum);
	}

}
