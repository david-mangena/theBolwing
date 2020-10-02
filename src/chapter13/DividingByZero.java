package chapter13;

public class DividingByZero {


    public static void main(String[] args){
        try {
            divide();
        } catch (Exception e){
            System.out.println("Division is fun");
        }

    }

    private static int divide() throws Exception{
        int c = 30/0;
       return c;
    }
}
