package com.company.Behavioral.Strategy;

public class Personaj
{
    Skills skills;

    public void setSkills(Skills skills)
    {
        this.skills = skills;
    }

    public void useSkill()
    {
        skills.UseSkills();
    }
}
