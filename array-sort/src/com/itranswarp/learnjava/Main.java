package com.itranswarp.learnjava;

import java.util.Arrays;

/**
 * 降序排序
 */
public class Main {
	public static void main(String[] args) {
		int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
		// 排序前:
		System.out.println(Arrays.toString(ns));
		// TODO:
		Arrays.sort(ns);
		int i,t;
		for(i=0;i<=4;i++) {
			t=ns[i];
			ns[i]=ns[10-1-i];
			ns[10-1-i]=t;
		}
		// 排序后:
		System.out.println(Arrays.toString(ns));
		if (Arrays.toString(ns).equals("[96, 89, 73, 65, 50, 36, 28, 18, 12, 8]")) {
			System.out.println("测试成功");
		} else {
			System.out.println("测试失败");
		}
	}
}
