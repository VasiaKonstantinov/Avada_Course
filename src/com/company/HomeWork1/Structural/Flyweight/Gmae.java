package com.company.Structural.Flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gmae
{
    public static void main(String[] args)
    {
        PersonajFactory personajFactory = new PersonajFactory();
        Scanner in = new Scanner(System.in);
        List<Personaj> personajs = new ArrayList<>();
        int QuantitySniper = 0;
        int QuantityMedic = 0;

        System.out.println("Введіть скільки ви хочете снайперів: ");
        QuantitySniper = in.nextInt();
        System.out.println("Введіть скільки ви хочете медиків: ");
        QuantityMedic = in.nextInt();

        for(int i = 0; i < QuantitySniper; i++)
        {
            personajs.add(personajFactory.getPersonajs("sniper"));
        }
        for(int i = 0; i < QuantityMedic; i++)
        {
            personajs.add(personajFactory.getPersonajs("medic"));
        }

        for(Personaj personaj: personajs)
        {
            personaj.StartGame();
        }
    }
}
