package com.company.Behavioral.TemplateMethod;

public class Game
{
    public static void main(String[] args) {
    PersonajTemple sniper = new Sniper();
    PersonajTemple medic = new Medic();

    System.out.println("=====================================");
    sniper.ShowStats();
    System.out.println("=====================================");
    medic.ShowStats();
    System.out.println("=====================================");
    }
}
