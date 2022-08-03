package com.company.Behavioral.Iterator;

public class Run {
    public static void main(String[] args) {
        String[] skills = {"Лікувати", "Атакувати", "Захищатись"};

        Personaj personaj = new Personaj("Медик", skills);
        Iterator iterator = personaj.getIterator();
        System.out.println("Тип: " + personaj.getType());
        System.out.println("Навики: ");

        while (iterator.hasNext())
        {
            System.out.println(iterator.next().toString() + " ");
        }
    }
}
