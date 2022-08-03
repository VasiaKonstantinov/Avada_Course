package com.company.Spawning.AbstractFactory.BigMenu;

import com.company.Spawning.AbstractFactory.CocaCola;
import com.company.Spawning.AbstractFactory.Ice;
import com.company.Spawning.AbstractFactory.Menu;
import com.company.Spawning.AbstractFactory.Pizza;

public class BigMenu implements Menu
{
    @Override
    public CocaCola getCocaCola()
    {
        return new Cola();
    }

    @Override
    public Ice getIce()
    {
        return new PlumbingIce();
    }

    @Override
    public Pizza getPizza()
    {
        return new CheesePizza();
    }
}
