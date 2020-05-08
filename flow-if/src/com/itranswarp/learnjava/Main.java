package com.itranswarp.learnjava;

import java.util.Scanner;

/**
 * 计算BMI
 */
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Height (m): ");
		double height = scanner.nextDouble();
		System.out.print("Weight (kg): ");
		double weight = scanner.nextDouble();
		// FIXME:
		double bmi = 0;
		// TODO: 打印BMI值及结果
		bmi = weight/(height*height);
		System.out.printf("Your BMI is:%f\n", bmi);
		if(bmi<18.5)
		{
			System.out.println("过轻：低于18.5");
		}else if(bmi>=18.5&&bmi<25)
		{
			System.out.println("正常：18.5-25");
		}else if(bmi>=25&&bmi<28)
		{
			System.out.println("过重：25-28");
		}else if(bmi>=28&&bmi<32)
		{
			System.out.println("肥胖：28-32");
		}else
		{
			System.out.println("非常肥胖：高于32");
		}
	}

}
