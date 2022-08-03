package com.company.Structural.Decorator;

public class StormtrooperMedic implements Personaj
{


    public String Heal(){return "Ліквати!!!";}

    @Override
    public String UseSkills() {
        return Heal();
    }
}
