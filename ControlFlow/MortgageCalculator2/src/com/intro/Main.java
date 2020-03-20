package com.intro;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    //Principal values between 1K - 1M
    //Interest rate greater than 0 or less than or equal to 30
    //Years  value between 1 and 30
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();
        System.out.print("Interest Rate: ");
        float rate = scanner.nextFloat();
        System.out.print("Length of loan (Years): ");
        int years = scanner.nextInt();
        if (years < 1 && years > 30)
            System.out.println("Enter a value between 1 and 30");


        int paymentNumber = 12 * years;

        float monthlyRate = rate / 100 / 12;

        double mortgage = principal * (monthlyRate * Math.pow(1 + monthlyRate, paymentNumber) / (Math.pow(1 + monthlyRate, paymentNumber) - 1));

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format((mortgage));
        System.out.println("Mortgage is: " + mortgageFormatted);

    }
}