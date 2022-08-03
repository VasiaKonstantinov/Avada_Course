package com.company.Behavioral.State;

public class Game
{
    public static void main(String[] args)
    {
    Skills skills = new Def();
    Personaj personaj = new Personaj();

    personaj.setSkills(skills);
        for (int i = 0; i < 10; i++)
        {
            personaj.UseSkill();
            personaj.NextSkill();
        }

    }
}
