package Test;

import java.awt.*;

public class Test2 {
    public static void main(String[] args) {
/*        Integer i = 1;
        System.out.println(i);
        System.out.println(i.toString());

        Point point = new Point (3,4);
        System.out.println(point);
        System.out.println(point.toString());*/

        Employee employee1 = new Employee("Kowalski", 34,4500);
        Employee employee2 = new Employee("Kowalski", 20,2000);

        System.out.println(employee1.equals(employee2));



    }


}
