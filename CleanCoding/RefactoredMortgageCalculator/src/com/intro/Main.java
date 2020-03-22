package com.intro;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    //Principal values between 1K - 1M
    //Interest rate greater than 0 or less than or equal to 30
    //Years  value between 1 and 30
    public static void main(String[] args) {
        int principal = (int) readNumber("Principal: ", 1000, 1_000_000);
        float rate = (float)readNumber("Annual Interest Rate: ", 1, 30);
        int years = (int)readNumber("Period (Years): ", 1, 30);



                    double mortgage = calculateMortgage(principal, rate, years);

                    String mortgageFormatted = NumberFormat.getCurrencyInstance().format((mortgage));
                    System.out.println("Mortgage is: " + mortgageFormatted);

                }


    public static double readNumber(String prompt, double min, double max) {
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextFloat();
            if (value >= min || value <= max)
                break;
            System.out.println("Enter a value between " + min + " and " + max);
        }

            return value;
    }

    public static double calculateMortgage(int principal,
                                           float rate,
                                           int years) {
        float monthlyRate = rate / 100 / 12;
        short paymentNumber = (short)(12 * years);

        double mortgage = principal * (monthlyRate * Math.pow(1 + monthlyRate, paymentNumber) / (Math.pow(1 + monthlyRate, paymentNumber) - 1));

        return mortgage;
    }
}

