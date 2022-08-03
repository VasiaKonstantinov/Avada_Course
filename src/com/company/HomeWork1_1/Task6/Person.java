package com.company.HomeWork1_1.Task6;

public class Person //implements Comparable<Person>
{
    int number;
    int age;
    String name;
    String FirstName;

    public Person(int number, int age, String name, String firstName) {
        this.number = number;
        this.age = age;
        this.name = name;
        FirstName = firstName;
    }

//    @Override
//    public int compareTo(Person o)
//    {
//        int i = this.number - o.number;
//        return  i;
//    }

    @Override
    public String toString() {
        return "Person{" +
                "number=" + number +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", FirstName='" + FirstName + '\'' +
                '}';
    }
}
