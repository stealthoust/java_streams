package org.example.practise;

import org.example.Person;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sort {

    public static class Static{

        public static void printMenu(){
            System.out.println("0. Sort by first name");
            System.out.println("1. Sort by first name reversed");
            System.out.println("2. Sort by last name");
            System.out.println("3. Sort by last name reversed");
            System.out.println("4. Sort by gender");
            System.out.println("5. Sort by gender reversed");
            System.out.println("6. Sort by age");
            System.out.println("7. Sort by age reversed");
        }

        public static List<Person> sortList(List<Person> people, int number){
            switch (number) {
                case 0 ->
                        people = people.stream().sorted(Comparator.comparing(Person::getFirstName)).collect(Collectors.toList());
                case 1 ->
                        people = people.stream().sorted(Comparator.comparing(Person::getFirstName).reversed()).collect(Collectors.toList());
                case 2 ->
                        people = people.stream().sorted(Comparator.comparing(Person::getLastName)).collect(Collectors.toList());
                case 3 ->
                        people = people.stream().sorted(Comparator.comparing(Person::getLastName).reversed()).collect(Collectors.toList());
                case 4 ->
                        people = people.stream().sorted(Comparator.comparing(Person::getGender)).collect(Collectors.toList());
                case 5 ->
                        people = people.stream().sorted(Comparator.comparing(Person::getGender).reversed()).collect(Collectors.toList());
                case 6 ->
                        people = people.stream().sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList());
                case 7 ->
                        people = people.stream().sorted(Comparator.comparing(Person::getAge).reversed()).collect(Collectors.toList());
                default -> System.out.println("\u001B[31m" + "Nothing happened to your list." + "\u001B[0m");
            }
            return people;

        }
    }
}
