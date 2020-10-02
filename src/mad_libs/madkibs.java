//Create a program that asks a user for , then a whole number, then an adjective.

package mad_libs;

import java.util.Scanner;

public class madkibs {

    public static void main(String arg[]){


        System.out.println("Please enter your favorite season?");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        //Get the num
        System.out.println("Enter number from 1 to 10");
        int num = scanner.nextInt();

        System.out.println("Enter your worse adjective weather!");
        String adjective = scanner.next();
        scanner.close();


        //Display the results
        System.out.println("On a " +  adjective +" "+ season + " day, I drink a minimum of " + num + " cups of coffee ");
    }

}
