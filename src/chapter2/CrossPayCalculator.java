package chapter2;

import java.util.Scanner;

public class CrossPayCalculator {

    public static void main(String arg[]){
        System.out.println("Enter the number of hours the employee worked");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        //Get the hour pay rate
        System.out.println("Enter employer pay rate");
        double rate = scanner.nextDouble();
        scanner.close();

        //Multiple the hours and pay rate
        double crossPay = rate * hours;

        //Display the results
        System.out.println("The employee's cross pay is: R" + crossPay);
    }

}
