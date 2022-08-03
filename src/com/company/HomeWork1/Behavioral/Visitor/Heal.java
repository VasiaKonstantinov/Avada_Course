package com.company.Behavioral.Visitor;

public class Heal implements Skill
{
    @Override
    public void Use(Personaj personaj) {
        personaj.UseSkill(this);
    }
}
