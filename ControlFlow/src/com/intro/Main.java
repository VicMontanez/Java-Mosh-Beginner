package com.intro;

public class Main {

    public static void main(String[] args) {
        //&& 'and' operator
//       int temperature = 22;
//       boolean isWarm = temperature > 20 && temperature < 30;
//       System.out.println(isWarm);

        //|| 'Or/ operator
        boolean hasHighIncome = false;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord; //! 'not' operator
    }
}
