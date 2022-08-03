package com.company.HomeWork1_1.Task5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Run
{
    public static void main(String[] args)
    {
        List array = new ArrayList<>();
        List linked = new LinkedList();

        random(linked);
        random(array);

        System.out.println("Добавлення 1 елемента в кінець в ArrayList:");
        addLast(array);
        System.out.println("Добавлення 1 елемента в кінець в LinkedList:");
        addLast(linked);

        System.out.println("Добавлення 1 елемента в середину в ArrayList:");
        addMedium(array);
        System.out.println("Добавлення 1 елемента в середину в LinkedList:");
        addMedium(linked);

        System.out.println("Одерження елемента в кінці в ArrayList:");
        getLast(array);
        System.out.println("Одерження елемента в кінці в LinkedList:");
        getLast(linked);

        System.out.println("Одерження елемента в середині в ArrayList:");
        getMedium(array);
        System.out.println("Одерження елемента в середині в LinkedList:");
        getMedium(linked);

        System.out.println("Видалення елемента в кінці в ArrayList:");
        removeLast(array);
        System.out.println("Видалення елемента в кінці в LinkedList:");
        removeLast(linked);

        System.out.println("Видалення елемента в середині в ArrayList:");
        removeMedium(array);
        System.out.println("Видалення елемента в середині в LinkedList:");
        removeMedium(linked);
    }



    private static void random(List list)
    {

        for (int i = 0; i < 1000000; i++)
        {
            list.add(Math.round(Math.random()*100));
        }

    }

    private static void addLast(List list)
    {
        long startTime = System.currentTimeMillis();
        list.add(1);
        long endTime = System.currentTimeMillis();
        System.out.println((endTime-startTime) + "ms");
    }

    private static void addMedium(List list)
    {
        long startTime = System.currentTimeMillis();
        list.add(500000, 1);
        long endTime = System.currentTimeMillis();
        System.out.println((endTime-startTime) + "ms");
    }

    private static void getLast(List list)
    {
        long startTime = System.currentTimeMillis();
        System.out.println("Останє число: " + list.get(list.size()-1));
        long endTime = System.currentTimeMillis();
        System.out.println((endTime-startTime) + "ms");
    }

    private static void getMedium(List list)
    {
        long startTime = System.currentTimeMillis();
        System.out.println("Середнє число: " + list.get(500001));
        long endTime = System.currentTimeMillis();
        System.out.println((endTime-startTime) + "ms");
    }

    private static void removeLast(List list)
    {
        long startTime = System.currentTimeMillis();
        list.remove(list.size()-1);
        long endTime = System.currentTimeMillis();
        System.out.println((endTime-startTime) + "ms");
    }

    private static void removeMedium(List list)
    {
        long startTime = System.currentTimeMillis();
        list.remove(500001);
        long endTime = System.currentTimeMillis();
        System.out.println((endTime-startTime) + "ms");
    }
}
