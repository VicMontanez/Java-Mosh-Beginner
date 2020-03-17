package com.intro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();
        System.out.print("Interest Rate: ");
        float rate = scanner.nextFloat();
        System.out.print("Length of loan (Years): ");
        int years = scanner.nextInt();

        int paymentNumber = 12 * years;

        float monthlyRate = rate / 100 / 12;

        double mortgage = principal * (monthlyRate * Math.pow(1 + monthlyRate, paymentNumber) / (Math.pow(1 + monthlyRate, paymentNumber) - 1));

        System.out.println(mortgage);

    }
}
