package com.itranswarp.learnjava;

import java.util.Scanner;

public class HowToInput {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);// 创建一个Scanner对象
		System.out.print("Input your name:");
		String name = scanner.nextLine();// 读取一行输入并获取字符串
		System.out.print("Input your age:");
		int age = scanner.nextInt();// 读取一行输入并获取整数
		System.out.printf("Hi, %s,you are %d\n", name, age);//格式化输出
		
	}
}
