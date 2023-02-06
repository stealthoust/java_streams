package org.example.practise;

import org.example.Gender;
import org.example.Person;

import java.util.List;
import java.util.stream.Collectors;

public class Filter {

    public static class Static {

        public static void printMessage(){
            System.out.println("0. Filter by gender (women)");
            System.out.println("1. Filter by gender (men)");
            System.out.println("2. Filter by age (above 18)");
            System.out.println("3. Filter by age (below 18)");
        }

        public static List<Person> filterList(List<Person> people,int number){
            switch (number) {
                case 0:
                    people=people.stream().filter(person -> person.getGender().equals(Gender.FEMALE)).collect(Collectors.toList());

                    break;
                case 1:
                    people=people.stream().filter(person -> person.getGender().equals(Gender.MALE)).collect(Collectors.toList());
                    break;
                case 2:
                    people=people.stream().filter(person -> person.getAge()>=18).collect(Collectors.toList());
                    break;
                case 3:
                    people=people.stream().filter(person -> person.getAge()<18).collect(Collectors.toList());
                    break;
                default:
                    System.out.println("\u001B[31m"+"Nothing happened to your list."+"\u001B[0m");
                    break;
            }
            return people;

        }
    }
}
