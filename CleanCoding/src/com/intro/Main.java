package com.intro;

public class Main {

    public static void main(String[] args) {
        String message = greetUser("Vic", "M");
    }

    public static String greetUser(String firstName, String lastName){
        return "Hello" + firstName + " " + lastName;
    }
}
