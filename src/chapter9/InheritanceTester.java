package chapter9;

public class InheritanceTester {

    public static void main(String[] args){

 //       Person person = new Person();
//        Employee employee = new Employee();

        Mother mom = new Mother();
        mom.setName("Glenda");

        System.out.println(mom.getName() + " is a " + mom.getGender());


        Square square = new Square();
        square.setLength(4);
        square.setWidth(4);
        System.out.println(square.calculatePerimeter());
    }
}
