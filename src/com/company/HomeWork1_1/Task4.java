package com.company.HomeWork1_1;

import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        Map map_for_task3 = new HashMap<>();
        Set Owner = new HashSet();
        Set Car = new HashSet();
        Add(map_for_task3,Owner,Car);
    }

    public static void Add(Map map,Set setOwner, Set setCar)
    {

            Scanner in = new Scanner(System.in);
            String owner;
            String number;

            System.out.println("Введіть номер машини: ");
            number = in.next();

            if (number.contains("СТОП"))
            {
                System.out.println("Роботу закінчено");
            }

            else if (number.contains("МАШИНИ"))
            {
                System.out.println("Список номерів машин: ");
                for (Object o: setCar)
                {
                    System.out.println(o);
                }
                Add(map,setOwner,setCar);
            }

            else if (number.contains("ВЛАСНИКИ"))
            {
                System.out.println("Список власників машин: ");
                for (Object o: setOwner)
                {
                    System.out.println(o);
                }
                Add(map,setOwner,setCar);
            }

            else if (number.contains("СПИСОК"))
            {
                System.out.println("Список номерів машин та їх власників: ");
                Set set = map.entrySet();
                for (Object o: set)
                {
                    System.out.println(o);
                }
                Add(map,setOwner,setCar);
            }
            else
            {
                System.out.println("Введіть власника: ");
                owner = in.next();
                map.put(number, owner);
                setCar.add(number);
                setOwner.add(owner);
                Add(map,setOwner,setCar);
            }
    }
}
