package com.company.Behavioral.Memento;

public class Personaj
{
    private String name;
    private String type;

    public void setPersonaj(String type, String name) {
        this.type = type;
        this.name = name;
        System.out.println("Створено нового персонажа:");
    }

    Save save()
    {
        return new Save(name,type);
    }

    public void load(Save save)
    {
    name = save.getName();
    type = save.getType();
    }

    @Override
    public String toString() {
        return "Personaj{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
