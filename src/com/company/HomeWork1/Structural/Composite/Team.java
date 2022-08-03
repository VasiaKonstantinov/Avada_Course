package com.company.Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class Team implements  Personaj
{
    private List<Personaj> personajs = new ArrayList<Personaj>();

    public void addPersonaj(Personaj personaj)
    {
        personajs.add(personaj);
    }

    public void removePersonaj(Personaj personaj)
    {
        personajs.remove(personaj);
    }

    @Override
    public void StartGame() {
        System.out.println("\n"+"Начало гри:"+"\n");

        for(Personaj personaj: personajs)
        {
            personaj.StartGame();
        }
    }
}
