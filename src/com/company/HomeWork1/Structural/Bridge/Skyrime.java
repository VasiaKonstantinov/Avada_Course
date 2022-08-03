package com.company.Structural.Bridge;

public class Skyrime extends Game
{

    protected Skyrime(Update update)
    {
        super(update);
    }

    @Override
    public void developUpdate()
    {
        System.out.println("Skyrime коро обновлення ");
        update.CreateUpdate();
    }
}
