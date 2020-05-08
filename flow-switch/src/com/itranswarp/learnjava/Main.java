package com.itranswarp.learnjava;

import java.util.Scanner;

/**
 * switch实现石头/剪子/布并判断胜负
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("please choice:");
		System.out.println(" 1: Rock");
		System.out.println(" 2: Scissors");
		System.out.println(" 3: Paper");
		// 用户输入:
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		
		// 计算机随机数 1, 2, 3:
		int random = 1 + (int) Math.random() * 3;
		switch(random)
		{
		case 1:
			System.out.println("对手出了石头");
			break;
		case 2:
			System.out.println("对手出了剪刀");
			break;
		case 3:
			System.out.println("对手出了布");
			break;
		}
		switch (choice) 
		{
		case 1:
			if(random==1)
			{
				System.out.println("平局了");
			}else if(random==2)
			{
				System.out.println("你赢了");
			}else
			{
				System.out.println("你输了");
			}break;
		case 2:
			if(random==1)
			{
				System.out.println("你输了");
			}else if(random==2)
			{
				System.out.println("平局了");
			}else
			{
				System.out.println("你赢了");
			}break;
		case 3:
			if(random==1)
			{
				System.out.println("你赢了");
			}else if(random==2)
			{
				System.out.println("你输了");
			}else
			{
				System.out.println("平局了");
			}break;
		}
		
		
	}

}
