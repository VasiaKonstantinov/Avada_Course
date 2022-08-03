package com.company.Spawning.AbstractFactory;

import com.company.Spawning.AbstractFactory.BigMenu.BigMenu;

public class ZakazTwo
{
    public static void main(String[] args)
    {
        Menu bigMenu = new BigMenu();
        Ice ice = bigMenu.getIce();
        Pizza pizza = bigMenu.getPizza();
        CocaCola cocaCola = bigMenu.getCocaCola();

        System.out.println("Другий заказ початок роботи:");
        pizza.HeatingUp();
        ice.freezing();
        cocaCola.IsPoured();
    }
}
