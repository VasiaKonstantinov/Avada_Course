package com.company.Structural.Bridge;

public class Fallout extends Game
{

    protected Fallout(Update update) {
        super(update);
    }

    @Override
    public void developUpdate()
    {
        System.out.println("Fallout скоро обновлення ");
        update.CreateUpdate();
    }

}
