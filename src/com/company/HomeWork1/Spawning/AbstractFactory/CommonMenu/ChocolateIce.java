package com.company.Spawning.AbstractFactory.CommonMenu;

import com.company.Spawning.AbstractFactory.Ice;

public class ChocolateIce implements Ice
{

    @Override
    public void freezing()
    {
        System.out.println("Шокладне морозиво насипається");
    }
}
