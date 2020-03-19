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
        if (userNum % 3 == 0 && userNum % 5 == 0)
            System.out.println("FIZZBUZZ");
        else if(userNum % 5 == 0)
            System.out.println("FIZZ");
        else if(userNum % 3 == 0)
            System.out.println("BUZZ");
        else
            System.out.println(userNum);

    }
}
