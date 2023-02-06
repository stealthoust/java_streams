package org.example.practise;

import org.example.Gender;
import org.example.Person;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Filter {

    public static class Static {

        public static void printMenu(){
            System.out.println("0. Filter by gender (women)");
            System.out.println("1. Filter by gender (men)");
            System.out.println("2. Filter by age (over 18)");
            System.out.println("3. Filter by age (under 18)");
            System.out.println("4. Filter by age (over *YOUR ENTER*)");
            System.out.println("5. Filter by age (under *YOUR ENTER*)");
            System.out.println("6. Back");
        }

        public static List<Person> filterList(List<Person> people,int number){
            switch (number) {
                case 0 ->
                        people = people.stream().filter(person -> person.getGender().equals(Gender.FEMALE)).collect(Collectors.toList());
                case 1 ->
                        people = people.stream().filter(person -> person.getGender().equals(Gender.MALE)).collect(Collectors.toList());
                case 2 -> people = people.stream().filter(person -> person.getAge() >= 18).collect(Collectors.toList());
                case 3 -> people = people.stream().filter(person -> person.getAge() < 18).collect(Collectors.toList());
                case 4 -> {
                    Scanner sc = new Scanner(System.in);
                    try {
                        int age = sc.nextInt();
                        sc.close();
                        if (age < 1) throw new Exception();
                        else {
                            people = people.stream().filter(person -> person.getAge() >= age).collect(Collectors.toList());
                        }
                    } catch (Exception e) {
                        System.out.println("It's not valid input! Try number over 1");
                    }
                }
                case 5 -> {
                    Scanner sc2 = new Scanner(System.in);
                    try {
                        int age = sc2.nextInt();
                        sc2.close();
                        if (age < 1) throw new Exception();
                        else {
                            people = people.stream().filter(person -> person.getAge() < age).collect(Collectors.toList());
                        }
                    } catch (Exception e) {
                        System.out.println("It's not valid input! Try number over 1");
                    }
                }
                case 6 ->{}
                default -> System.out.println("\u001B[31m" + "Nothing happened to your list." + "\u001B[0m");
            }
            return people;

        }
    }
}
