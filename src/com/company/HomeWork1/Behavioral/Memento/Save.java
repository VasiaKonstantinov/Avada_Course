package com.company.Behavioral.Memento;

public class Save
{
    private final String name;
    private final String type;

    public Save(String name, String type)
    {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
