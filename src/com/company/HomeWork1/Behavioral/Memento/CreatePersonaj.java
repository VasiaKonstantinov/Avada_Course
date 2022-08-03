package com.company.Behavioral.Memento;

public class CreatePersonaj
{
    public static void main(String[] args) {
        Personaj personaj = new Personaj();
        GameServer gameServer = new GameServer();

        personaj.setPersonaj("Снайпер","Джон");
        System.out.println(personaj);
        gameServer.setSave(personaj.save());
        personaj.setPersonaj("Снайпер","Не Джон");
        System.out.println(personaj);
        personaj.load(gameServer.getSave());
        System.out.println("Загружено минулого персонажа");
        System.out.println(personaj);

    }
}
