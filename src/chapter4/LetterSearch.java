package chapter4;

import java.util.Scanner;

public class LetterSearch {

    public static  void  main(String arg[]){

        System.out.println("Enter some texts");
        Scanner scanner = new Scanner(System.in);

        String text = scanner.next();
        scanner.close();

        boolean letterFound = false;

        //Search text Letter A
        for (int i=0; i< text.length();i++){
            char currentLetter = text.charAt(i);
            if(currentLetter == 'D' || currentLetter == 'a'){
                letterFound = true;
                break;
            }

            if(letterFound){
                System.out.println("This text contains the letter A");
            } else {
                System.out.println("This text does not contains the letter A");

            }

        }
    }
}
