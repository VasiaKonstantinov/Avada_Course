package com.company.Behavioral.State;

public class Personaj
{
    Skills skills;

    public void setSkills(Skills skills)
    {
        this.skills = skills;
    }

    public void NextSkill()
    {
        if(skills instanceof Def)
        {
           setSkills(new Attac());
        }
        else if(skills instanceof Attac)
        {
            setSkills(new Heal());
        }
        else if(skills instanceof Heal)
        {
            setSkills(new Def());
        }
    }

    public void UseSkill()
    {
        skills.UseSkills();
    }
}
