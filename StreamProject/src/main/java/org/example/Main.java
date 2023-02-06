package org.example;

import org.example.practise.Filter;
import org.example.practise.Sort;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Person> people = Person.getRandomPeople(30);
        int choice = 0;
        Scanner in = new Scanner(System.in);

        do {
            printMenu();
            try {
                printInput();
                choice = in.nextInt();

            } catch (Exception e) {
                printIncorrectInput();
                break;
            }
            switch (choice) {
                case 0 -> {
                    System.out.println("How many people would u like to generate? Must be more than 2");
                    printInput();
                    people = Person.getRandomPeople(in.nextInt());

                }
                case 1 -> {
                    if (people != null && people.size() > 0) {
                        people.forEach(System.out::println);
                    } else System.out.println("Your list is empty!");
                }
                case 2 ->{
                    Filter.Static.printMenu();
                    breakLines();
                    printInput();
                    int tempChoice = in.nextInt();
                    people=Filter.Static.filterList(people,tempChoice);
                }
                case 3 ->{
                    Sort.Static.printMenu();
                    breakLines();
                    printInput();
                    int tempChoice = in.nextInt();
                    people=Sort.Static.sortList(people,tempChoice);
                }
                default -> {choice=-1;}
            }
        }
        while (choice >= 0);

// Group by
/*        Map<Gender,List<Person>> groupByGender=people.stream().collect(Collectors.groupingBy(Person::getGender));
        groupByGender.forEach(((gender, people1) -> {
            System.out.println(gender);
            people1.forEach(System.out::println);
            System.out.println();
        }));*/
    }

    private static void breakLines() {
        System.out.println();
        System.out.println();
    }

    private static void printMenu() {
        System.out.println("0. Generate new list");
        System.out.println("1. Display people from your list");
        System.out.println("2. Filtering list");
        System.out.println("3. Sorting list");
        System.out.println("4. Quit");
    }
    private static void printInput(){
        System.out.print("Your input: ");
    }
    private static void printIncorrectInput(){
        System.out.println("Your input is incorrect!");
    }
}