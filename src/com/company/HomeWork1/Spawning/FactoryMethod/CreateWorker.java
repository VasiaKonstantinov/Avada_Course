package com.company.Spawning.FactoryMethod;

public class CreateWorker implements CreateEmployee
{
    @Override
    public Employee createEmployee()
    {
        return new WorkerWorking();
    }
}
