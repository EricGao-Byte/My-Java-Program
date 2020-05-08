package com.itranswarp.learnjava;

public class 浮点运算误差 {
	  public static void main(String[] args) {
	        double x = 1.0 / 10;
	        double y = 1 - 9.0 / 10;
	        // 观察x和y是否相等:
	        x=(int)x;
	        y=(int)y;
	        System.out.println(x);
	        System.out.println(y);
			/*
			 * double r = Math.abs(x-y); if (r<0.00001) { System.out.println("equal"); }else
			 * { System.out.println("not equal"); }
			 */
	    }
}
