package com.company.Structural.Decorator;

public class Sniper extends PersonajDecorator
{

    public Sniper(Personaj personaj)
    {
        super(personaj);
    }

    public String Skop()
    {
        return "Цілюсь!!!";
    }

    @Override
    public String UseSkills() {
        return super.UseSkills() + Skop();
    }
}
