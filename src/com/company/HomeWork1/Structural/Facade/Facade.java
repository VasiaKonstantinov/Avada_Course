package com.company.Structural.Facade;

public class Facade
{
    Doctor doctor = new Doctor();
    Hospital hospital = new Hospital();
    ActiveTracker activeTracker = new ActiveTracker();

    public void Work()
    {
        activeTracker.Choice();
        hospital.Heal();
        doctor.BeforeWork(activeTracker);
    }
}
