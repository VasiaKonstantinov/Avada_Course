package com.company.Behavioral.Strategy;

public class Game
{
    public static void main(String[] args)
    {
        Personaj personaj = new Personaj();
        personaj.setSkills(new Def());
        personaj.useSkill();
        personaj.setSkills(new Attac());
        personaj.useSkill();
        personaj.setSkills(new Heal());
        personaj.useSkill();
        personaj.setSkills(new Def());
        personaj.useSkill();

    }
}
