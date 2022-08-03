package com.company.Spawning.FactoryMethod;

public class CreateBoss implements CreateEmployee
{
    @Override
    public Employee createEmployee()
    {
        return new BossWorking();
    }
}
