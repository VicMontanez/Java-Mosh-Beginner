package com.intro;

import java.util.Scanner;

public class Main {
    // If divisible by 5 print out FIZZ
    // If divisible by 3 print out BUZZ
    // If divisible by 5 & 3  print out FIZZBUZZ
    // ELSE print out the original input

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        final int userNum = scanner.nextInt();
        System.out.println(userNum);


    }
}
