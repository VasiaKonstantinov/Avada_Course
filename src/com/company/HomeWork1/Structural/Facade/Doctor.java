package com.company.Structural.Facade;

public class Doctor
{
    public void BeforeWork(ActiveTracker activeTracker)
    {
        if(activeTracker.isActiveHospital())
        {
            System.out.println("Лікар лікує");
        }
        else
        {
            System.out.println("Лікар відпочиває");
        }
    }
}
