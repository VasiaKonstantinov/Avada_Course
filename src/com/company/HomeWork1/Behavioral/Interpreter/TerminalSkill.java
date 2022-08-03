package com.company.Behavioral.Interpreter;

public class TerminalSkill implements Skill
{
    private String data;

    public TerminalSkill(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String skill) {
        if(skill.contains(data))
        {return true;}
         return false;
    }
}
