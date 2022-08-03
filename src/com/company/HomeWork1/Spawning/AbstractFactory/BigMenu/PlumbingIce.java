package com.company.Spawning.AbstractFactory.BigMenu;

import com.company.Spawning.AbstractFactory.Ice;

public class PlumbingIce implements Ice
{

    @Override
    public void freezing()
    {
        System.out.println("Пломбірне морозиво насипається!");
    }
}
