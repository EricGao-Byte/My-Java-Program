package 练习题;

import java.util.Scanner;
import java.util.Arrays;

public class 数组元素输入 {
	public static void main(String[] args) {
		String a[]=new String[3];//定义一个长度为3的字符数组
		Scanner scan =new Scanner(System.in);
		for (String c : a) {
			c=scan.next();
		}
		for (String c : a) {
			System.out.println(c);
		}
	}
}
