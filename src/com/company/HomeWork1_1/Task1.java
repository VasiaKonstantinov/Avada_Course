package com.company.HomeWork1_1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1
{
    public static void main(String[] args) {
        List list_for_task1 = new ArrayList();
        Add(list_for_task1);
    }

    public static void Add(List list) {
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

            for (int i = 0; i < list.size(); i++)
            {
                System.out.println(i + 1 + ": " + list.get(i));
            }
            Add(list);
        }
        else
        {
            list.add(number);
            Add(list);
        }

    }
}
