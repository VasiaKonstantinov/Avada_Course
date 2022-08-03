package com.company.Behavioral.TemplateMethod;

public abstract class PersonajTemple
{
    public void ShowStats()
    {
        ShowType();
        System.out.println("Hp: 100");
        System.out.println("Damage: 25");
    }
    public abstract void ShowType();
}
