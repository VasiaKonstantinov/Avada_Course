package com.company.Structural.Decorator;

public class Stormtrooper extends PersonajDecorator
{

    public Stormtrooper(Personaj personaj) {
        super(personaj);
    }

    public String Fire()
    {
        return "Вогонь!!!";
    }

    @Override
    public String UseSkills() {
        return super.UseSkills() + Fire();
    }
}
