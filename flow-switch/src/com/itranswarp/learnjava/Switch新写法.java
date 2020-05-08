package com.itranswarp.learnjava;

import java.util.Scanner;

public class Switch新写法 {
	public static void main(String[] args) {

		
        String fruit = "apple";
        switch (fruit) {
        case "apple" -> System.out.println("Select apple");
        case "pear" -> System.out.println("Select pear");
        case "mango" -> 
        {
        	System.out.println("Select mango");
        	System.out.println("Good choice!");
        }
        default -> System.out.println("No fruit selected");
        }
    }
}
