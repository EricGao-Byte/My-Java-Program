package com.itranswarp.learnjava;

/**
 * for练习
 */
public class Main {

	public static void main(String[] args) {
		double pi = 0;
		int n=3;
		for (int i = 1; i < 100000; i += 2) {
			if(n%2==1) {
				pi+=1.0/i;
			}if(n%2==0){
				pi+=-1.0/i;
			}
			n++;
		}
		pi*=4;
		System.out.println(pi);
	}

}
