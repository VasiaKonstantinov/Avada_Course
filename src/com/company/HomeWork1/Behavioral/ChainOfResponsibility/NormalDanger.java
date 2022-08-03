package com.company.Behavioral.ChainOfResponsibility;

public class NormalDanger extends DangerReport
{
    public NormalDanger(int priority)
    {
        super(priority);
    }

    @Override
    public void write(String message)
    {
        System.out.println("Відправляю не велике підкріплення." + message);
    }
}
