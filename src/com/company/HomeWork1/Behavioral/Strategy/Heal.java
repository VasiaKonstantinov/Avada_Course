package com.company.Behavioral.Strategy;

public class Heal implements Skills
{
    @Override
    public void UseSkills()
    {
        System.out.println("Лікуюсь");
    }
}
