package com.company.Behavioral.ChainOfResponsibility;

public class ImportantDanger extends DangerReport
{
    public ImportantDanger(int priority)
    {
        super(priority);
    }

    @Override
    public void write(String message)
    {
        System.out.println("Відправляю всіх до вас" + message);
    }
}
