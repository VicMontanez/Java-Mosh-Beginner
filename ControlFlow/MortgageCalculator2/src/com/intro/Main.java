package com.intro;

import javax.swing.plaf.IconUIResource;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    //Principal values between 1K - 1M
    //Interest rate greater than 0 or less than or equal to 30
    //Years  value between 1 and 30
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Principal: ");
            int principal = scanner.nextInt();
            if (principal < 1000 || principal > 1000000) {
                System.out.println("Enter a value between 1K - 1M");
                continue;
            }
            while (true) {
                System.out.print("Interest Rate: ");
                float rate = scanner.nextFloat();
                if (rate < 0 || rate > 30) {
                    System.out.println("Enter a value between 1 - 30");
                    continue;
                }
                while (true) {
                    System.out.print("Length of loan (Years): ");
                    int years = scanner.nextInt();
                    if (years < 1 || years > 30) {
                        System.out.println("Enter a value between 1 - 30");
                        continue;
                    }

                    int paymentNumber = 12 * years;

                    float monthlyRate = rate / 100 / 12;

                    double mortgage = principal * (monthlyRate * Math.pow(1 + monthlyRate, paymentNumber) / (Math.pow(1 + monthlyRate, paymentNumber) - 1));

                    String mortgageFormatted = NumberFormat.getCurrencyInstance().format((mortgage));
                    System.out.println("Mortgage is: " + mortgageFormatted);
                    break;
                }
              break;
            }
            break;

        }
    }
}