package org.example.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise {
    public static void main(String[] args) {
Exercise1();
    }

    public static void Exercise1() {
        // Sum array numbers
        int [] array={1,2,3,4,5};
        int arraySum= Arrays.stream(array).sum();
        System.out.println("Sum of the numbers in array: "+arraySum);

        // Sum list numbers
        List<Integer> list = new ArrayList<>() {
            {
                add(2);
                add(5);
                add(1);
                add(3);
                add(10);
                add(8);
            }
        };
        int listSum=list.stream().mapToInt(l-> l).sum();
        System.out.println("Sum of the numbers in list: "+listSum);

    }
}
