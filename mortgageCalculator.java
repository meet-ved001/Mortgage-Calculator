import java.text.NumberFormat;
import java.util.Date;
import java.util.Scanner;

import jdk.jfr.Percentage;

class Main {

    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;

        final byte PERCENT = 100;

        Scanner scaner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scaner.nextInt();

        System.out.print("Annual interest rate: ");
        float annualInterest = scaner.nextFloat();

        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Period(years): ");
        byte years = scaner.nextByte();

        int numberOfPayment = years * MONTHS_IN_YEAR;

        double mortgage = (principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayment))
                / (Math.pow(1 + monthlyInterest, numberOfPayment) - 1))/74;
        String mortgageFormated=NumberFormat.getCurrencyInstance().format(mortgage);
        
        System.out.println("Mortgage: "+mortgageFormated);
            }

}