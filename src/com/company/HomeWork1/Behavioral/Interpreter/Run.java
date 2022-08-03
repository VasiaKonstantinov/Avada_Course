package com.company.Behavioral.Interpreter;

public class Run
{
    public static void main(String[] args)
    {
        Skill AnySkill = getAnySkill();
        Skill HealAttack = getHealAttackSkill();
        System.out.println("Чи вміє лікувати: " + AnySkill.interpret("Лічити"));
        System.out.println("Чи вміє лічити та атакувати: " + HealAttack.interpret("Лічити"));
    }

    public static Skill getAnySkill()
    {
        Skill heal = new TerminalSkill("Лічити");
        Skill def = new TerminalSkill("Захищати");
        return new OrSkill(heal,def);
    }

    public static Skill getHealAttackSkill()
    {
        Skill heal = new TerminalSkill("Лічити");
        Skill attack = new TerminalSkill("Атакувати");
        return new AndSkill(heal,attack);
    }
}
