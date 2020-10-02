package chapter3;

import java.util.Scanner;

public class LoanQualifier {

    public static void main(String arg[]){

        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        System.out.println("Enter your salary");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();


        System.out.println("Enter number of years with your current employee:");
        double years = scanner.nextDouble();
        scanner.close();


        if (salary >= requiredSalary){
            if(years >= requiredYearsEmployed){
                System.out.println("Congrate! you qualify");
            }
            else {
                System.out.println("Sorry! you must have worked at your current job" + requiredYearsEmployed + "years");
            }
        }
        else {
            System.out.print("Sorry you must earn at least R" + salary + "to qualify for a loan");
        }

    }
}
