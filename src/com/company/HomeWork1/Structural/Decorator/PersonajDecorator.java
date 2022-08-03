package com.company.Structural.Decorator;

public class PersonajDecorator implements  Personaj
{
    Personaj personaj;

    public PersonajDecorator(Personaj personaj)
    {
        this.personaj = personaj;
    }


    @Override
    public String UseSkills() {
        return personaj.UseSkills();
    }
}
