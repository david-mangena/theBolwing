package chapter9;

public class Square extends Rectangle {


    @Override
    public double calculatePerimeter(){
        return side * length;
    }

    public void print(String what){
        System.out.println("This is a" + what);
    }
}
