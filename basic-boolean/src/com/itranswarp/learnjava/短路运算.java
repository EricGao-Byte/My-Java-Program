package com.itranswarp.learnjava;

public class 短路运算 {
	public static void main(String[] args)
	{
		boolean b = 5 < 3;
		boolean result = b && (5 / 0 > 0);
		System.out.println(result);
	}
}
