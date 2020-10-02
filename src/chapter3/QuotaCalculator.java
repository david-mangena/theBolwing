package chapter3;

import java.util.Scanner;

public class QuotaCalculator {

    public static void main(String args[]){

        //Initialize values we know
        int qouta = 10;

        //Get unknown values
        System.out.println("Enter number of sales you made this week:");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Make a decision on the path to take - Output
        if (sales >= qouta){
            int salesOver = qouta + sales;
            System.out.println(salesOver + " Congratualions you have met your qouta");
        }
        else{
            int salesShort = qouta - sales;
            System.out.println("You did not make you qouta. You were " + salesShort + " sales short");
        }

    }
}
