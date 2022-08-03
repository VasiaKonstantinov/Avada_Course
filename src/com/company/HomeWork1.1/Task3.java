package com.company;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Task3
{
    public static void main(String[] args)
    {
        Set set_for_task3 = new HashSet();
        Add(set_for_task3);
    }

    public static void Add(Set set) {
        Scanner in = new Scanner(System.in);
        String number;

        System.out.println("Введіть номер машини: ");
        number = in.next();

        if (number.contains("СТОП"))
        {
            System.out.println("Роботу закінчено");
        }
        else if (number.contains("СПИСОК"))
        {
            System.out.println("Список номерів машин: ");

            for (Object o: set)
            {
                System.out.println(o);
            }
            Add(set);
        }
        else
        {
            set.add(number);
            Add(set);
        }

    }
}
