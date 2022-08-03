package com.company.Architectural.MVP;

public class View
{
    public static void printInfo(String type,int Hp)
    {
        System.out.println("Персонаж:");
        System.out.println("Тип: " + type + "\n" + "Кількість здоров'я: " + Hp);
    }
}
