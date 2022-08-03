package com.company.Spawning.AbstractFactory;

import com.company.Spawning.AbstractFactory.CommonMenu.CommonMenu;

public class ZakazOne
{
    public static void main(String[] args)
    {
        Menu common = new CommonMenu();
        Ice ice = common.getIce();
        Pizza pizza = common.getPizza();

        System.out.println("Перший заказ початок роботи: ");
        pizza.HeatingUp();
        ice.freezing();
    }
}
