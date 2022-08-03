package com.company.Behavioral.Visitor;

public class AllSkill implements Skill
{
    Skill[] allSkill;

    public  AllSkill()
    {
        this.allSkill = new Skill[]{
                new Heal(),
                new Speed()
        };
    }
    @Override
    public void Use(Personaj personaj) {
        for(Skill skill: allSkill)
        {
            skill.Use(personaj);
        }
    }
}
