package com.company.Behavioral.ChainOfResponsibility;

public class MediumDanger extends DangerReport
{
    public MediumDanger(int priority)
    {
        super(priority);
    }

    @Override
    public void write(String message)
    {
        System.out.println("Відпраляю підкріплення" + message);
    }
}
