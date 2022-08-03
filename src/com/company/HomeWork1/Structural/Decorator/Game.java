package com.company.Structural.Decorator;

public class Game
{
    public static void main(String[] args)
    {
        Personaj personaj = new Sniper(new Stormtrooper((new StormtrooperMedic())));

        System.out.println(personaj.UseSkills());
    }

}
