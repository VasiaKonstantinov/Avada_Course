package com.company.Behavioral.Observer;

import java.util.List;

public class Player implements TypesAndPlayers
{
public String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public void FreeTypes(List<String> types) {
        System.out.println(name + " на данний момент ви можете вибрати такі класи перснажів:\n" + types);
        System.out.println("=============================================================================");
    }
}
