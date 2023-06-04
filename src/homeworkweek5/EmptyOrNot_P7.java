package homeworkweek5;

import java.util.ArrayList;

/**
 * Write a Java program to test if an array list is empty or not.
 */

public class EmptyOrNot_P7 {
    public static void main(String[] args) {
        Test();

    }
    public static void Test(){
        ArrayList<String> c1= new ArrayList<String>();
        c1.add("Women");
        c1.add("Man");
        c1.add("Plane");
        c1.add("KING");
        c1.add("Animal");
        System.out.println("Original array list: " + c1);
        System.out.println("Checking the above array list is empty or not! "+c1.isEmpty());
        c1.removeAll(c1);
        System.out.println("Array list after remove all elements "+c1);
        System.out.println("Checking the above array list is empty or not! "+c1.isEmpty());
    }
}

