package com.company.Structural.Bridge;

public abstract class Game
{
    protected Update update;

    protected Game(Update update)
    {
        this.update = update;
    }

    public abstract void developUpdate();

}
