package com.company.Spawning.AbstractFactory.CommonMenu;

import com.company.Spawning.AbstractFactory.Pizza;

public class PaperoniPizza implements Pizza
{

    @Override
    public void HeatingUp()
    {
        System.out.println("Піца папероні розігрівається");
    }
}
