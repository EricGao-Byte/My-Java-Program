package com.itranswarp.learnjava;
//如何格式化输出
public class FormattedOutput {
	public static void main(String[] args) {
		int a = 12900000;
		System.out.println(a); // 1.29E7
		System.out.printf("a=%d, hex=%08x\n", a, a); // 注意，两个%占位符必须传入两个数
		double d = 3.1415926;
		System.out.printf("%.2f\n", d);// 显示两位小数3.14
		System.out.printf("%.4f\n", d); // 显示4位小数3.1416
	}
}
