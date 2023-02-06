package org.example;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Person {
    int id;
    String firstName;
    String lastName;
    int age;
    Gender gender;

    public Person() {
    }

    public Person(int id, String firstName, String lastName, int age, Gender gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public Person(String firstName, String lastName, int age, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public static List<Person> getPeople(){
        return List.of(
                new Person(1, "John", "Doe", 30, Gender.MALE),
        new Person(2, "Jane", "Doe", 25, Gender.FEMALE),
        new Person(3, "Michael", "Johnson", 35, Gender.MALE),
        new Person(4, "Emily", "Smith", 27, Gender.FEMALE),
        new Person(5, "William", "Brown", 32, Gender.MALE),
        new Person(6, "Sarah", "Davis", 29, Gender.FEMALE),
        new Person(7, "David", "Miller", 31, Gender.MALE),
        new Person(8, "Ava", "Wilson", 16, Gender.FEMALE),
        new Person(9, "James", "Anderson", 34, Gender.MALE),
        new Person(10, "Olivia", "Thomas", 17, Gender.FEMALE),
        new Person(11, "Christopher", "Jackson", 33, Gender.MALE),
        new Person(12, "Isabella", "White", 24, Gender.FEMALE),
        new Person(13, "Joseph", "Harris", 16, Gender.MALE),
        new Person(14, "Mia", "Martin", 23, Gender.FEMALE),
        new Person(15, "Richard", "Thompson", 17, Gender.MALE),
        new Person(16, "Charlotte", "Garcia", 22, Gender.FEMALE),
        new Person(17, "Charles", "Martinez", 39, Gender.MALE),
        new Person(18, "Sophia", "Robinson", 21, Gender.FEMALE),
        new Person(19, "Thomas", "Clark", 40, Gender.MALE),
        new Person(20, "Amelia", "Rodriguez", 20, Gender.FEMALE)
        );
    }
    public static List<Person> getRandomPeople(int number){
        if(number<2) return null;
        Faker faker=new Faker();
        Random random=new Random();
        List<Person> list=new ArrayList<>();

        for (int i=0;i<number;i++) list.add(new Person(i,faker.name().firstName(),faker.name().lastName(), (random.nextInt(60-10)+10), Gender.values()[random.nextInt(2)]));
        return list;
    }
}
