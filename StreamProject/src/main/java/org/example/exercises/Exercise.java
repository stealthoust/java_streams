package org.example.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        List<Integer> list = new ArrayList<>() {
            {
                add(2);
                add(0);
                add(5);
                add(1);
                add(3);
                add(10);
                add(8);
            }
        };
        //Exercise1(array,list);
        Exercise2(array,list);
    }

    public static void Exercise1(int[]array,List<Integer>list) {
        // Sum array numbers

        int arraySum = Arrays.stream(array).sum();
        System.out.println("Sum of the numbers in array: " + arraySum);
        // Sum list numbers

        int listSum = list.stream().mapToInt(l -> l).sum();
        System.out.println("Sum of the numbers in list: " + listSum);

    }

    public static void Exercise2(int[]array,List<Integer>list){
        // Find number of even numbers
        int arrayNumber=(int)Arrays.stream(array).filter(l->l%2==0).count();
        System.out.println("Numbers of even numbers in array: "+arrayNumber);

        int listNumber=(int)list.stream().filter(l->l%2==0).count();
        System.out.println("Numbers of even numbers in list: "+listNumber);

    }
}
