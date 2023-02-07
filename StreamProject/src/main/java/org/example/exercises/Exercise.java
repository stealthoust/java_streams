package org.example.exercises;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exercise {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        List<Integer> integerList = new ArrayList<>() {
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
        List<Integer> numbers = IntStream.rangeClosed(1, 150).boxed().toList();
        List<String> stringList = new ArrayList<>() {
            {
                add("hello");
                add("world");
                add("hello");
                add("world");
            }
        };
        List<String> stringList2 = new ArrayList<>() {
            {
                add("hello");
                add("world");
                add("hi");
                add("javastreams");
            }
        };
        //Exercise1(array,integerList);
        //Exercise2(array, integerList);
        //Exercise3(array, integerList);
        //Exercise4(array, integerList);
        //Exercise5(stringList);
        //Exercise6(stringList);
        //Exercise7(integerList);
        //Exercise8(stringList2);
        Exercise9(numbers);
    }


    public static void Exercise1(int[] array, List<Integer> list) {
        // Sum array numbers
        int arraySum = Arrays.stream(array).sum();
        System.out.println("Sum of the numbers in array: " + arraySum);
        // Sum list numbers
        int listSum = list.stream().mapToInt(l -> l).sum();
        System.out.println("Sum of the numbers in list: " + listSum);

    }

    public static void Exercise2(int[] array, List<Integer> list) {
        // Find number of even numbers
        int arrayNumber = (int) Arrays.stream(array).filter(l -> l % 2 == 0).count();
        System.out.println("Numbers of even numbers in array: " + arrayNumber);
        int listNumber = (int) list.stream().filter(l -> l % 2 == 0).count();
        System.out.println("Numbers of even numbers in list: " + listNumber);

    }

    public static void Exercise3(int[] array, List<Integer> list) {
        // Find number of even numbers
        double arrayNumber = Arrays.stream(array).sum() / array.length;
        System.out.println("Average number in array: " + arrayNumber);
        double listNumber = list.stream().mapToDouble(l -> l).sum() / list.size();
        System.out.println("Average number in list: " + String.format("%.4f", listNumber));
    }

    public static void Exercise4(int[] array, List<Integer> list) {
        // Find min and the max
        int arrayMinNumber = Arrays.stream(array).min().orElse(0);
        int arrayMaxNumber = Arrays.stream(array).max().orElse(0);
        System.out.println("Min and max numbers in array: " + arrayMinNumber + " " + arrayMaxNumber);
        int listMinNumber = list.stream().min(Comparator.comparing(Integer::intValue)).orElse(0);
        int listMaxNumber = list.stream().max(Comparator.comparing(Integer::intValue)).orElse(0);
        System.out.println("Min and max numbers in list: " + listMinNumber + " " + listMaxNumber);
    }

    public static void Exercise5(List<String> list) {
        // Find the number of occurrences of each letter in a list of strings
        // For my purpose, displaying every char in string
/*        String s="Hello";
        s.chars().forEach(c-> System.out.println(Character.valueOf((char)c)));*/
        Map<Character, Long> groupByCharacter = list.stream().flatMap(s -> s.chars().mapToObj(c -> (char) c)).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(groupByCharacter);
        //System.out.println(groupByCharacter);

/*        groupByCharacter.forEach((character, number) -> {
            System.out.print(character+": ");
            System.out.println(number);
        });*/
    }

    private static void Exercise6(List<String> stringList) {
        // Find and display unique words in a list
        stringList = stringList.stream().distinct().sorted(Comparator.comparing(s -> s)).collect(Collectors.toList());
        System.out.println(stringList);
    }

    private static void Exercise7(List<Integer> list) {
        // Sort numbers in list reversed
        list = list.stream().sorted(Comparator.comparing(Integer::intValue).reversed()).collect(Collectors.toList());
        // Alternative way
        // list.sort(Comparator.comparing(Integer::intValue).reversed());
        System.out.println(list);
    }

    private static void Exercise8(List<String> list) {
        // Find strings due to the use of letters:
        String result = list.stream().max(Comparator.comparing(l -> l.length())).orElse(null);
        System.out.println(result);
    }

    private static void Exercise9(List<Integer> integerList) {
        // Filter list to have numbers divisible by 3 and 5
        List<Integer> list = integerList.stream().filter(s -> s % 3 == 0 && s % 5 == 0).toList();
        System.out.println(list);
    }
}
