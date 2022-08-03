package com.company.Spawning.AbstractFactory.BigMenu;

import com.company.Spawning.AbstractFactory.CocaCola;

public class Cola implements CocaCola
{
    @Override
    public void IsPoured()
    {
        System.out.println("Кола наливається!");
    }
}
