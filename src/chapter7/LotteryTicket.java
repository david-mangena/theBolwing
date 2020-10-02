package chapter7;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {

    private static final int LENGTH = 4;
    private static final int MAX_TICKET_NUM = 50;

    public static void main(String[] args){

        int ticket[] = generateNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);

    }

    public static int[] generateNumbers(){
        int[] ticket = new int[LENGTH];

        Random random = new Random();

        for (int i = 0; i < LENGTH; i++){
            int randomNum;

            do {
                randomNum = random.nextInt(MAX_TICKET_NUM);
            }while (search(ticket, randomNum));
                ticket[i] = randomNum;
                if (ticket[i] == 0 || ticket[i] == 49){
                    ticket[i] += 1;
                }
        }

        return ticket;
    }

    /**
     * Does a sequential search on the array to find a value
     * @param array Array to search through
     * @param numToSearchFor Value to search for
     * @return true if found, false if not
     */

    public static boolean search(int[] array, int numToSearchFor){
        /**
         * this is called an enhanced loop.
         * It iterates through 'array' and
         * each time assigns the current element to 'value'
         */

        for (int value : array){
            if (value == numToSearchFor){
                return true;
            }
        }

        /**
         * If we've reached this point, then the entire array was searched
         * and the value was not found
         */
        return false;
    }

    public static void printTicket(int ticket[]){
        for (int i=0; i < LENGTH; i++){
            System.out.print(ticket[i] + " | ");
        }
    }
}

