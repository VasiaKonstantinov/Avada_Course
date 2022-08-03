package com.company.Spawning.AbstractFactory.CommonMenu;

import com.company.Spawning.AbstractFactory.CocaCola;
import com.company.Spawning.AbstractFactory.Ice;
import com.company.Spawning.AbstractFactory.Menu;
import com.company.Spawning.AbstractFactory.Pizza;

public class CommonMenu implements Menu
{
    @Override
    public CocaCola getCocaCola()
    {
        return null;
    }

    @Override
    public Ice getIce()
    {
        return new ChocolateIce();
    }

    @Override
    public Pizza getPizza()
    {
        return new PaperoniPizza();
    }
}
