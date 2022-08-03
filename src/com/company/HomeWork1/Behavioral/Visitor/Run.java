package com.company.Behavioral.Visitor;

public class Run
{
    public static void main(String[] args)
    {
        AllSkill skill = new AllSkill();

        FirstLevelPersonaj firstLevelPersonaj = new FirstLevelPersonaj();
        SecondLevelPersonaj secondLevelPersonaj = new SecondLevelPersonaj();

        skill.Use(firstLevelPersonaj);
        skill.Use(secondLevelPersonaj);
    }
}
