package com.company.Behavioral.Visitor;

public class FirstLevelPersonaj implements Personaj{
    @Override
    public void UseSkill(Speed speed) {
        System.out.println("Швдкість: 1 рівень");
    }

    @Override
    public void UseSkill(Heal heal) {
        System.out.println("Лікування: 1 рівень");

    }
}
