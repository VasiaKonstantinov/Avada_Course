package com.company.Behavioral.Interpreter;

public class AndSkill implements Skill
{
    private Skill skill_one;
    private Skill skill_two;

    public AndSkill(Skill skill_one, Skill skill_two) {
        this.skill_one = skill_one;
        this.skill_two = skill_two;
    }

    @Override
    public boolean interpret(String skill)
    {
        return skill_one.interpret(skill) && skill_two.interpret(skill);
    }
}
