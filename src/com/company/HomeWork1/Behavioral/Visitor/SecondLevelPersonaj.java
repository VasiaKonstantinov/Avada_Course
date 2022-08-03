package com.company.Behavioral.Visitor;

public class SecondLevelPersonaj implements Personaj
{
    @Override
    public void UseSkill(Speed speed) {
        System.out.println("Швдкість: 2 рівень");
    }

    @Override
    public void UseSkill(Heal heal) {
        System.out.println("Лікування: 2 рівень");
    }
}
