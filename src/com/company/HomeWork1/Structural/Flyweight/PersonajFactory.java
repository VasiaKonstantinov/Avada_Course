package com.company.Structural.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class PersonajFactory
{
    private static final Map<String, Personaj> personajs = new HashMap<>();

    public Personaj getPersonajs(String type)
    {
        Personaj personaj = personajs.get(type);
        if(personaj == null)
        {
            switch (type)
            {
                case "sniper":
                    System.out.println("Найнято снайпера.");
                    personaj = new Sniper();
                    break;
                case "medic":
                    System.out.println("Найнято медика.");
                    personaj = new Medic();
                    break;
            }
            personajs.put(type,personaj);
        }
        return personaj;
    }
}
