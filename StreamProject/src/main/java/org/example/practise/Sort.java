package org.example.practise;

import org.example.Gender;
import org.example.Person;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sort {

    public static class Static{

        public static void printMessage(){
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
                case 0:
                    people=people.stream().sorted(Comparator.comparing(Person::getFirstName)).collect(Collectors.toList());
                    break;
                case 1:
                    people=people.stream().sorted(Comparator.comparing(Person::getFirstName).reversed()).collect(Collectors.toList());
                    break;
                case 2:
                    people=people.stream().sorted(Comparator.comparing(Person::getLastName)).collect(Collectors.toList());
                    break;
                case 3:
                    people=people.stream().sorted(Comparator.comparing(Person::getLastName).reversed()).collect(Collectors.toList());
                    break;
                case 4:
                    people=people.stream().sorted(Comparator.comparing(Person::getGender)).collect(Collectors.toList());
                    break;
                case 5:
                    people=people.stream().sorted(Comparator.comparing(Person::getGender).reversed()).collect(Collectors.toList());
                    break;
                case 6:
                    people=people.stream().sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList());
                    break;
                case 7:
                    people=people.stream().sorted(Comparator.comparing(Person::getAge).reversed()).collect(Collectors.toList());
                    break;
                default:
                    System.out.println("\u001B[31m"+"Nothing happened to your list."+"\u001B[0m");
                    break;
            }
            return people;

        }
    }
}
