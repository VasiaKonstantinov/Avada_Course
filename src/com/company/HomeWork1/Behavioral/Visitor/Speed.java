package com.company.Behavioral.Visitor;

public class Speed implements Skill
{
    @Override
    public void Use(Personaj personaj)
    {
        personaj.UseSkill(this);
    }
}
