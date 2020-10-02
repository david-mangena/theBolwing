package chapter7;

import java.util.Scanner;

public class WeekDays {

    public static String[] weekDays = {"Monday", "Tuesday", "wednesday", "Thursday", "Friday","Saturday","Sunday"};
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] agrs){

        System.out.println("Whats today's number day of the week");
        int num = scanner.nextInt()-1;
        System.out.println(weekDays[num]);

    }
}
