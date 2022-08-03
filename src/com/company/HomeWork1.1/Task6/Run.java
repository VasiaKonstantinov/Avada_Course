package com.company.Task6;

import java.util.Set;
import java.util.TreeSet;

public class Run
{
    public static void main(String[] args) {
        Set set = new TreeSet(new Compare());
        set.add(new Person(967546117, 34, "Міша", "Петров"));
        set.add(new Person(967146117, 22, "Іван", "Непетров"));
        set.add(new Person(967346117, 19, "Міша", "Іваненко"));
        for (Object o: set)
        {
            System.out.println(o);
        }
    }
}
